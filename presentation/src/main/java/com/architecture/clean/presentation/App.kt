package com.architecture.clean.presentation

import android.app.Application
import com.architecture.clean.presentation.di.components.ApplicationComponent
import com.architecture.clean.presentation.di.components.DaggerApplicationComponent
import com.architecture.clean.presentation.di.modules.internal.ApplicationModule

/**
 * Created by Maxim Bircu on 12/27/17.
 */

class App : Application() {
    private val TAG: String? = App::class.simpleName

    lateinit var applicationComponent: ApplicationComponent
        private set;

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}