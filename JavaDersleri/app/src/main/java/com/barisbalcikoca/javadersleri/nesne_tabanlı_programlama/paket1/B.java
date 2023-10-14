package com.barisbalcikoca.javadersleri.nesne_tabanlı_programlama.paket1;

public class B {
    public void metod(){
        A a = new A();
        System.out.println(a.publicDegisken);//Her yerden erişim sağlanır
        System.out.println(a.protectedDegisken);//sadece aynı paket altında olduğu için erişebildi
        System.out.println(a.varsayilanDegisken);//Varsayılan demek protected demek
        //System.out.println(a.privateDegisken); --> ERİŞİLEMEZ
    }
}
