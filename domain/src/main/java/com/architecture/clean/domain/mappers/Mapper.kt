package com.architecture.clean.domain.mappers

/**
 * Created by Maxim Bircu on 11/29/17.
 */

@FunctionalInterface
interface Mapper<M, P> {
    fun map(model: M): P
}