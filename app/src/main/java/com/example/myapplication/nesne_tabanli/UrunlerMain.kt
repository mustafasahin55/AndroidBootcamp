package com.example.myapplication.nesne_tabanli

fun main() {
///
//    val urun1 = Urunler(99,"Laptop",18999.0)
//    val urun2 = Urunler(98,"Saat",2999.99)
//    var urun3 : Urunler = Urunler(97,"Araba",2222999.99)
//    urun1.bilgial()

    val fonkT = Fonksiyonlar()
    fonkT.selamla1()

    println(fonkT.selamla2())
    println(fonkT.selamla3("Mustafa"))

    fonkT.carp(1.3,2.3)
}