package com.muliulan.mll.xi_gua_tong_bu

/**
 * 标注在class上，用来识别这个类是不是可以被处理。
 * 其中mappingSpace是命名空间，表示是“一类”数据，可以和数据库表名对比理解，mappingSpace就是tableName。
 * */
annotation class Mappable(val mappingSpaces: Array<String>)


/**
 * 标记在字段上，被标记的字段作为Model对象的唯一标识。
 * mappingSpace+PrimaryKey的值，就是在映射关系中的唯一业务标识。
 * */
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class PrimaryKey


/**
 * 标注在字段上，需要被映射对应的字段
 * */
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class MappableKey(val value: String)



