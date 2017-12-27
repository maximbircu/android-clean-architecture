package com.architecture.clean.data.repositories

import com.architecture.clean.data.datasources.network.mappers.UserApiMapper
import com.architecture.clean.data.datasources.network.services.api.APIService
import com.architecture.clean.domain.entities.User
import com.architecture.clean.domain.gateway.UsersGateWay
import com.architecture.clean.domain.mappers.ListMapper
import rx.Observable
import javax.inject.Inject

/**
 * Created by Maxim Bircu on 12/27/17.
 */

class UsersRepository @Inject constructor(
        private val apiService: APIService,
        private val userApiMapper: UserApiMapper) : UsersGateWay {

    override fun getUsers(): Observable<List<User>> {
        return apiService.getUsers().map { ListMapper.map(it, userApiMapper) }
    }
}