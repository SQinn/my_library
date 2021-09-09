package com.sqinn.mvvm_library.base.fragment

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import com.sqinn.mvvm_library.ext.hideSoftKeyboard
import com.sqinn.mvvm_library.viewmodel.BaseViewModel

abstract class BaseMvvmFragment<VM : BaseViewModel, DB : ViewDataBinding> :
    BaseVmDbFragment<VM, DB>() {

    abstract override fun layoutId(): Int

    abstract override fun initData(savedInstanceState: Bundle?)

    override fun lazyLoadData() {}

    override fun createObserver() {}


    override fun onPause() {
        super.onPause()
        hideSoftKeyboard(activity)
    }

    override fun lazyLoadTime(): Long {
        return 300
    }
}