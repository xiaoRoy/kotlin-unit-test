package com.learn.unittest.presenter

import com.learn.unittest.contract.WeddingWebsiteContract
import com.learn.unittest.model.WeddingWebsiteProfile
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class WeddingWebsitePresenterTest {

    private lateinit var presenter: WeddingWebsiteContract.Presenter

    @Mock
    private lateinit var provider: WeddingWebsiteContract.Provider

    @Mock
    private lateinit var viewRenderer: WeddingWebsiteContract.ViewRenderer


    @Test
    fun test_view_guest_dashboard() {
        Mockito.spy(WeddingWebsiteProfile::class.java)
    }
}