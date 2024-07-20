package com.example.algoritma.learning

class Araba(var renk:String,var fiyat:Int,var hiz:Int,var calisiyormu:Boolean) {


    init {
        println("Primary Constructor çalışır")
    }
    fun hizlen(kacKM:Int){
        hiz+=kacKM
        println(hiz)
    }
    fun calistir(){
        calisiyormu=true
        hiz=6
        println(hiz)
    }
    fun durdur(){
        calisiyormu=false
        hiz=0
        println(hiz)
    }
    fun bilgiAl(){
        println(hiz)
        println(renk)
        println(calisiyormu)
        println(fiyat)
    }


}