package com.ulusoy.skeletonapp

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import timber.log.Timber

class SkeletonApp : DaggerApplication() {
    private val finnishitAppComponent: AndroidInjector<SkeletonApp> by lazy {
        DaggerAppComponent.factory().create(this)
    }

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return finnishitAppComponent
    }
}
