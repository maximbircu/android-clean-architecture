package ml.maximbircu.presentation.di.modules.data

import ml.maximbircu.presentation.di.scopes.PerApplication
import dagger.Module

/**
 * Created by Maxim Bircu on 12/27/17.
 */

@Module(includes = arrayOf(NetworkModule::class))
class ServicesModule