package com.architecture.clean.presentation.di.modules.data

import android.content.Context
import com.architecture.clean.presentation.di.scopes.PerApplication
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Created by Maxim Bircu on 12/27/17.
 */

@Module(includes = arrayOf(NetworkModule::class))
class ServicesModule