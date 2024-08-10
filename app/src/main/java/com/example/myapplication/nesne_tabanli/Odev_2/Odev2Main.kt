package com.example.myapplication.nesne_tabanli.Odev_2

fun main() {
    var test = Odev2()

    //iç açı hesaplayıcı
    print("Altıgenin İç Açıları: "); println(test.icAciHesapla(6))
    println("-------------------------------------------------------------")
    //Maaş Hesabı
    print("12 Gün Çalışma Maaş: "); println(test.icAciHesapla(12))
    print("28 Gün Çalışma Maaş: "); println(test.icAciHesapla(28))
    println("-------------------------------------------------------------")
    //Kota Hesaplayıcı
    print("45GB Ücreti: "); println(test.kotaHesapla(45.3))
    print("98GB Ücreti: "); println(test.kotaHesapla(98.2))
    println("-------------------------------------------------------------")
    //Derece Fahreneit çevirici
    print("18 Derece Selsiyus Fahreneit Karşılığı: ");println(test.derece2Fahreneit(18.0))
    println("-------------------------------------------------------------")
    //Dikdörtgen Çevre
    print("Kenarları 12 ve 17 birim olan dikdörtgenin çevresi:");println(test.d4genCevre(12.0,17.0))
    println("-------------------------------------------------------------")
    //Faktoriyel Hesaplama
    print("4!: ");println(test.faktoriyel(4))
    println("-------------------------------------------------------------")
    //A harf saydırma
    print("araba kelimesindeki a harfi sayısı: ");println(test.aHarfiSay("araba"))
    println("-------------------------------------------------------------")


}