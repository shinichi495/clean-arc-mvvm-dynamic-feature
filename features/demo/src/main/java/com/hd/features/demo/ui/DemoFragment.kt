package com.hd.features.demo.ui

import com.hd.features.demo.databinding.FragmentDemoBinding
import com.hdbank.ui.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class DemoFragment : BaseFragment<FragmentDemoBinding, DemoViewModel>() {

    override fun getViewBinding(): FragmentDemoBinding = FragmentDemoBinding.inflate(layoutInflater)
    override fun getViewModel() = viewModel<DemoViewModel>()

}