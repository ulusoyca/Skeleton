package com.ulusoy.skeletonapp.main
import com.ulusoy.skeletonapp.ActivityScope
import com.ulusoy.skeletonapp.main.first.FirstFragmentModule
import com.ulusoy.skeletonapp.main.second.SecondFragmentModule
import com.ulusoy.skeletonapp.main.third.ThirdFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [
        FirstFragmentModule::class,
        SecondFragmentModule::class,
        ThirdFragmentModule::class,
        MainModule::class
    ])
    abstract fun contributeMainActivityInjector(): MainActivity
}
