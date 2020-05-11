package com.ulusoy.skeletonapp.main.first

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject
import javax.inject.Named

class FirstViewModel
@Inject constructor(
    @Named(NAMED_FIRST_STRING)
    private val text: String
) : ViewModel() {
    private val _firstString = MutableLiveData<String>().apply {
        value = text
    }
    val firstString: LiveData<String>
        get() = _firstString
}
