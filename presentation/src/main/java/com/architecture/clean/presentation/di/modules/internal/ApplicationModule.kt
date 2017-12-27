package com.architecture.clean.presentation.di.modules.internal

import android.content.Context
import com.architecture.clean.presentation.di.scopes.PerApplication
import dagger.Module
import dagger.Provides

/**
 * Created by Maxim Bircu on 12/27/17.
 */

@Module
class ApplicationModule(private val context: Context) {

    @Provides
    @PerApplication
    fun getApplicationContext() = context
}