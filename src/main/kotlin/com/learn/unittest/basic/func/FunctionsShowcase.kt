package com.learn.unittest.basic.func

class FunctionsShowcase {

    fun max(one: Int, another: Int): Int {
        val title = "Kotlin"
        return if (one > another) one else another
    }

    fun maxWithSingleExpressionBody(one: Int, another: Int): Int = if (one > another) one else another

    fun maxWithTypeInference(one: Int, another: Int) = if (one > another) one else another
}