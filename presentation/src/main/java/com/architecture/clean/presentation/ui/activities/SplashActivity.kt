package com.architecture.clean.presentation.ui.activities

import android.os.Bundle
import com.architecture.clean.presentation.presenters.SplashPresenter
import com.architecture.clean.presentation.views.SplashView
import javax.inject.Inject

/**
 * Created by Maxim Bircu on 12/27/17.
 */

class SplashActivity : BaseActivity<SplashView, SplashPresenter>(), SplashView {

    private val TAG: String? = SplashActivity::class.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityComponent.inject(this)
    }

    @Inject
    fun setPresenter(presenter: SplashPresenter){
        super.presenter = presenter
        presenter.view = this
    }
}