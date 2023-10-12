package com.barisbalcikoca.javadersleri.nesne_tabanlı_programlama.interface_kullanimi;

public class MyClass implements MyInterface{

    @Override
    public void metod1() {
        System.out.println("Metot 1 Çalıştı");

    }

    @Override
    public String metod2() {
        return "Metot 2 Çalıştı";
    }
}
