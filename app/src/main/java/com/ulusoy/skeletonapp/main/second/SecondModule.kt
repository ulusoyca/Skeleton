package com.ulusoy.skeletonapp.main.second

import android.content.Context
import androidx.lifecycle.ViewModel
import com.ulusoy.skeletonapp.FragmentScope
import com.ulusoy.skeletonapp.R
import com.ulusoy.skeletonapp.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import javax.inject.Named

@Module
abstract class SecondModule {
    @FragmentScope
    @Binds
    @IntoMap
    @ViewModelKey(SecondViewModel::class)
    /* Note: the return type should be ViewModel */
    abstract fun bindViewModel(viewModel: SecondViewModel): ViewModel

    @Module
    companion object {
        @JvmStatic
        @Provides
        @Named(NAMED_SECOND_STRING)
        fun provideSecondString(context: Context): String = context.getString(R.string.second_hello)
    }
}
