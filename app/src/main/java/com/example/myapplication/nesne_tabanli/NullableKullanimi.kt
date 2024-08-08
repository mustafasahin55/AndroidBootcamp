package com.example.myapplication.nesne_tabanli

fun main() {

    var mesaj:String? = null
    //mesaj = "merhaba"
    //Yöntem1:
   // println("Yöntem1:${mesaj?.uppercase()}")

    //Yöntem2:
    //println("Yöntem1:${mesaj!!.uppercase()}")
/*
    //Yöntem3:
    if (mesaj != null){
        println("Yöntem3:${mesaj.uppercase()}")
    }else{
        println("Yöntem3: Null")
    }
*/
    //Yöntem 4
    mesaj?.let{
        println("Yöntem4:${it.uppercase()}")
    }

}