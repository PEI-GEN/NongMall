package com.pei.mail.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pei.mail.product.entity.AttrGroupEntity;
//import com.pei.mail.product.vo.SpuItemAttrGroupVo;
import com.pei.mail.product.vo.SpuItemAttrGroupVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 属性分组
 * 
 * @author 夏沫止水
 * @email HeJieLin@mail.com
 * @date 2020-05-22 19:00:18
 */
@Mapper
@Repository
public interface AttrGroupDao extends BaseMapper<AttrGroupEntity> {
    List<SpuItemAttrGroupVo> getAttrGroupWithAttrsBySpuId(@Param("spuId") Long spuId, @Param("catalogId") Long catalogId);
}
