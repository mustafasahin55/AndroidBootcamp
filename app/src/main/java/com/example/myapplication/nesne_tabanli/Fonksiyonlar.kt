package com.example.myapplication.nesne_tabanli

class Fonksiyonlar {
    var mesaj:String? = null

    lateinit var yazi:String



    fun selamla1(){
        val sonuc = "Merhaba"
        //println(sonuc)

    }

    fun selamla2():String{
        val sonuc = "Merhaba2"
        //println(sonuc)
        return sonuc
    }

    fun selamla3(isim:String):String{
        val sonuc = "Merhaba ${isim}"
        return sonuc
    }

    fun carp(sayi1:Int,sayi2:Int){
        println("Çarpma: ${sayi1*sayi2}")
    }
    fun carp(sayi1:Double,sayi2:Double){
        println("Çarpma: ${sayi1*sayi2}")
    }

}