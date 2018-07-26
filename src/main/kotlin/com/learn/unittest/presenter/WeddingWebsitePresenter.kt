package com.learn.unittest.presenter

import com.learn.unittest.contract.WeddingWebsiteContract
import com.learn.unittest.contract.WeddingWebsiteContract.*

class WeddingWebsitePresenter(private val provider: Provider, private val viewRenderer: ViewRenderer) : WeddingWebsiteContract.Presenter {

    override fun viewGuestDashboard() {
        if (isWeddingWebsiteCreated()) {
            viewRenderer.displayWeddingWebsite()
        } else {
            viewRenderer.displayGuestList()
        }
    }

    private fun isWeddingWebsiteCreated(): Boolean {
        val weddingWebsite = provider.getWeddingWebsiteProfile()
        return !weddingWebsite.id.isEmpty() && weddingWebsite.isOnlyGlm
    }
}