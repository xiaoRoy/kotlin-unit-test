package com.learn.unittest.contract

interface RegistryProductListContract {

    interface Presenter{
        fun viewRegistryProductList()

        fun viewNewlywedFund();
    }

    interface Provider{

    }

    interface ViewRenderer{
        fun navigateToNewlywedFunPage()
    }
}