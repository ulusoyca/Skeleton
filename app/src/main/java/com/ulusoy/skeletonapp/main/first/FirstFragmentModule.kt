package com.ulusoy.skeletonapp.main.first

import com.ulusoy.skeletonapp.FragmentScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FirstFragmentModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = [FirstModule::class])
    abstract fun bindInfinitiveFragment(): FirstFragment
}
