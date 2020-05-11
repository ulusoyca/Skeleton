package com.ulusoy.skeletonapp.main.third

import com.ulusoy.skeletonapp.FragmentScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ThirdFragmentModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = [ThirdModule::class])
    abstract fun bindInfinitiveFragment(): ThirdFragment
}
