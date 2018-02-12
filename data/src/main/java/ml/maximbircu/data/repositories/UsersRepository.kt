package ml.maximbircu.data.repositories


import ml.maximbircu.data.datasources.network.mappers.UserApiMapper
import ml.maximbircu.data.datasources.network.services.api.APIService
import ml.maximbircu.domain.entities.User
import ml.maximbircu.domain.gateway.UsersGateWay
import ml.maximbircu.domain.mappers.ListMapper
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