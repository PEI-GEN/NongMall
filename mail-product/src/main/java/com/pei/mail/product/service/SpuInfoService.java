package com.pei.mail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pei.common.utils.PageUtils;
import com.pei.mail.product.entity.SpuInfoDescEntity;
import com.pei.mail.product.entity.SpuInfoEntity;
import com.pei.mail.product.vo.SpuSaveVo;

import java.util.Map;

/**
 * spu信息
 *
 * @author PEIGEN
 * @email PEIGEN@163.com
 * @date 2023-03-07 21:24:58
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity infoEntity);

    PageUtils queryPageByCondition(Map<String, Object> params);

    /**
     * 商品上架
     * @param spuId
     */
    void up(Long spuId);

    SpuInfoEntity getSpuInfoBySkuId(Long skuId);
}

