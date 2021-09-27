package com.muliulan.mll.dada.export_cart;

public class CartServiceUtil {

    /**
     * 跳转到购物车页面
     * @param param1
     * @param param2
     */
    public static void navigateCartPage(String param1, String param2){
//        ARouter.getInstance()
//                .build(CartRouterTable.PATH_PAGE_CART)
//                .withString("key1",param1)
//                .withString("key2",param2)
//                .navigation();
    }

    /**
     * 获取服务
     * @return
     */
    public static ICartService getService(){
//        return (ICartService) ARouter.getInstance().build(CartRouterTable.PATH_SERVICE_CART).navigation();
        return null;
    }

    /**
     * 获取购物车中商品数量
     * @return
     */
    public static CartInfo getCartProductCount(){
        return getService().getProductCountInCart();
    }
}