package com.muliulan.mll.xi_gua_tong_bu

/**
 *    @author : zhaoCS
 *    date    : 2022/2/102:17 下午
 *    desc    :
 */
@Mappable(["look"])
data class Adata(
    @PrimaryKey()
    var a: String,
    @MappableKey("ss")
    var ss: String
)