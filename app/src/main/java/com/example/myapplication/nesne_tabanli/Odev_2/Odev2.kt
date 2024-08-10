package com.example.myapplication.nesne_tabanli.Odev_2

class Odev2 {

    fun icAciHesapla(kenarSayisi:Int):Int{
        return (kenarSayisi-2)*180
    }

    fun maasHesapla(gun:Int): Double{
        var toplamSaat = gun * 8

        if (toplamSaat > 160){
            var kalanSaat = toplamSaat - 160
            var maas :Double = (160*10 + kalanSaat*20).toDouble()
            return maas

        }else{
            var maas :Double = (toplamSaat * 10).toDouble()
            return maas

        }

    }

    fun kotaHesapla(kota:Double):Double{

        if(kota>50){
            var asim = kota - 50
            return ((asim*4)+100).toDouble()
        }else{
            return 100.toDouble()
        }
    }

    fun derece2Fahreneit(derece:Double):Double{

        return (derece*1.8 + 32)

    }

    fun d4genCevre(kenar1:Double,kenar2:Double):Double{
        return (kenar1+kenar2)*2
    }

    fun faktoriyel(sayi:Int):Long{
        var sonuc:Long = 1

        for (x in sayi downTo 1 step 1 ){
            sonuc *= x

        }
        return sonuc
    }

    fun aHarfiSay(input: String): Int {
        return input.count { it == 'a' }
    }

}