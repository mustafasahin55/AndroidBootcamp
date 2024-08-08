package com.example.myapplication.nesne_tabanli

class Urunler(var id:Int,var ad: String, var fiyat:Double) {
    // super inheritten gelen üst sınıfı temsil eder
    //this bulunduğu sınıfı temsil eder
    // swiftte self


    init{
        println("Constructor")
    }

    fun bilgial(){
        println("AD: $ad")
    }
}


