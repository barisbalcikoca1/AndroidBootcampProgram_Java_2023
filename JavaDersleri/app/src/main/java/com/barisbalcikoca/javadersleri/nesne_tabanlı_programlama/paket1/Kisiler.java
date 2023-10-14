package com.barisbalcikoca.javadersleri.nesne_tabanlı_programlama.paket1;

public class Kisiler {
    //ENCAPSULATION --> SET and GET metodu
    private String ad;

    public Kisiler() {
    }
    public Kisiler(String ad) {
        this.ad = ad;
    }

    public String getAd() {// Erişim
        System.out.println(ad);
        return ad;
    }

    public void setAd(String ad) {//Değer Atama
        this.ad = ad;
    }
}
