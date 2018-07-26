package com.learn.unittest.model

class WeddingWebsiteProfile(val id: String = "", val isOnlyGlm: Boolean = false) {

    fun isWeddingWebsiteCreated() = !id.isEmpty() && !isOnlyGlm
}