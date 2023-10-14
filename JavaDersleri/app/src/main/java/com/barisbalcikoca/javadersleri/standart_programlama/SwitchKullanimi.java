package com.barisbalcikoca.javadersleri.standart_programlama;

public class SwitchKullanimi {
    public static void main(String[] args) {
        int gun = 3;

        switch (gun) //KOTLİN DİLİNDE : When Kullanılır.
        {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;//Buradaki break komutu silinirse bir alttaki çalışır ve break görene kadar
                    // tüm case ifadelerine girer
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default://Hiçbir case değerine uymazsa çalışacak kısım default olarak kullanılır
                System.out.println("Gün Yok");
                break;
        }
    }
}
