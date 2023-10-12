package com.barisbalcikoca.javadersleri.nesne_tabanlı_programlama;

public class EnumKullanimi {
    public static void main(String[] args) {
        ucretAl(KonserveBoyutu.ORTA,100);

    }

    public static void ucretAl(KonserveBoyutu boyut, int adet ){ //üstte bulunan main içerisinde kullanabilmek için
                                    // metodun static olması gerekmektedir.

        switch (boyut){
            case KUCUK:
                System.out.println("Ücret : "+(adet*50)+" ₺");
                break;
            case ORTA:
                System.out.println("Ücret : "+(adet*80)+" ₺");
                break;
            case BUYUK:
                System.out.println("Ücret : "+(adet*100)+" ₺");
                break;
            default:
                System.out.println("Yanlış Seçtiniz:");
                break;
        }


    }
}
