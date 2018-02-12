package ml.maximbircu.presentation.di.components

import ml.maximbircu.presentation.di.modules.data.NetworkModule
import ml.maximbircu.presentation.di.modules.data.RepositoryModule
import ml.maximbircu.presentation.di.modules.data.ServicesModule
import ml.maximbircu.presentation.di.modules.internal.ApplicationModule
import ml.maximbircu.presentation.di.scopes.PerApplication
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