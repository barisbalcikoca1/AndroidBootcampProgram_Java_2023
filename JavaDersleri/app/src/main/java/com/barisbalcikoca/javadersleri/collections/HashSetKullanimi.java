package com.barisbalcikoca.javadersleri.collections;

import java.util.HashSet;

public class HashSetKullanimi {
    public static void main(String[] args) {
        //Tanımlama
        //Arraylisten farklı olarak rastegele erişim için kullanılır.
        //Var olan eleman yeniden eklenemez

        HashSet<String> meyveler = new HashSet<>();

        meyveler.add("Elma");
        meyveler.add("Muz");
        meyveler.add("Kiraz");
        meyveler.add("Kiraz");//Burada eklemiş olarak göstersede 1 defa çıktıda yer alır
                            //İçeriği aynı olduğu için eklemez.

        System.out.println(meyveler);
        System.out.println(meyveler.size());
        System.out.println(meyveler.isEmpty());

        for(String m : meyveler)
        {
            System.out.println("Sonuç : "+m);
        }
        meyveler.remove("Muz");
        System.out.println(meyveler);

    }
}
