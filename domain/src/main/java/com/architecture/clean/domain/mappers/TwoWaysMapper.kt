package com.architecture.clean.domain.mappers

/**
 * Created by Maxim Bircu on 11/29/17.
 */

interface TwoWaysMapper<M, P> : Mapper<M, P> {
    fun inverseMap(model: P): M
}