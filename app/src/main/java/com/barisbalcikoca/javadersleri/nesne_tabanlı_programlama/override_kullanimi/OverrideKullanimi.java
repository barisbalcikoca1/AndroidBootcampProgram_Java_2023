package com.barisbalcikoca.javadersleri.nesne_tabanlı_programlama.override_kullanimi;

public class OverrideKullanimi {
    public static void main(String[] args) {
        Hayvan hayvan = new Hayvan();
        Memeli memeli = new Memeli();
        Kedi kedi = new Kedi();
        Kopek kopek = new Kopek();

        hayvan.sesCikar();//Kalıtım yok kendi metodu
        memeli.sesCikar();//üst sınıftaki metoda erişti
        kedi.sesCikar();//Kendi fonksiyonlarını çalıştırdı-->Kalıtım var
        kopek.sesCikar();//Kendi fonksiyonlarını çalştırdı --> Kalıtım var
    }
}
