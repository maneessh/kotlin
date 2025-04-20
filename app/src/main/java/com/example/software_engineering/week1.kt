package com.example.software_engineering

fun main(){
    //println("Hello world")


    //immutable variable
    //var age = 10;

    //var name = "Manish"
    //name ="Rumba"

    //mutable variable
    var firstName = "sandis"
    var lastName = "prajapati"

    println(firstName + " " + lastName)
    //variable matra use garnuparyo bhane $ and variable and properties ${}//
    println("${firstName.length} $lastName")

    //String name = "sandis"

    var name : String = "sandis"//variable declare

    val age : Int = 10

    //var address = arrayOf("ktm","pokhara","Bhaktapur")
    //address[3] = "sss"
    //println(address[3])

    //small a can add value in one line/initalize
    var address = arrayListOf("ktm","chitwan")
    address.add("pokhara")

    //big A cannot add value in one line/initalize
    var data = ArrayList<Int>()//data tyoe is needed
    data.add(1)
    data.add(3)

    //Ant datatype
    var data1 = ArrayList<Any>()
    data1.add(2)
    data1.add("ram")


    var dictionary = mapOf(
        "Apple" to "This is fruit",
        "dog " to "This is animal"
    )
    println("The value of Apple ${dictionary["Apple"]}")


    //for(int i = 0; i < 5 ; i++){
      //  println()
    //}

    for (i in 0.. 5){
        println(i)
    }

    //public int calulate(int a , int b){}

    fun calculate (a:Int , b:Int) :Unit{ //Unit doesnot return anything,Unit = void

    }

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

    val lstt = listOf(1,2,3)
    for(i in lstt){
        println(lstt[i])
    }

    val number = mutableListOf<Int>(1,2,3)
    for(i in number.indices){
        println(number[i])
    }


}