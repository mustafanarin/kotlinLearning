package com.mustafanarin.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x = 4
        var y = 6
        println(x * y)

        var sayi = 3
        sayi = 5
        println(sayi)

        var yas : Int =3
        yas = 32

        val pi = 3.14
        println(pi)

        val ad = "mustafa"
        val soyAd = "narin"
        println(ad+" "+soyAd)

        println("********** ARRAY ***********")

        val sinif = arrayOf("ahmet","veli","selin","mustafa")
        println(sinif[2]) // output: selin
        sinif[2]="zehra"
        println(sinif[2])  // output: zehra

        println("element 1: ${sinif[0]} 1. elementi yazdirdi")
        println("element 4: ${sinif[3]} 4. elementi yazdirdi")

        println("********** ARRAYLIST ***********")

        val takim = arrayListOf<String>("serkan","sedef","mustafa")
        println(takim[2])
        takim.add("narin")
        println(takim[3])

        println("********** SET ***********")

        val sayilar = setOf<Int>(1,2,2,3)
        println(sayilar.size) //çıktı: 3
        sayilar.forEach { println(it) } // output: 1 2 3

        println("********** MAP ***********")
        // Key - value

        val meyve = arrayOf("elma","muz")
        val kalori = arrayOf(100,150)

        val meyveKaloriMap = hashMapOf<String,Int>()
        meyveKaloriMap.put("elma",100)
        meyveKaloriMap.put("muz",150)

        println(meyveKaloriMap["elma"]) //output: 100
        println(meyveKaloriMap["muz"])  //output: 150

        println("********** WHEN ***********")

        var day = 3
        var dayString = ""

        when(day){
            1 -> dayString = "monday"
            2 -> dayString = "tuesday"
            3 -> dayString = "wednesday"

        }
        println(dayString) // wednesday
        println("********** FOR ***********")

        val dizi = arrayOf(12,15,18,21,24,27,30,33)

        for(eleman in dizi){
            val z = eleman / 3 * 5
            println(z) // output: 20 25 30 35 40 45 50 55
        }

        for (i in dizi.indices){
            println(i) // output: 0 1 2 3 4 5 6 7
        }

        for (x in dizi.indices){
            var y = dizi[x] / 3 * 5
            println(y) // output: 20 25 30 35 40 45 50 55
        }

        for(b in 0..5){
            println(b)  // output: 0 1 2 3 4 5
        }

        for (m in dizi){
            println(m) // output: 12 15 18 21 24 27 30 33
        }

        dizi.forEach { println(it) } // output: 12 15 18 21 24 27 30 33

        println("********** FUNCTION ***********")

        test() // output: test function
        mySum(4,5)  // output: 9
        println(myMultiply(4,5)) // output: 20

        println("********** CLASS ***********")

        val homer = Simpson(60,"Homer","Nuc")
        println(homer.name) // output: Homer
        // Object & Instance
        homer.name="Homer Simpson"
        homer.age=50
        homer.job="Nuclear"

        println(homer.name) // output: Homer Simpson

        // Nullability
        // Nullable (?) & Non-null
        // !! vs ?

        var myString : String? = null
        var myAge : Int? = null

        println(myString) // outout: null
        println(myAge)    // output: null

        // 1)Null safety
        if(myAge != null){
            println(myAge * 10)
        }
        else{
            println("myAge null") // output: myAge null
        }

        //2)Safe call
        println(myAge?.compareTo(2)) // output: null

        //3)Elvis
        val myResult = myAge?.compareTo(2)  ?: -10
        println(myResult)  // output: -10




    }

    fun test(){
        println("test function")
    }

    fun mySum(a: Int,b: Int){
        println("result: "+(a+b))
    }

    fun myMultiply(x: Int,y:Int) : Int{
        return x * y;
    }



}