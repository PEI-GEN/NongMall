package com.pei.mailcart.service;

import com.pei.mailcart.vo.CartItemVo;
import com.pei.mailcart.vo.CartVo;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface CartService {

    CartItemVo getCartItem(Long skuId);

    CartItemVo addToCart(Long skuId, Integer num) throws ExecutionException, InterruptedException;

    CartVo getCart() throws ExecutionException, InterruptedException;

    /**
     * 清空购物车的数据
     * @param cartKey
     */
    public void clearCartInfo(String cartKey);

    void checkItem(Long skuId, Integer checked);

    void changeItemCount(Long skuId, Integer num);

    void deleteIdCartInfo(Integer skuId);

    List<CartItemVo> getUserCartItems();
}
