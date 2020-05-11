package com.ulusoy.skeletonapp.main.second

import com.ulusoy.skeletonapp.FragmentScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SecondFragmentModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = [SecondModule::class])
    abstract fun bindInfinitiveFragment(): SecondFragment
}
