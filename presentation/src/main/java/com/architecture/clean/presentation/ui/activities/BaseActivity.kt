package com.architecture.clean.presentation.ui.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.architecture.clean.presentation.App
import com.architecture.clean.presentation.di.components.ActivityComponent
import com.architecture.clean.presentation.di.components.DaggerActivityComponent
import com.architecture.clean.presentation.di.modules.internal.ActivityModule
import com.architecture.clean.presentation.presenters.BasePresenter
import com.architecture.clean.presentation.views.BaseView

/**
 * Created by Maxim Bircu on 12/27/17.
 */

abstract class BaseActivity<V : BaseView, T : BasePresenter<V>> : AppCompatActivity() {

    private val TAG: String? = BaseActivity::class.simpleName

    protected lateinit var presenter: T
    protected lateinit var activityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupActivityComponent()
    }

    override fun onResume() {
        super.onResume()
        presenter.resume()
    }

    override fun onPause() {
        super.onPause()
        presenter.pause()
    }

    private fun setupActivityComponent() {
        activityComponent = DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .applicationComponent((application as App).applicationComponent)
                .build()
    }
}