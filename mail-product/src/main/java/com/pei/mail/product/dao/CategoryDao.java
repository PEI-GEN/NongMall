package com.pei.mail.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pei.mail.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author PEIGEN
 * @email HeJieLin@mail.com
 * @date 2020-05-22 19:00:18
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
