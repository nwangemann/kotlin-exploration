package com.rsk

fun practiceFunction():Unit{
    return println("Practicing exports and imports")
}

class Person (var Name: String) {
    fun display () {
        println("Display: $Name")
    }

    fun displayWithLambda(func: (s:String) -> Unit){
        func(Name)
    }

}