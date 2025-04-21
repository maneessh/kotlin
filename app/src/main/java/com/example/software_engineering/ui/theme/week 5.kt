package com.example.software_engineering.ui.theme

//list
//-An ordered collection with access to element by indices


fun main(){
    displaylist()
    set()
    map()

    //List
    //dislaylist
    val numbers :List<String> = listOf("one","two","three","four")

    println("Number of element: ${numbers.size} ")
    println("Third element : ${numbers.get(2)}")
    println("fourth element : ${numbers[3]}")
    println("Index of the element /two/ : ${numbers.indexOf("two")}")

    //immutable
    val lst = listOf("one","two","three")
    println("immutable")
    for(i in lst.indices){
        println(lst[i])
    }
    println()

    //mutable
    val mutlst  = mutableListOf("one","two","three")
    mutlst.add("four")
    println("mutable")
    for(i in mutlst.indices) {
        println(mutlst[i])
    }



}

 fun displaylist() {
     val numbers: List<String> = listOf("one", "two", "three", "four")
     println("Number of elements : ${numbers.size}")

 }


fun set(){
    val set1 = setOf(1,2,4,5)
    for(elments in set1){
        println(elments)
    }
    val setBackwards = setOf(4,3,2,1)
    println("The sets are equal : ${set1 == setBackwards}")

}

fun map(){
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijung",
        "India" to "New Delhi"
    )

    println("All Keys : ${countriesCapitals.keys}")
    println("All values : ${countriesCapitals.values}")

    println("Capital of Nepal is ${countriesCapitals["Nepal"]}")

    //immutable map

    val studentMarks = mapOf(
        "ram" to 50,
        "shyam" to 56,
        "hari" to 45,
        "gita" to 45,
    )
    println("Enter student name :")
    val input : String = readln().lowercase()
    println(studentMarks[input])

}
