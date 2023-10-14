package com.barisbalcikoca.javadersleri.nesne_tabanlı_programlama;

public class Fonksiyonlar {
    //void : geri dönüş değeri olmayan fonksiyonlar
    public void selamla1() {
        String sonuc = "Merhaba Barış";
        System.out.println(sonuc);
    }

    //return : geri dönüş değeri olan fonksiyonlar
    public String selamla2() {
        String sonuc = "Merhaba Barış";
        return sonuc;
    }

    //Parametreli fonskiyon
    public void selamla3(String isim) {
        String sonuc = "Merhaba "+isim;
        System.out.println(sonuc);
    }

    public int toplama(int sayi1, int sayi2){
        int toplam = sayi1+sayi2;
        return toplam;
    }

    //overloading --> aynı isme sahip fonksiyonlarda parametre sayısı aynı fakat tip farklı ise
                        // veya aynı isme sahip fonksiyonlarda parametre sayısı farklı ise
    public void carp (int sayi1, int sayi2){
        System.out.println("Çarpım Sonucu : "+ (sayi1*sayi2));
    }
    public void carp (int sayi1, int sayi2, int sayi3){
        System.out.println("Çarpım Sonucu : "+ (sayi1*sayi2*sayi3));
    }
    public double carp (double sayi1, double sayi2){
        return (sayi1*sayi2);
    }

    //SONSUZ PARAMETRERLİ METOD

    public int toplamHesapla(int ... sayilar){
        int toplam = 0;
        for (Integer sayi:sayilar)
        {
            toplam+=sayi;
        }
        System.out.println("Toplam Sonucu : "+toplam);
        return toplam;
    }



}
