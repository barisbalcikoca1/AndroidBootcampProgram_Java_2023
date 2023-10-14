package com.barisbalcikoca.javadersleri.nesne_tabanlı_programlama.composition;

public class CompositionKullanimi {
    public static void main(String[] args) {
        Kategoriler k1 = new Kategoriler(1,"Dram");
        Kategoriler k2 = new Kategoriler(2,"Komedi");

        Yonetmenler y1 = new Yonetmenler(1,"Ali Atay");
        Yonetmenler y2 = new Yonetmenler(2,"Nur Bilge Ceylan");

        Filmler f1 = new Filmler(1,"Ölümlü Dünya",2018,k2,y1);
        Filmler f2 = new Filmler(2,"Ahlat Ağacı",2018,k1,y2);

        System.out.println("Film id         : "+f1.getFilm_id());
        System.out.println("Film ad         : "+f1.getFilm_ad());
        System.out.println("Film yıl        : "+f1.getFilm_yil());
        System.out.println("Film kategori   : "+f1.getKategori().getKategori_ad());
        System.out.println("Film yönetmen   : "+f1.getYonetmen().getYonetmen_ad());

        System.out.println();

        System.out.println("Film id         : "+f2.getFilm_id());
        System.out.println("Film ad         : "+f2.getFilm_ad());
        System.out.println("Film yıl        : "+f2.getFilm_yil());
        System.out.println("Film kategori   : "+f2.getKategori().getKategori_ad());
        System.out.println("Film yönetmen   : "+f2.getYonetmen().getYonetmen_ad());
    }
}
