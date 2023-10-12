package com.barisbalcikoca.javadersleri.ileri_java;

public class HataYakalama {
    public static void main(String[] args) {
        //1. Compile Error --> YAZARKEN HATA
        String mesaj = "Merhaba";
        //mesaj = 100;

        //2.Runtime Error : Exception --> ÇALIŞTIRDIKTAN SONRA HATA
        int x = 10;
        int y = 0;

        try {
            System.out.println("Sonuç : "+(x/y)); //DIVIDE BY ZERO hayası alınır
        }catch (Exception e){//HATA yakalanması durumunda buraya düşer
            System.out.println("İkinci Sayı Sıfır Olamaz");
        }
    }
}
