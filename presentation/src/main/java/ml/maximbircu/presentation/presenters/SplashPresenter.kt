package ml.maximbircu.presentation.presenters

import ml.maximbircu.presentation.navigation.Navigator
import ml.maximbircu.presentation.views.SplashView
import javax.inject.Inject

/**
 * Created by Maxim Bircu on 12/27/17.
 */

class SplashPresenter @Inject constructor(val navigator: Navigator) : BasePresenter<SplashView>() {

    private val TAG: String? = SplashPresenter::class.simpleName

    override fun resume() {
        super.resume()
        //TODO open here main activity using navigator
    }
}