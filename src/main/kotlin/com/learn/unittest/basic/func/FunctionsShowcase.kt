package com.learn.unittest.basic

class FunctionsShowcase {

    fun max(one: Int, another: Int): Int{
        val result = if(one > another) one else another
        return result
    }
}