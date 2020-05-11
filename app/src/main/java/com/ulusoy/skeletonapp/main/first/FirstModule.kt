package com.ulusoy.skeletonapp.main.first

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

const val NAMED_FIRST_STRING = "first_string"

@Module
abstract class FirstModule {
    @FragmentScope
    @Binds
    @IntoMap
    @ViewModelKey(FirstViewModel::class)
    /* Note: the return type should be ViewModel */
    abstract fun bindViewModel(viewModel: FirstViewModel): ViewModel

    @Module
    companion object {
        @JvmStatic
        @Provides
        @Named(NAMED_FIRST_STRING)
        fun provideFirstString(context: Context): String = context.getString(R.string.first_hello)
    }
}
