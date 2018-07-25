package com.learn.unittest.basic.func

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class FunctionsShowcaseTest {

    companion object {
        private const val JOIN_STRING_EXPECTED = "{1, 2, 3}";
    }

    private lateinit var showcase: FunctionsShowcase

    @Before
    fun setUp() {
        showcase = FunctionsShowcase()
    }

    @Test
    fun test_max() {
        Assert.assertEquals(5, showcase.max(5, 4))
    }

    @Test
    fun test_max_with_single_expression_body() {
        Assert.assertEquals(4, showcase.maxWithSingleExpressionBody(1, 4))
    }

    @Test
    fun test_max_with_type_inference() {
        Assert.assertEquals(6, showcase.maxWithTypeInference(6, 4))
    }

    @Test
    fun test_join_to_string() {
        Assert.assertEquals(JOIN_STRING_EXPECTED, showcase.joinToString(listOf(1, 2, 3), ", ", "{", "}"))
    }

    @Test
    fun test_join_to_string_with_named_argument() {
        val result =
                showcase.joinToString(
                        collection = listOf(1, 2, 3),
                        separator = ", ",
                        prefix = "{",
                        postfix = "}")
        Assert.assertEquals(JOIN_STRING_EXPECTED, result)
    }

    @Test
    fun test_join_to_string_with_default_para_value() {
        val result = showcase.joinStringWithDefaultParaValue(listOf(1, 2, 3))
        Assert.assertEquals(JOIN_STRING_EXPECTED, result)
    }

    @Test
    fun test_join_to_string_omit_trailing_arguments() {
        val result = showcase.joinStringWithDefaultParaValue(listOf(1, 2, 3), "#")
        Assert.assertEquals("{1#2#3}", result)
    }

    @Test
    fun test_join_to_string_omit_arguments_with_named_arguments() {
        val result = showcase.joinStringWithDefaultParaValue(listOf(1, 2, 3), postfix = "@")
        Assert.assertEquals("{1, 2, 3@", result)
    }
}