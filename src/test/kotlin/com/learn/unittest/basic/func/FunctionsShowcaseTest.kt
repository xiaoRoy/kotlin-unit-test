package com.learn.unittest.basic.func

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class FunctionsShowcaseTest{

    @Test
    fun test_max(){
        val showcase = FunctionsShowcase()
        Assert.assertEquals(5, showcase.max(5, 4))
    }

    @Test
    fun test_max_with_single_expression_body(){
        val showcase = FunctionsShowcase()
        Assert.assertEquals(4, showcase.maxWithSingleExpressionBody(1, 4))
    }

    @Test
    fun test_max_with_type_inference(){
        val showcase = FunctionsShowcase()
        Assert.assertEquals(6, showcase.maxWithTypeInference(6, 4))
    }
}