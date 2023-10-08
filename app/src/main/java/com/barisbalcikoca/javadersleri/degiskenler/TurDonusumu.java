package com.barisbalcikoca.javadersleri.degiskenler;

public class TurDonusumu {
    public static void main(String[] args) {
        //Tür Dönüşümü - Type Casting
        //Sayısaldan sayısala
        int i = 67;
        double d = 45.78;

        int sonuc1 = (int) d;//explicit : açıklamalı , büyüğü küçüğe dönüştürürken açıklama olacak.
        double sonuc2 = i;//unexplicit : açıklama olmadan
        System.out.println(sonuc1);
        System.out.println(sonuc2);

        //Sayısaldan Metine
        String sonuc3 = String.valueOf(d);//"45.78"
        String sonuc4 = String.valueOf(i);//"67"
        System.out.println(sonuc3);
        System.out.println(sonuc4);

        //Metinden sayısala
        String yazi1 = "56";//int
        String yazi2 = "23.87";//double

        int sonuc5 = Integer.parseInt(yazi1);
        double sonuc6 = Double.parseDouble(yazi2);
        System.out.println(sonuc5);
        System.out.println(sonuc6);

    }
}