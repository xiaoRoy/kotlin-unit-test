package com.learn.unittest.presenter

import com.learn.unittest.contract.RegistryProductListContract

class RegistryProductListPresenter(private val provider: RegistryProductListContract.Provider,
                                   private val viewRenderer: RegistryProductListContract.ViewRenderer)
    : RegistryProductListContract.Presenter {



    override fun viewNewlywedFund() {
        viewRenderer.navigateToNewlywedFunPage()
    }

    override fun viewRegistryProductList() {
    }
}