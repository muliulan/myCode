package com.muliulan.mll.dada.export_cart;

public interface ICartService {//    extends IProvider


    /**
     * 获取购物车中商品数量
     * @return
     */
    CartInfo getProductCountInCart();
}