package ml.maximbircu.domain.gateway


import ml.maximbircu.domain.entities.User
import rx.Observable

/**
 * Created by Maxim Bircu on 12/27/17.
 */
interface UsersGateWay {
    fun getUsers() : Observable<List<User>>
}