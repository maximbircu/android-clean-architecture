package com.architecture.clean.presentation.presenters

import rx.Observable
import rx.Single
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers
import rx.subscriptions.CompositeSubscription

/**
 * Created by Maxim Bircu on 12/27/17.
 */

abstract class BasePresenter<V> {

    private val TAG: String? = BasePresenter::class.simpleName

    private val subscriptions: CompositeSubscription = CompositeSubscription()

    var view: V? = null

    open fun resume() {}

    open fun pause() {}


    fun <T> execute(observable: Single<T>, subscriber: Subscriber<T>) {
        val subscription = observable
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber)
        subscriptions.add(subscription)
    }


    fun <T> execute(observable: Observable<T>, subscriber: Subscriber<T>) {
        val subscription = observable
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber)
        subscriptions.add(subscription)
    }
}