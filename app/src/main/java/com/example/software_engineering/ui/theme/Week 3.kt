package com.example.software_engineering.ui.theme

import kotlin.jvm.internal.Ref.ByteRef


fun main() {
//mutable Variable
    var age = 100;
    age = 20

//immutable Varibale
    val speed = 100
    //speed = 10

//Data types
    /*
    var a : Boolean = true;
    var b : Char = 'R'
    var c : Byte = 12
    var d : Short = - 344
    var e : Int = 12332
    var f : Long = -231231L
    var i : Float = 5.12312F
    var h : Double = 7.2123123


    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(i)
    println(h)
     */


    // Type conversion in Kotlin
    /*
    var x : Double = 132.22
    var y : Int = x.toInt()
    var z : Byte = y.toByte()
    println(x)
    println(y)
    println(z)
    */

    //String Data Types in Kotlin

    //- length() - returns the length of a string
    //-equals() - compares the string with the specified string and return true or false
    //-isEmpty() - returns true if the given string as 0 length otherwise false
    //-plus("..")-
    //lowercase() - returns a string in lowercase
    //uppercase() - returns a string in uppercase
    //trim() - resmoves spaces at the begenning and end of the word

    var a : String = "Hello world"
    var i : Int = a.length
    var x : Boolean = a.equals("Hello world")
    var username : String = " Sofwarica "

    println(username.trim())
    println(a);
    println(i)
    println(a.isEmpty())
    println(a.lowercase())
    println(a.uppercase())
    println(x)
    println(a.plus("How are you"))

    var u : Int = 10
    println(u.plus(2))









}


