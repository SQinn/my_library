package com.sqinn.mvvm_library.base.activity

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import com.sqinn.mvvm_library.viewmodel.BaseViewModel


abstract class BaseMvvmActivity<VM : BaseViewModel, DB : ViewDataBinding> :
    BaseVmDbActivity<VM, DB>() {

    abstract override fun layoutId(): Int

    abstract override fun initData(savedInstanceState: Bundle?)

    override fun createObserver() {}

}