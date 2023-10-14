package com.barisbalcikoca.javadersleri.nesne_tabanlı_programlama;

public class FonksiyonlarMain {
    public static void main(String[] args) {
        Fonksiyonlar fonksiyonlar = new Fonksiyonlar();
        fonksiyonlar.selamla1();


        String gelenSonuc = fonksiyonlar.selamla2();
        System.out.println("GelenSonuc : " + gelenSonuc);

        fonksiyonlar.selamla3("Barış");

        int gelenToplam = fonksiyonlar.toplama(10, 20);
        System.out.println("Gelen Toplam : " + gelenToplam);

        fonksiyonlar.carp(3,5,6);

        fonksiyonlar.toplamHesapla(4,5,6,7,8,9,1,10);//SONSUZ PARAMETRELİ METOD --> VARARGS

    }
}
