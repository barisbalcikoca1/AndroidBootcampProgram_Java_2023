package com.barisbalcikoca.javadersleri.nesne_tabanlı_programlama.inheritance;

public class KalitimKullanimi {
    public static void main(String[] args) {
        Saray topkapiSaray = new Saray();
        topkapiSaray.setKuleSayisi(10);
        topkapiSaray.setPencereSayisi(300);

        System.out.println(topkapiSaray.getKuleSayisi());
        System.out.println(topkapiSaray.getPencereSayisi());

        Villa bogazVilla = new Villa();
        bogazVilla.setGarajVarMi(true);
        bogazVilla.setPencereSayisi(200);

        System.out.println(bogazVilla.isGarajVarMi());
        System.out.println(bogazVilla.getPencereSayisi());

        //Type casting --> TİP DÖNÜŞÜMÜ
        //!!!Tip dönüşümü olabilmesi için kalıtım ilişkisi gerekmektedir.!!!
        //Downcasting: Ev superclassının Saray ve Villa subclassına dönüşmesi
        //Upcasting:   Saray veya Villa subclassının Ev superclassına dönüşmesi

        //Unutma saray villaya villa da saraya dönüşemez...

        //Tip Kontrolü sağlayabilmek için instanceof kullanılır. --> farklı dillerde is olarak geçebilir.
        /*if(topkapiSaray instanceof Saray)
        {
            System.out.println("Saraydır");
        }*/

        //Upcasting --> subclass superclass a çevrilir
        Saray saray = new Saray();
        Ev ev = saray;

        //Downcasting -->superclass subclass a çevrilir
        Ev ev2 = new Ev();
        Saray saray2 = (Saray)ev2; //() içindeki ifade yazılmazsa hata alınır.


    }
}
