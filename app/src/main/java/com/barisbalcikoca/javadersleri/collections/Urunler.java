package com.barisbalcikoca.javadersleri.collections;

public class Urunler {
    private int id;
    private String ad;
    private  int fiyat;

    public Urunler() {
    }

    public Urunler(int id, String ad, int fiyat) {
        this.id = id;
        this.ad = ad;
        this.fiyat = fiyat;
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

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
}
