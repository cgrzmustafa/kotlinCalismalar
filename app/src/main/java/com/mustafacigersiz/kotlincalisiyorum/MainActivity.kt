package com.mustafacigersiz.kotlincalisiyorum

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        println("Merhaba Dünya")
        println("loglara ikinci yazdırıılacak satır")
        // yorum satırı
        println(5 * 4)
        println(10 / 5)
        println(10 / 4)

        //Kotlinde yazı tipleri ve değişkenler


        //Integer - Tam sayı
        println("----------Integer----------")
        var x = 10
        println(x)
        println(x * 20)

        x = 30
        println(x * 30)

        var y = 5
        println(y)
        println(x + y)
        // var atadığımız değeri tutar değişiklik yaptırır.

        //implicit
        val z = 20
        println(z * 50)
        // val atadığımız değeri tutar değişiklik yaptırmaz.

        val ornek : Long = 10
        println(ornek * 10)

        // explicit
        val ornekShort : Short = 20
        val ornekByte : Byte = 15
        val ornekInt : Int = 30
        println(ornekByte * ornekShort)


        val kullaniciyasi = 35
        val kullanici_yasi = 35
        val kullaniciYasi = 35

        // snake_case
        // camelCase

        val m = 10
        val n = 20
        val sonuc = m + n
        println(sonuc)

        // Double - Float - Kesirli sayılar
        println("--------Double&Float--------")
        val pi = 3.14
        println(pi * 2)

        println(5/2)
        println(5.0/2.0)
        val ornekDouble = 3.0

        val sonucDouble =  pi * ornekDouble
        println(sonucDouble)

        val ornekFloat : Float = 2.25f
        println(ornekFloat * 2)

        //Unsigned Integer
        val unsignedByte : UByte = 10u
        val unsignedShort : UShort = 10u
        val unsignedInteger : UInt = 10u
        val unsignedLong : ULong = 10u

        //String -> metinler
        println("------String-------")

        val benimString = "Benim String'im"
        println(benimString)

        val ornekString : String = "ornek"

        val isim = "Mustafa"
        println(isim.uppercase())

        val soyisim = "Ciğersiz"
        println(isim + " " + soyisim)

        val yas = "15"
        val ornekDeger = "20"
        println(yas + ornekDeger)

        val benimstr : String
        //benimstr.uppercase()
        benimstr = "benim stringim" //initilaze, init, initialization

        //Conversion
        val yasInt = yas.toInt()
        println(yasInt * 20)

        val xLong = x.toLong()
        println(xLong)


        //Boolean
        println("--------Boolean---------")

        var benimBool : Boolean = true
        benimBool = false

        println(3 > 5)
        println(3 < 5)
        println(5 == 5)

        val kullaniciYas = "30"
        println(kullaniciYas.toInt() > 18)

        // <       küçüktür
        // >       büyüktür
        // <=      küçük eşit
        // >=      büyük eşit
        // ==      eşittir
        // !=      eşit değildir
        // &&      ve
        // ||      veya

        println("mustafa" == "mustafa")
        println(10 != 10)

        println(4>3 && 3>5)
        println(4>3 || 3>5)


        // Veri Yapıları

        // Diziler-Array

        println("---------Array---------")

        val stringOrnegi = "mustafa"

        val benimDizim = arrayOf(stringOrnegi,"ciğersiz","zeynep","ahmet","ali")

        println(benimDizim[0])
        println(benimDizim[1])

        println(benimDizim.last())

        benimDizim[1] = "ciğer"

        println(benimDizim[1])
        println(benimDizim.get(3))

        //benimDizim[5] = "yeni eleman"
        //println(benimDizim[5])

        val numaraDizisi = arrayOf(1,10,20,15,2,4)
        println(numaraDizisi[3] * 10)

        val karisikDizi = arrayOf(10,3.14,20,"mustafa",false,true)
        println(karisikDizi[2])


        println("---------ArrayList---------")

        val isimListesi = arrayListOf("mustafa","ciğersiz","zeynep")

        println(isimListesi[0])
        println(isimListesi[1])
        println(isimListesi[2])

        println(isimListesi.size)
        isimListesi.add("mahmut")
        println(isimListesi.get(3))
        isimListesi[3] = "mehmet"
        println(isimListesi.get(3))

        //isimListesi.removeAt(3)

        val numaraListesi = arrayListOf<Int>()
        val digerOrnekListe = ArrayList<Int>()

        numaraListesi.add(10)
        numaraListesi.add(20)
        numaraListesi.add(30)

        digerOrnekListe.add(40)
        digerOrnekListe.add(50)
        digerOrnekListe.add(60)

        println(numaraListesi[1] * digerOrnekListe[2])

        val karisikListe = arrayListOf(10,3.14,"atıl",true)
        val karisikBosListe = arrayListOf<Any>()
        karisikBosListe.add(10)
        karisikBosListe.add("mustafa")
        karisikBosListe.add(false)

        println(karisikBosListe.get(0))

        println("---------Set----------")

        val ornekDizi = arrayOf(10,10,10,10,20,30,40)

        println(ornekDizi[0])
        println(ornekDizi[1])

        val ornekSet = setOf(10,10,10,10,20,30,40)
        println(ornekSet.size)

        ornekSet.forEach {
            println(it)
        }

        val bosSetOrnegi = HashSet<String>()

        bosSetOrnegi.add("mustafa")
        bosSetOrnegi.add("mustafa")
        bosSetOrnegi.add("mustafa")
        bosSetOrnegi.add("mustafa")
        bosSetOrnegi.add("zeynep")

        bosSetOrnegi.forEach {
            println(it)
        }

        val ornekTekilSet = ornekDizi.toHashSet()
        ornekTekilSet.forEach {
            println(it)
        }

        println("---------Map---------")

        //Anahtar - Değer Eşleşmesi

        val yemekDizisi = arrayListOf("elma","armut","karpuz")
        val kaloriDizisi = arrayListOf(100,150,200)

        println("${yemekDizisi[0]}'nın kalorisi ${kaloriDizisi[0]}")

        val yemekKaloriMap = hashMapOf<String, Int>()
        yemekKaloriMap.put("elma",100)
        yemekKaloriMap.put("armut",150)
        yemekKaloriMap.put("karpuz",200)

        println(yemekKaloriMap["elma"])
        println(yemekKaloriMap.get("armut"))

        yemekKaloriMap.put("elma",300)
        println(yemekKaloriMap.get("elma"))

        val ornekHashMap = HashMap<String, String>()
        ornekHashMap.put("mustafa","ciğersiz")
        ornekHashMap.put("abc","def")

        println("-----------If Kontrolleri-----------")

        println(3 > 5)

        var sayi = 10
        sayi = sayi + 1
        println(sayi)
        sayi++
        println(sayi)
        sayi--
        println(sayi)

        //kalanını bulma - remainder
        println(10 % 4)

        val skor = 30

        if (skor < 10) {
            println("oyunu kaybettiniz")
        } else if (skor >= 10 && skor < 20) {
            println("oyunda idare eder bir skor aldınız")
        } else if (skor >= 20 && skor < 30) {
            println("güzel bir skor aldınız")
        } else {
            println("çok güzel bir skor aldınız")
        }

        println("----------When----------")

        val notRakam = 4
        var notString = ""

        when(notRakam) {
            0 -> notString = "Geçersiz not"
            1 -> notString = "Zayıf"
            2 -> notString = "Kötü"
            3 -> notString = "Orta"
            4 -> notString = "İyi"
            5 -> notString = "Pek iyi"
            else -> notString = "Böyle bir not bilmiyoruz"
        }
        println(notString)

        println("----------While Döngüsü----------")

        var j = 0
        println("Döngü başladı")
        while (j <= 10) {
            println(j)
            j = j+1
        }
        println("Döngü bitti")


        println("----------For Döngüsü-----------")

        val baskaDizi = arrayListOf(5,10,15,20,25,30)
        println(baskaDizi[0] / 5 * 3)
        println(baskaDizi[1] / 5 * 3)

        println("Döngü başladı")
        for (numara in baskaDizi) {
            println(numara / 5 * 3)
        }
        println("Döngü bitti")

        //range
        for (num in 0..9) {
            println(num * 10)
        }

        val benimStringDizim = ArrayList<String>()
        benimStringDizim.add("Mustafa")
        benimStringDizim.add("Ciğersiz")

        for (kelime in benimStringDizim) {
            println(kelime.uppercase())
        }

        benimStringDizim.forEach {
            println(it.uppercase())
        }




























































    }
}