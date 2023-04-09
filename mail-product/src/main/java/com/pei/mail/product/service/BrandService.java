package com.pei.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pei.common.utils.PageUtils;
import com.pei.mail.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author 夏沫止水
 * @email HeJieLin@mail.com
 * @date 2020-05-22 19:00:18
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}

