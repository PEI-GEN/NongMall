package com.pei.mail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pei.common.utils.PageUtils;
import com.pei.mail.coupon.entity.SeckillSessionEntity;

import java.util.List;
import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author PEIGEN
 * @email PEIGEN@163.com
 * @date 2023-03-07 19:54:31
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<SeckillSessionEntity> getLates3DaySession();
}

