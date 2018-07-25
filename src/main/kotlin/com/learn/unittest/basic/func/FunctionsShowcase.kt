package com.learn.unittest.basic.func

class FunctionsShowcase {

    fun max(one: Int, another: Int): Int {
        return if (one > another) one else another
    }

    fun maxWithSingleExpressionBody(one: Int, another: Int): Int = if (one > another) one else another

    fun maxWithTypeInference(one: Int, another: Int) = if (one > another) one else another

    fun <T> joinToString(collection: Collection<T>, separator: String, prefix: String, postfix: String): String{
        val result = StringBuffer(prefix)
        for((index, element) in collection.withIndex()){
            if(index > 0){
                result.append(separator)
            }
            result.append(element)
        }
        result.append(postfix)
        return result.toString()
    }

    fun <T>joinStringWithDefaultParaValue(collection: Collection<T>,
                                          separator: String = ", ",
                                          prefix: String = "{",
                                          postfix: String = "}"): String{
        return joinToString(collection, separator, prefix, postfix)
    }
}