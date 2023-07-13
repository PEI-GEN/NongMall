package com.pei.mail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pei.common.to.OrderTo;
import com.pei.common.to.mq.StockLockedTo;
import com.pei.common.utils.PageUtils;
import com.pei.mail.ware.entity.WareSkuEntity;
import com.pei.mail.ware.vo.SkuHasStockVo;
import com.pei.mail.ware.vo.WareSkuLockVo;

import java.util.List;
import java.util.Map;

/**
 * 商品库存
 *
 * @author PEIGEN
 * @email PEIGEN@163.com
 * @date 2023-03-07 21:04:38
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void addStock(Long skuId, Long wareId, Integer skuNum);

    List<SkuHasStockVo> getSkuHasStock(List<Long> skuIds);

    boolean orderLockStock(WareSkuLockVo vo);

    /**
     * 解锁库存
     * @param to
     */
    void unlockStock(StockLockedTo to);

    /**
     * 解锁订单
     * @param orderTo
     */
    void unlockStock(OrderTo orderTo);
}

