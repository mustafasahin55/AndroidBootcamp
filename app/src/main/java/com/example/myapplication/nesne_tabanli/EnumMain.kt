package com.example.myapplication.nesne_tabanli

fun main() {
    ucretHesapla(KonserveBoyut.BUYUK,10)
}

fun ucretHesapla(boyut:KonserveBoyut,adet:Int){

    when(boyut){
        KonserveBoyut.KUCUK -> println("Toplam Maliyet:${adet * 12}")
        KonserveBoyut.ORTA -> println("Toplam Maliyet:${adet * 18}")
        KonserveBoyut.BUYUK -> println("Toplam Maliyet:${adet * 24}")
    }



}