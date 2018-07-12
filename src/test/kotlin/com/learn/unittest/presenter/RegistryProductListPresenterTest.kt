package com.learn.unittest.presenter

import com.learn.unittest.contract.RegistryProductListContract
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class RegistryProductListPresenterTest {

    @Mock
    private lateinit var provider: RegistryProductListContract.Provider

    @Mock
    private lateinit var viewRenderer: RegistryProductListContract.ViewRenderer

    @Test
    fun test_view_newlywed_fund(){
        val presenter = RegistryProductListPresenter(provider, viewRenderer)
        presenter.viewNewlywedFund()
        Mockito.verify(viewRenderer).navigateToNewlywedFunPage()
    }
}