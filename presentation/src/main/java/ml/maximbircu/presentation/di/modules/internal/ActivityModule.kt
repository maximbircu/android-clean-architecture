package ml.maximbircu.presentation.di.modules.internal

import android.app.Activity
import ml.maximbircu.presentation.di.qualifiers.ActivityContext
import ml.maximbircu.presentation.di.scopes.PerActivity
import dagger.Module
import dagger.Provides

/**
 * Created by Maxim Bircu on 12/27/17.
 */

@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    @PerActivity
    @ActivityContext
    internal fun getActivityContext() = this.activity
}