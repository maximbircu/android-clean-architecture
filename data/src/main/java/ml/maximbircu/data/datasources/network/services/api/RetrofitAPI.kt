package ml.maximbircu.data.datasources.network.services.api

import ml.maximbircu.data.datasources.network.models.UserApi
import retrofit2.http.GET
import rx.Observable

/**
 * Created by Maxim Bircu on 11/20/17.
 */

interface RetrofitAPI {
    @GET("api/users")
    fun getUsers(): Observable<List<UserApi>>
}