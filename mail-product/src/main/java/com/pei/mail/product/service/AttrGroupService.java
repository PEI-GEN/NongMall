package com.pei.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pei.common.utils.PageUtils;
import com.pei.mail.product.entity.AttrGroupEntity;
import com.pei.mail.product.vo.AttrGroupWithAttrsVo;
//import com.pei.mail.product.vo.AttrGroupWithAttrsVo;
//import com.pei.mail.product.vo.SpuItemAttrGroupVo;

import java.util.List;
import java.util.Map;

/**
 * 属性分组
 *
 * @author 夏沫止水
 * @email HeJieLin@mail.com
 * @date 2020-05-22 19:00:18
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPage(Map<String, Object> params, Long catelogId);

    List<AttrGroupWithAttrsVo> getAttrGroupWithAttrsByCatelogId(Long catelogId);
}

