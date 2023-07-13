package com.pei.mail.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pei.mail.product.entity.AttrEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品属性
 * 
 * @author PEIGEN
 * @email HeJieLin@mail.com
 * @date 2020-05-22 19:00:18
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
    List<Long> selectSearchAttrIds(@Param("attrIds") List<Long> attrIds);
}
