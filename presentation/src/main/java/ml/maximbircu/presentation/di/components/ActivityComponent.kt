package ml.maximbircu.presentation.di.components

import ml.maximbircu.presentation.di.modules.domain.DomainModule
import ml.maximbircu.presentation.di.modules.internal.ActivityModule
import ml.maximbircu.presentation.di.scopes.PerActivity
import ml.maximbircu.presentation.ui.activities.SplashActivity
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