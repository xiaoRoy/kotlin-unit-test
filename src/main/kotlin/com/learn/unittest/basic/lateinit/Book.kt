package com.learn.unittest.basic.lateinit

class Book {

    lateinit var title: String

    var titleNotLateInit: String? = null

    fun upperCaseTitle() = title.toUpperCase()

    fun upperCaseTitleNotLateInitSafeCall() = titleNotLateInit?.toUpperCase()

    fun upperCaseTitleNotNullAssertion() = titleNotLateInit!!.toUpperCase()
}