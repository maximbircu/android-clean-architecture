package ml.maximbircu.data.datasources.network.mappers

import ml.maximbircu.data.datasources.network.models.UserApi
import ml.maximbircu.domain.entities.User
import ml.maximbircu.domain.mappers.Mapper
import javax.inject.Inject

/**
 * Created by Maxim Bircu on 12/27/17.
 */

class UserApiMapper @Inject constructor() : Mapper<UserApi, User> {
    override fun map(model: UserApi): User = User(model.id, model.name, model.username)
}