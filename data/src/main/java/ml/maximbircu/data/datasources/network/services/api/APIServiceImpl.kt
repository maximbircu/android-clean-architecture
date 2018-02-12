package ml.maximbircu.data.datasources.network.services.api

import ml.maximbircu.data.datasources.network.models.UserApi
import rx.Observable
import javax.inject.Inject

/**
 * Created by Maxim Bircu on 11/20/17.
 */

class APIServiceImpl @Inject constructor(private val retrofitAPI: RetrofitAPI) : APIService {
    private val TAG: String? = APIServiceImpl::class.simpleName

    override fun getUsers(): Observable<List<UserApi>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}