package com.muliulan.mll.dada;

import android.content.Context;

import com.muliulan.mll.dada.export_cart.CartInfo;
import com.muliulan.mll.dada.export_cart.ICartService;

//@Route(path = CartRouterTable.PATH_SERVICE_CART)
public class CartServiceImpl implements ICartService {

    @Override
    public CartInfo getProductCountInCart() {
        //这里实际项目中 应该是 请求接口 或查询数据库
        CartInfo cartInfo = new CartInfo();
        cartInfo.productCount = 666;
        return cartInfo;
    }

    public void init(Context context) {
        //初始化工作，服务注入时会调用，可忽略
    }
}
