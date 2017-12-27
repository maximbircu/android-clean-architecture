package com.architecture.clean.presentation.di.components

import com.architecture.clean.presentation.di.modules.data.NetworkModule
import com.architecture.clean.presentation.di.modules.data.RepositoryModule
import com.architecture.clean.presentation.di.modules.data.ServicesModule
import com.architecture.clean.presentation.di.modules.internal.ApplicationModule
import com.architecture.clean.presentation.di.scopes.PerApplication
import dagger.Component

/**
 * Created by Maxim Bircu on 12/27/17.
 */

@PerApplication
@Component(
        modules = arrayOf(
                ApplicationModule::class,
                NetworkModule::class,
                RepositoryModule::class,
                ServicesModule::class
        )
)
interface ApplicationComponent