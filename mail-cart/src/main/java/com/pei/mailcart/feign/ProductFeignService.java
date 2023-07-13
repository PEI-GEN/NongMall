package com.pei.mailcart.feign;

import com.pei.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.List;

@FeignClient("mail-product")
public interface ProductFeignService {
    /**
     * 信息
     */
    @RequestMapping("product/skuinfo/info/{skuId}")
    R getInfo(@PathVariable("skuId") Long skuId);


    @GetMapping(value = "product/skusaleattrvalue/stringList/{skuId}")
    List<String> getSkuSaleAttrValues(@PathVariable("skuId") Long skuId);

    /**
     * 根据skuId查询当前商品的价格
     * @param skuId
     * @return
     */
    @GetMapping(value = "product/skuinfo/{skuId}/price")
    BigDecimal getPrice(@PathVariable("skuId") Long skuId);
}
