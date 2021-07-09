const val APPLICATION = "Belajar Kotlin Dasar"
const val VERSION = "0.0.1"

fun main(){

    // immutable variable
    val firstName: String = "Sigit"
    val age = 30

    println(firstName)
    println(age)

    // mutable variable
    var name: String? = null
    name = "Sigit"
    println(name)
    println(name?.length)

    println("$APPLICATION : $VERSION")
}