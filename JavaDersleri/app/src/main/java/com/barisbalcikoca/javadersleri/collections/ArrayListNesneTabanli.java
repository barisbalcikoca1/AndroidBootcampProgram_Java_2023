package com.barisbalcikoca.javadersleri.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListNesneTabanli {
    public static void main(String[] args) {
        Urunler u1 = new Urunler(1, "Telefon", 23000);
        Urunler u2 = new Urunler(2, "Süpürge", 10000);
        Urunler u3 = new Urunler(3, "Bilgisayar", 34000);

        ArrayList<Urunler> urunlerListesi = new ArrayList<>();
        urunlerListesi.add(u1);
        urunlerListesi.add(u2);
        urunlerListesi.add(u3);

        System.out.println("Sıralama Fiyat Eklendiği Sıra İle");
        for (Urunler u : urunlerListesi) {
            System.out.println("Id : " + u.getId() + " - Ad : " + u.getAd() + " - Fiyat : " + u.getFiyat());
        }
        System.out.println();

        System.out.println("Sıralama Fiyat Artan");

        Collections.sort(urunlerListesi, new SiralamaFiyatArtan());//Artan sıralama için kullanıldı
        //Sıraladıktan sonra bir kez daha for each içinde tek tek bastırıldı
        for (Urunler u : urunlerListesi) {
            System.out.println("Id : " + u.getId() + " - Ad : " + u.getAd() + " - Fiyat : " + u.getFiyat());
        }

        System.out.println("Sıralama Fiyat Azalan");

        Collections.sort(urunlerListesi, new SiralamaFiyatAzalan());//Azalan sıralama için kullanıldı
        for (Urunler u : urunlerListesi) {
            System.out.println("Id : " + u.getId() + " - Ad : " + u.getAd() + " - Fiyat : " + u.getFiyat());
        }

        System.out.println("Sıralama Ad Artan");

        Collections.sort(urunlerListesi, new SiralamaAdArtan());//Azalan sıralama için kullanıldı
        for (Urunler u : urunlerListesi) {
            System.out.println("Id : " + u.getId() + " - Ad : " + u.getAd() + " - Fiyat : " + u.getFiyat());
        }

        System.out.println("Sıralama Ad Azalan");

        Collections.sort(urunlerListesi, new SiralamaAdAzalan());//Azalan sıralama için kullanıldı
        for (Urunler u : urunlerListesi) {
            System.out.println("Id : " + u.getId() + " - Ad : " + u.getAd() + " - Fiyat : " + u.getFiyat());
        }
    }

    public static class SiralamaFiyatArtan implements Comparator<Urunler> {
        @Override
        public int compare(Urunler u1, Urunler u2) {
            return new Integer(u1.getFiyat()).compareTo(u2.getFiyat());
        }
    }

    public static class SiralamaFiyatAzalan implements Comparator<Urunler> {
        @Override
        public int compare(Urunler u1, Urunler u2) {//İkinci elemani ilk yazarsan azalan sıralama ile yapar.
            return new Integer(u2.getFiyat()).compareTo(u1.getFiyat());
        }
    }

    public static class SiralamaAdArtan implements Comparator<Urunler> {
        @Override
        public int compare(Urunler u1, Urunler u2) {
            return u1.getAd().compareTo(u2.getAd());
        }
    }

    public static class SiralamaAdAzalan implements Comparator<Urunler> {
        @Override
        public int compare(Urunler u1, Urunler u2) {
            return u2.getAd().compareTo(u1.getAd());
        }
    }
}
