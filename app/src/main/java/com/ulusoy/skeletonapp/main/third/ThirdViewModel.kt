package com.ulusoy.skeletonapp.main.third

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject
import javax.inject.Named

class ThirdViewModel
@Inject constructor(
    @Named(NAMED_THIRD_STRING)
    private val text: String
) : ViewModel() {
    private val _thirdString = MutableLiveData<String>().apply {
        value = text
    }
    val thirdString: LiveData<String>
        get() = _thirdString
}
