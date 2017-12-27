package com.architecture.clean.data.datasources.network.mappers

import com.architecture.clean.data.datasources.network.models.UserApi
import com.architecture.clean.domain.entities.User
import com.architecture.clean.domain.mappers.Mapper
import javax.inject.Inject

/**
 * Created by Maxim Bircu on 12/27/17.
 */

class UserApiMapper @Inject constructor(): Mapper<UserApi, User> {
    override fun map(model: UserApi): User = User(model.id, model.name, model.username)
}