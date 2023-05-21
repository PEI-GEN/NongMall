package com.pei.mail.search.feign;

import com.pei.common.utils.R;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClient;


@FeignClient("mail-product")
public interface ProductFeignService {
    @GetMapping("/product/attr/info/{attrId}")
    R attrInfo(@PathVariable("attrId") Long attrId);
}
