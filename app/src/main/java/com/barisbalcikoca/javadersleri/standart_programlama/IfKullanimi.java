package com.barisbalcikoca.javadersleri.standart_programlama;

public class IfKullanimi {
    public static void main(String[] args) {
        int yas = 17;
        String isim = "Barış";

        if(yas>=18){
            System.out.println("Reşitsiniz");
        } else{
            System.out.println("Reşit Değilsiniz...");
        }

        if(isim == "Barış"){ //equals() kullanılabilir.
            System.out.println("Merhaba "+isim);
        } else if (isim.equals("...")){
            System.out.println("Equals Kullanımı");
        }else{
            System.out.println("Tanınmayan kişi");
        }
        //-------------------------------------
        String id = "admin";
        int password = 1234;

        if(id =="admin" && password==1234){
            System.out.println("Başarılı Kayıt Girişi");
        } else if(id =="admin" && password!=1234)
        {
            System.out.println("Şifre Yanlış");
        } else if(id !="admin" && password==1234)
        {
            System.out.println("Kullanıcı Adı Yanlış");
        } else{
            System.out.println("Kullanıcı Adı ve Şifre Yanlış");
        }
        //-------------------------------------

    }
}
