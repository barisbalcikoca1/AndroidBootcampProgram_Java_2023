package com.barisbalcikoca.javadersleri.collections;

import java.util.ArrayList;

public class ArrayListKullanimi {
    public static void main(String[] args) {
        //Tanımlama
        ArrayList<String> meyveler = new ArrayList<>();

        //Veri Ekleme add--> 0.indexden başlar
        meyveler.add("Muz");
        meyveler.add("Elma");
        meyveler.add("Çilek");
        System.out.println(meyveler);

        //Güncelleme set--> değişecek index ve yeni değeri
        meyveler.set(1,"Yeni Elma");
        //meyveler.set(3,"HATA"); ARRAY INDEX OUT OF BOUNDS hatası alınır çünkü 3. indexe ait veri yok


        //Insert -->indexli veri ekleme. Eğer düz bir şekilded add dersek veriyi son index olarak ekler
        //          Eğer insert ile eklersek hangi indexe istersek oraya ekleriz
        meyveler.add(0,"index ile eklenen veri");
        System.out.println(meyveler);

        //Veri okuma
        String meyve = meyveler.get(1); //burada bir şeye dikkat etmelisin. get 0 dan başlamaz. 1.eleman gelir
        System.out.println(meyve);

        //Length ve size burada size kullanılıyor
        System.out.println("Boyut   : "+meyveler.size());
        System.out.println("Boş mu  : "+meyveler.isEmpty());
        System.out.println();

        //For each
        for (String mey : meyveler){
            System.out.println("Sonuç : "+mey);
        }
        System.out.println();
        for (int i =0; i<meyveler.size();i++){
            System.out.println(i+". -->"+meyveler.get(i));
        }
        System.out.println();

        //Silme için remove kullanılır
        //System.out.println(meyveler.remove(1));

        //Tamamını silmek için clear kullanılır
        //meyveler.clear();
    }
}
