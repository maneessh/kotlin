package com.example.software_engineering.ui.theme


//Arrays
fun main(arg :Array<String>){
    var age = arrayOf(1,2,3)
    println(age)
    println("The first element of age is " + age[0])
    println("The second element of age is " + age[1])
    println("The third element of age is " + age[2])

    var name = arrayOf("Ram" ,"Shyam" ,"Hari")
    name[1] = "sandis"
    println("The first element of name is "+ name[0])
    println("The second element of name is "+ name[1])
    println("The third element of name is "+ name[2])

    println(name.size)


    //ArrayList
    //Can add value only after our array is initialize
    var age1 = ArrayList<Int>()
        age1.add(1)
        age1.add(5)
        age1.add(5)
        age1.add(2,20)


    println(age1)

    //Can add value directly in array while initializing variables
    var age2 = arrayListOf<Int>(1,20,3)

    var age3 = arrayListOf<String>("abhiraj","Praman" ,"Shyam")
    age3.add("devi")
    age3.add(4,"Hari")

    age3.remove("Shyam")
    age3.removeAt(0)

    println(age3)

    var mixArrayList = arrayListOf<Any>("hello",2,1.2)
    println(mixArrayList[0])
    println(mixArrayList[1])
    println(mixArrayList[2])





}