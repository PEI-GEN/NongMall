package com.pei.mail.product.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pei.common.utils.PageUtils;
import com.pei.common.utils.Query;
import com.pei.mail.product.dao.CategoryDao;
import com.pei.mail.product.entity.CategoryBrandRelationEntity;
import com.pei.mail.product.entity.CategoryEntity;
import com.pei.mail.product.service.CategoryBrandRelationService;
import com.pei.mail.product.service.CategoryService;
//import com.pei.mail.product.vo.Catelog2Vo;
//import org.redisson.api.RLock;
//import org.redisson.api.RReadWriteLock;
//import org.redisson.api.RedissonClient;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
//import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    private Map<String,Object> cache = new HashMap<>();

     @Resource
     private CategoryDao categoryDao;

     @Autowired
     CategoryBrandRelationService categoryBrandRelationService;

//    @Resource
//    private StringRedisTemplate stringRedisTemplate;
//
//    @Autowired
//    private RedissonClient redissonClient;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {

        //1、查询出所有分类
        List<CategoryEntity> entities = super.baseMapper.selectList(null);

        //2、组装成父子的树形结构

        //2.1)、找到所有一级分类
        List<CategoryEntity> level1Menus=entities.stream().filter(categoryEntity->
                categoryEntity.getParentCid()==0
        ).map((menu)->{
            menu.setChildren(getChildren(menu,entities));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()!=null?menu1.getSort():0)-(menu2.getSort()!=null?menu2.getSort():0);
        }).collect(Collectors.toList());


        return level1Menus;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO 需要检查菜单是否被其他地方引用
        baseMapper.deleteBatchIds(asList);
    }

    @Override
    public Long[] findCatelogPath(Long catelogId) {
        List<Long> paths = new ArrayList<>();
        List<Long> parentPath = findParentPath(catelogId, paths);

        Collections.reverse(paths);
        return parentPath.toArray(new Long[parentPath.size()]);
    }

    @Override
    public void updateCascade(CategoryEntity category) {
        this.updateById(category);
        categoryBrandRelationService.updateCategory(category.getCatId(),category.getName());
    }

    private List<Long> findParentPath(Long catelogId, List<Long> paths) {
        paths.add(catelogId);
        //这是mybatis自带的函数：根据id查询
        CategoryEntity byId=this.getById(catelogId);
        if(byId.getParentCid()!=0){
            findParentPath(byId.getParentCid(),paths);
        }
        return paths;
    }

    //递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> children=all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid()==root.getCatId();
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getChildren(categoryEntity,all));
            return categoryEntity;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()!=null?menu1.getSort():0)-(menu2.getSort()!=null?menu2.getSort():0);
        }).collect(Collectors.toList());
        return children;
    }


}