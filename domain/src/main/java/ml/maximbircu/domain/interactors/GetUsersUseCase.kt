package ml.maximbircu.domain.interactors


import ml.maximbircu.domain.entities.User
import ml.maximbircu.domain.gateway.UsersGateWay
import rx.Observable
import javax.inject.Inject

/**
 * Created by Maxim Bircu on 12/27/17.
 */

open class GetUsersUseCase @Inject constructor(private val usersGateWay: UsersGateWay) {
    protected fun buildUseCaseObservable(): Observable<List<User>> {
        return usersGateWay.getUsers()
    }
}
