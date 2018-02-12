package ml.maximbircu.data.datasources.network.services.api

import ml.maximbircu.data.datasources.network.models.UserApi
import rx.Observable

/**
 * Created by Maxim Bircu on 11/20/17.
 */

interface APIService {
    fun getUsers(): Observable<List<UserApi>>
}