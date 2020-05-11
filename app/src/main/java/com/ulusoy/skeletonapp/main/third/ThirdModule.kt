package com.ulusoy.skeletonapp.main.third

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

const val NAMED_THIRD_STRING = "third_string"

@Module
abstract class ThirdModule {
    @FragmentScope
    @Binds
    @IntoMap
    @ViewModelKey(ThirdViewModel::class)
    /* Note: the return type should be ViewModel */
    abstract fun bindViewModel(viewModel: ThirdViewModel): ViewModel

    @Module
    companion object {
        @JvmStatic
        @Provides
        @Named(NAMED_THIRD_STRING)
        fun provideThirdString(context: Context): String = context.getString(R.string.third_hello)
    }
}
