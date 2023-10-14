package com.barisbalcikoca.javadersleri.nesne_tabanlı_programlama;

public class ArabaMain {
    public static void main(String[] args) {

        Araba bmw = new Araba("Mavi",100,true);
        /*bmw.renk = "mavi";
        bmw.hiz = 100;
        bmw.calisiyorMu = true;*/
        bmw.bilgiAl();
        bmw.durdur();
        bmw.bilgiAl();
        bmw.calistir();
        bmw.bilgiAl();
        bmw.hizlan(100);
        bmw.bilgiAl();
        bmw.yavasla(40);
        bmw.bilgiAl();

        Araba sahin = new Araba();
        sahin.renk = "beyaz";
        sahin.hiz = 0;
        sahin.calisiyorMu = false;
        sahin.bilgiAl();
        sahin.calistir();
        sahin.bilgiAl();
        sahin.durdur();
        sahin.bilgiAl();
        sahin.calistir();
        sahin.bilgiAl();
        sahin.hizlan(48);
        sahin.bilgiAl();
        sahin.yavasla(10);
        sahin.bilgiAl();




    }
}
