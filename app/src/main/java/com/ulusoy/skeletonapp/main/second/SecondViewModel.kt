package com.ulusoy.skeletonapp.main.second

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject
import javax.inject.Named

const val NAMED_SECOND_STRING = "second_string"

class SecondViewModel
@Inject constructor(
    @Named(NAMED_SECOND_STRING)
    private val text: String
) : ViewModel() {
    private val _secondString = MutableLiveData<String>().apply {
        value = text
    }
    val secondString: LiveData<String>
        get() = _secondString
}
