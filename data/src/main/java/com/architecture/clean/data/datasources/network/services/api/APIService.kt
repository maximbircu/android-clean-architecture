package com.architecture.clean.data.datasources.network.services.api

import com.architecture.clean.data.datasources.network.models.UserApi
import rx.Observable

/**
 * Created by Maxim Bircu on 11/20/17.
 */

interface APIService {
    fun getUsers(): Observable<List<UserApi>>
}