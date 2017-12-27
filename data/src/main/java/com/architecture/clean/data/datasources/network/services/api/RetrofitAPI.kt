package com.architecture.clean.data.datasources.network.services.api

import com.architecture.clean.data.datasources.network.models.UserApi
import retrofit2.http.GET
import rx.Observable


/**
 * Created by Maxim Bircu on 11/20/17.
 */

interface RetrofitAPI {
    @GET("/users")
    abstract fun getUsers(): Observable<List<UserApi>>
}