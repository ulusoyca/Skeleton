package com.ulusoy.skeletonapp.main.third

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.ulusoy.skeletonapp.databinding.FragmentThirdBinding
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class ThirdFragment : DaggerFragment() {

    private lateinit var binding: FragmentThirdBinding

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: ThirdViewModel by viewModels { viewModelFactory }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(viewModel) {
            thirdString.observe(viewLifecycleOwner, Observer {
                binding.thirdTextView.text = it
            })
        }
    }
}
