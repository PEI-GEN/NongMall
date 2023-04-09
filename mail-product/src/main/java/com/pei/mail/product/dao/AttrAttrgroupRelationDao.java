package com.pei.mail.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pei.mail.product.entity.AttrAttrgroupRelationEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 属性&属性分组关联
 * 
 * @author 夏沫止水
 * @email HeJieLin@mail.com
 * @date 2020-05-22 19:00:18
 */
@Mapper
public interface AttrAttrgroupRelationDao extends BaseMapper<AttrAttrgroupRelationEntity> {
    void deleteBatchRelation(@Param("entities") List<AttrAttrgroupRelationEntity> entities);
}
