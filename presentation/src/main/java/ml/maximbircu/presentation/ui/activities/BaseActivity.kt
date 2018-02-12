package ml.maximbircu.presentation.ui.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ml.maximbircu.presentation.App
import ml.maximbircu.presentation.di.components.ActivityComponent
import ml.maximbircu.presentation.di.modules.internal.ActivityModule
import ml.maximbircu.presentation.presenters.BasePresenter
import ml.maximbircu.presentation.views.BaseView

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
        activityComponent = ml.maximbircu.presentation.di.components.DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .applicationComponent((application as App).applicationComponent)
                .build()
    }
}