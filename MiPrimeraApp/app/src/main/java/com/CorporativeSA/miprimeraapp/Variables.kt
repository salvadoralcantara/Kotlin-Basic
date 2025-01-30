package com.CorporativeSA.miprimeraapp

fun main() {
    println("Hola mundo desde Kotlin")

    val nombre = "Juan"

    val example2 = 65.64f

    var num3 = 15

    println(saludar("Salvador"))
    println(sumar(num3, example2.toInt()))

    println(add(5))
}

fun saludar(nombre: String): String {
    return "Hola $nombre"
}

fun sumar(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun add(num: Int = 50){
    println(num)
}