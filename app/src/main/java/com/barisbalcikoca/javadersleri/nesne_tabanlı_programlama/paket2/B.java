package com.barisbalcikoca.javadersleri.nesne_tabanlı_programlama.paket2;

import com.barisbalcikoca.javadersleri.nesne_tabanlı_programlama.paket1.A;

public class B {
    public void metod(){
        A a = new A(); // yazar yazmaz dikkat et paket1'i import etti. ---!!! dikkat

        //Protected verilere aynı paket altındaysan erişebilirsin bu nedenle A sınıfında var olan
        //protected int protectedDegisken = 3; ve int varsayilanDegisken = 1; //başına hiçbir şey koyulmazsa protected
        //degerlerine erişemedik.
        //Private olan değere sadece tanımlandığı sınıfta erişebilirsin bu nedenle erişelemez.
        System.out.println(a.publicDegisken);

    }
}
