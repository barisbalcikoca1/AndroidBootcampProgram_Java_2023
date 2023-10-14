package com.barisbalcikoca.javadersleri.nesne_tabanlı_programlama;

public class Araba {
    String renk;
    int hiz;
    boolean calisiyorMu;


    public Araba() {//init metodu
        System.out.println("BOŞ constructor çalıştı");
    }

    public Araba(String renk, int hiz, boolean calisiyorMu) {
        System.out.println("DOLU constructor çalıştı");
        //this class içerisinde bulunan içeriğe gider
        this.renk = renk;//Shadowing
        this.hiz = hiz;
        this.calisiyorMu = calisiyorMu;
    }

    public void calistir() { //Side effect : Yan etki
        calisiyorMu = true;
        hiz = 5;
    }

    public void durdur() {
        calisiyorMu = false;
        hiz = 0;
    }

    public void hizlan(int kacKm) {
        hiz += kacKm;
    }

    public void yavasla(int kacKm) {
        hiz -= kacKm;
    }

    public void bilgiAl() {
        System.out.println("--------------------------");
        System.out.println("Renk            : " + renk);
        System.out.println("Hız             : " + hiz);
        System.out.println("Calışıyor Mu?   : " + calisiyorMu);

    }
}
