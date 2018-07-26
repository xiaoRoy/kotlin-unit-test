package com.learn.unittest.contract

import com.learn.unittest.model.WeddingWebsiteProfile

interface WeddingWebsiteContract {

    interface Presenter {
        fun viewGuestDashboard()
    }

    interface Provider {
        fun getWeddingWebsiteProfile(): WeddingWebsiteProfile
    }

    interface ViewRenderer {
        fun displayGuestList()

        fun displayWeddingWebsite()
    }
}