package ml.maximbircu.data.datasources.network.services.utils

import com.google.gson.GsonBuilder
import rx.Observable
import rx.Single

/**
 * Created by Maxim Bircu on 12/27/17.
 */

class RequestExecutor {

    private val TAG: String? = RequestExecutor::class.simpleName

    companion object {
        private val gson = GsonBuilder().create()

        fun <T> execute(login: Observable<T>): Observable<T> = login.onErrorResumeNext { error ->
            Observable.error(ml.maximbircu.data.datasources.network.exceptions.NetworkConnectionException(error as Error))
        }

        fun <T> execute(login: Single<T>): Single<T> = login.onErrorResumeNext { error ->
            Single.error(ml.maximbircu.data.datasources.network.exceptions.NetworkConnectionException(error as Error))
        }
    }
}