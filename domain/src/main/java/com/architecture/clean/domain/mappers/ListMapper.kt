package com.architecture.clean.domain.mappers

/**
 * Created by Maxim Bircu on 11/29/17.
 */

object ListMapper {
    fun <T, R> map(list: List<T>?, mapFunction: Mapper<T, R>) = list?.map { mapFunction.map(it) }
}