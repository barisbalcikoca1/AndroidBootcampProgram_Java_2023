package com.barisbalcikoca.javadersleri.nesne_tabanlı_programlama;

public class Odev2Main {
    public static void main(String[] args) {
        Odev2 odev2 = new Odev2();

        //Kilometreyi mile dönüştürme için
        double sonuc = odev2.kilometreToMil(5);
        System.out.println("Mil Sonucu                         : " + sonuc);
        System.out.println("--------------------");

        odev2.dikdortgenAlan(5, 6);
        System.out.println("--------------------");

        int fakt = odev2.faktoriyel(5);
        System.out.println("Faktoriyel Sonucu                  : " + fakt);
        System.out.println("--------------------");

        odev2.kelimeHarfSayac("ben dedim kelime diye");
        System.out.println("--------------------");

        odev2.icAcilariToplamı(5);
        System.out.println("--------------------");

        odev2.maasHesabı(48);
        System.out.println("--------------------");

        odev2.otoparkUcreti(50);


    }
}
