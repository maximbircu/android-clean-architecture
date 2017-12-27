package com.architecture.clean.presentation.di.components

import com.architecture.clean.presentation.di.modules.domain.DomainModule
import com.architecture.clean.presentation.di.modules.internal.ActivityModule
import com.architecture.clean.presentation.di.scopes.PerActivity
import com.architecture.clean.presentation.ui.activities.SplashActivity
import dagger.Component

/**
 * Created by Maxim Bircu on 12/27/17.
 */

@PerActivity
@Component(
        modules = arrayOf(
                ActivityModule::class,
                DomainModule::class
        ),
        dependencies = arrayOf(
                ApplicationComponent::class
        )
)
interface ActivityComponent {
    fun inject(activity: SplashActivity)
}