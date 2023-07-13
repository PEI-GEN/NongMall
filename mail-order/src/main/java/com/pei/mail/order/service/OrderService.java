package com.pei.mail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pei.common.to.mq.SeckillOrderTo;
import com.pei.common.utils.PageUtils;
import com.pei.mail.order.entity.OrderEntity;
import com.pei.mail.order.vo.*;

import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * 订单
 *
 * @author PEIGEN
 * @email PEIGEN@163.com
 * @date 2023-03-07 21:03:33
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);

    OrderConfirmVo confirmOrder() throws ExecutionException, InterruptedException;

    SubmitOrderResponseVo submitOrder(OrderSubmitVo vo);

    OrderEntity getOrderByOrderSn(String orderSn);

    void closeOrder(OrderEntity orderEntity);

    PayVo getOrderPay(String orderSn);

    PageUtils queryPageWithItem(Map<String, Object> params);

    String handlePayResult(PayAsyncVo asyncVo);

    void createSeckillOrder(SeckillOrderTo orderTo);

//    String asyncNotify(String notifyData);
}

