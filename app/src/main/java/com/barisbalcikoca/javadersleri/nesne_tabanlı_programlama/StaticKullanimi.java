package com.barisbalcikoca.javadersleri.nesne_tabanlı_programlama;

public class StaticKullanimi {
    public static void main(String[] args) {
        ASinifi aSinifi = new ASinifi();//Tek bir nesneden metoda ve değişkene ulaşmayı sağlar
        //Performans olarak by daha uygun

        System.out.println(aSinifi.x);
        aSinifi.metod();

        //Sanal nesne veya isimsiz nesne oluşturma
        //System.out.println(new ASinifi().x);//1.Nesne
        //new ASinifi().metod();//2.Nesne


        //Altta yazılan iki kod ise Static sınıflar static metotlara direkt ulaşabildiği için
        //Bunun kullanımı gösterilmiştir
        System.out.println(ASinifi.x);
        ASinifi.metod();
    }
}
