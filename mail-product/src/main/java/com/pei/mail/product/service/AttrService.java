package com.pei.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pei.common.utils.PageUtils;
import com.pei.mail.product.entity.AttrEntity;
import com.pei.mail.product.vo.AttrGroupRelationVo;
import com.pei.mail.product.vo.AttrRespVo;
import com.pei.mail.product.vo.AttrVo;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author PEIGEN
 * @email HeJieLin@mail.com
 * @date 2020-05-22 19:00:18
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveAttr(AttrVo attr);

    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);

    AttrRespVo getAttrInfo(Long attrId);

    void updateAttrById(AttrVo attr);

    /**
     * 根据分组id找到关联的所有属性
     *
     * @param attrgroupId
     * @return
     */
    List<AttrEntity> getRelationAttr(Long attrgroupId);

    void deleteRelation(AttrGroupRelationVo[] vos);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);

    /**
     * 在指定的所有属性集合里面，挑出检索属性
     *
     * @param attrIds
     * @return
     */
    List<Long> selectSearchAttrs(List<Long> attrIds);

    void updateAttr(AttrVo attr);

    List<Long> selectSearchAttrIds(List<Long> attrIds);
}

