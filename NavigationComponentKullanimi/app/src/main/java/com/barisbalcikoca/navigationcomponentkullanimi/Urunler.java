package com.barisbalcikoca.navigationcomponentkullanimi;

import java.io.Serializable;

public class Urunler implements Serializable {//Serializable olması main_acitivity_nav.xml dosyasonda verinin geçiş yapacağı sayfa olan DetayFragment kısmında Urun eklememize yardımcı oluyor.

    private int id;
    private String ad;

    public Urunler() {

    }

    public Urunler(int id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
