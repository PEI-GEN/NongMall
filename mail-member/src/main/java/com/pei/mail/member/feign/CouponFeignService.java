package com.pei.mail.member.feign;

import com.pei.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mail-coupon")
public interface CouponFeignService {
    @RequestMapping("coupon/coupon/memeber/list")
    public R memberCoupons();
}
