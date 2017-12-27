package com.architecture.clean.domain.gateway

import com.architecture.clean.domain.entities.User
import rx.Observable

/**
 * Created by Maxim Bircu on 12/27/17.
 */
interface UsersGateWay {
    fun getUsers() : Observable<List<User>>
}