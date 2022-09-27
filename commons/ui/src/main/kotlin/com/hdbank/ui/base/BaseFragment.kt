package com.hdbank.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<B : ViewDataBinding, VM : BaseViewModel> : Fragment() {

    private var _binding: B? = null
    protected val binding: B get() = _binding!!
    protected abstract fun getViewBinding(): B

    lateinit var baseVM: VM
    protected abstract fun getViewModel(): Lazy<VM>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        baseVM = getViewModel().value
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = getViewBinding()
        binding.initialize()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpView()
        observableData()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    open fun B.initialize() {}
    open fun setUpView() {}
    open fun observableData() {
        baseVM.loading.observe(viewLifecycleOwner, {
            // show loading / hide loading
        })
        baseVM.error.observe(viewLifecycleOwner, {
            // show error for end user
        })
    }



}
