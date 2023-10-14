package com.barisbalcikoca.javadersleri.degiskenler;

public class DegiskenOlusturma {
    public static void main(String[] args) {
        String ogrenciAdi = "Ahmet";
        int ogrenciYas = 23;
        double ogrenciBoy = 1.78;
        char ogrenciBasharf = 'A';
        boolean ogrenciDevamEdiyorMu = true;

        System.out.println(ogrenciAdi);
        System.out.println(ogrenciYas);
        System.out.println(ogrenciBoy);
        System.out.println(ogrenciBasharf);
        System.out.println(ogrenciDevamEdiyorMu);

        int urun_id = 3416;
        String urun_adi = "Kol saati";
        int urun_adet = 100;
        float urun_fiyat = 149.99f;
        String urun_tedarikci = "Rolex";

        System.out.println("Ürün id        : "+urun_id);
        System.out.println("Ürün adı       : "+urun_adi);
        System.out.println("Ürün adet      : "+urun_adet);
        System.out.println("Ürün fiyat     : "+urun_fiyat+" ₺");
        System.out.println("Ürün tedarikçi : "+urun_tedarikci);
    }
}