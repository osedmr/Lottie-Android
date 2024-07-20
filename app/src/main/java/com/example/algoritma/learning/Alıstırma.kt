package com.example.algoritma.learning

fun main() {
   /* val araba=Araba("kirmizi",1000,120,true)

    araba.bilgiAl()


    val bmw=Araba("mavi",1,2,true)
    bmw.bilgiAl()

    bmw.calistir()



    bmw.hizlen(10)
*/
    val fonk= Fonk()
    fonk.selam()
    fonk.return1()
    println(fonk.return1())
    fonk.girdi(12)

    val o1=fonk.topla(1,979)
    println(o1)

    val sonuc=5.carpi(2)
}
fun Int.carpi(sayi5:Int) : Int{
    return this*sayi5
}