package com.learn.unittest.basic.lateinit

import org.junit.Assert
import org.junit.Test

class BookTest {

    @Test
    fun test_upper_case_title(){
        val book = Book()
        book.title = "Lord of the Ring"
        Assert.assertEquals("LORD OF THE RING", book.upperCaseTitle())
    }

    @Test(expected = UninitializedPropertyAccessException::class)
    fun test_uninitialized_property_access_exception(){
        val book = Book()
        book.upperCaseTitle()
    }

    @Test
    fun test_upper_case_title_safe_call(){
        val book = Book()
        Assert.assertEquals(null, book.upperCaseTitleNotLateInitSafeCall())
    }

    @Test(expected = NullPointerException::class)
    fun test_upper_case_title_not_null_assertion(){
        val book = Book()
        book.upperCaseTitleNotNullAssertion()
    }
}