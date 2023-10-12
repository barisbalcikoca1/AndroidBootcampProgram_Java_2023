package com.barisbalcikoca.javadersleri.collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapKullanimi {
    public static void main(String[] args) {
        //Tanımlama
        HashMap<Integer,String> iller = new HashMap<>();

        //Veri ekleme
        iller.put(26,"Eskişehir");
        iller.put(16,"Bursa");
        iller.put(06,"Ankara");

        System.out.println(iller);

        //Güncelleme
        iller.put(26,"YeniEskişehir");
        System.out.println(iller);

        //Veri okuma
        String il = iller.get(06);
        System.out.println(il);

        System.out.println("Boyut   : "+iller.size());
        System.out.println("Boş mu? : "+iller.isEmpty());

        Set<Integer> anahtarlar = iller.keySet();

        for (Integer a : anahtarlar){
            System.out.println("Sonuç : "+iller.get(a)); //Bununla anahara ait olan değeri alırsın
            System.out.println(a); // bununla anahtar değerini alırsın
        }
    }
}
