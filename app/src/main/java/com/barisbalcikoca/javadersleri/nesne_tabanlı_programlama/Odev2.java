package com.barisbalcikoca.javadersleri.nesne_tabanlı_programlama;

public class Odev2 {
    public double kilometreToMil(double km) {
        double mile = (km * 0.621);
        return mile;
    }

    public void dikdortgenAlan(int kenar1, int kenar2) {
        int alan = kenar1 * kenar2;
        System.out.println("Dikdortgen Alan                    : " + alan);
    }

    public int faktoriyel(int sayi) {
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }

    public void kelimeHarfSayac(String kelime) {
        int sayac = 0;
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == 'e') {
                sayac++;
            }
        }
        System.out.println("Kelime içerisinde olan e sayısı    : " + sayac);
    }

    public int icAcilariToplamı(int kenarSayisi) {
        int icAcilariToplamı = ((kenarSayisi - 2) * 180);
        System.out.println("Kenar Sayısı " + kenarSayisi + " ise iç açıları toplamı : " + icAcilariToplamı);
        return icAcilariToplamı;
    }

    public int maasHesabı(int gunSayisi) {
        /*• 1 günde 8 saat çalışılabilir.
        • Çalışma saat ücreti : 40 ₺
        • Mesai saat ücreti : 80 ₺
        • 150 saat üzeri mesai sayılır.*/

        int toplamSaat = gunSayisi * 8;
        int toplamMaas = 0;

        if (toplamSaat > 150) {
            int mesaiSaati = toplamSaat - 150;
            toplamMaas = (mesaiSaati * 80) + (150 * 40);
        } else if (toplamSaat < 150) {
            toplamMaas = toplamSaat * 40;

        }
        System.out.println("Çalıştığı gün sayısı  " + gunSayisi + " olan bir kişinin aldığı maaş : " + toplamMaas);
        return toplamMaas;
    }

    public int otoparkUcreti(int otoparkSuresi) {
        /*Parametre olarak girilen otopark süresine göre otopark ücreti hesaplayarak geri döndüren metodu
        yazınız.
        • 1 saat = 50 ₺
        • 1 saat aşımından sonra her 1 saat , 10 ₺’dir.*/
        //Süreyi dakika cinsinden almak istedim. Bu nedenle dakika üzerinden saate ulaşıp işlem yapacağım
        int toplamOdenecek = 0;
        if (otoparkSuresi > 60) {
            int kalanDeger = otoparkSuresi - 60;
            int eklenecekDeger = (kalanDeger / 60) * 10;

            toplamOdenecek = 50 + eklenecekDeger;
            System.out.println("Otoparkta kaldığınız dakika " + otoparkSuresi + " ödeyeceğiniz ücret : " + toplamOdenecek);
        } else {
            toplamOdenecek = 50;
            System.out.println("Henüz 1 saati doldurmadınız giriş ücreti olarak " + toplamOdenecek + "₺ alınacak.");
        }
        return toplamOdenecek;


    }


}
