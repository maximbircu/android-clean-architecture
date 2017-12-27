package com.architecture.clean.presentation.di.modules.data

import com.architecture.clean.data.datasources.network.services.configuration.ConfigurationService
import com.architecture.clean.presentation.di.scopes.PerApplication
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Maxim Bircu on 12/27/17.
 */

@Module
class NetworkModule {

    @Provides
    @PerApplication
    internal fun getRetrofit(configurationService: ConfigurationService, client: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .baseUrl(configurationService.apiEndPoint)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build()
    }

    @Provides
    @PerApplication
    internal fun getOkHttpClient(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder().addInterceptor(interceptor).build()
    }

}