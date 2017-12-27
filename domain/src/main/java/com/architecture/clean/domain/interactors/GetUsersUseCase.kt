package com.architecture.clean.domain.interactors

import com.architecture.clean.domain.entities.User
import com.architecture.clean.domain.gateway.UsersGateWay
import rx.Observable
import javax.inject.Inject

/**
 * Created by Maxim Bircu on 12/27/17.
 */

class GetUsersUseCase @Inject constructor(private val usersGateWay: UsersGateWay) {
    protected fun buildUseCaseObservable(): Observable<List<User>> {
        return usersGateWay.getUsers()
    }
}
