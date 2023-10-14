package com.barisbalcikoca.javadersleri.standart_programlama;

public class Donguler {
    public static void main(String[] args) {
        //ctrl+alt+l ile kod yazım düzenini kolayca düzenleyebilirsiniz.
        //Loop - Döngüler
        //Tekrarlı işlem yapılması istenilen yerlerde kullanırız

        //i = 1        i<4 mü evet içeriye gir ve print kodunu yap sonra i ifadesini 1 arttır yeni i = 2
        //i = 2        i<4 mü evet içeriye gir ve print kodunu yap sonra i ifadesini 1 arttır yeni i = 3
        //i = 3        i<4 mü evet içeriye gir ve print kodunu yap sonra i ifadesini 1 arttır yeni i = 4
        //i = 4        i<4 mü HAYIR içeriye girme {} dışına çık
        for (int i = 1; i < 4; i++) {
            System.out.println(i);
        }
        System.out.println();//Çıktılar arasında boşluk olması için bir boş sout ifadesi yazıldı

        //10 ile 20 arasında 5 er artış
        for (int i = 10; i < 21; i += 5) {
            System.out.println(i);
        }
        System.out.println();//Çıktılar arasında boşluk olması için bir boş sout ifadesi yazıldı

        //20 ile 10 arasında 5 er azalsın
        for (int x = 20; x > 9; x -= 5) {
            System.out.println(x);
        }
        System.out.println();//Çıktılar arasında boşluk olması için bir boş sout ifadesi yazıldı

        //BREAK
        //1 dem 10 a kadar yazsın ama 8 e gelirse döngüyü terketsin istersek.(8 bastırılmaz)
        for (int i = 1; i < 11; i++) {
            if (i == 8) {
                break;
            }
            System.out.println(i);
        }
        System.out.println();//Çıktılar arasında boşluk olması için bir boş sout ifadesi yazıldı

        //CONTINUE
        //1 den 10 a kadar 5 hariç
        for (int i = 1; i < 11; i++) {
            //Eğer sout ifadesini bu işlemden önce yazarsak 5 i çoktan bastırmış oluruz
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println();//Çıktılar arasında boşluk olması için bir boş sout ifadesi yazıldı

        //WHILE
        int sayac = 1;
        while (sayac < 4) {
            System.out.println(sayac);
            sayac++;
            //sayac++ yerine sayac = sayac +1;  sayac+=1;   KULLANILABİLİR
        }
        System.out.println();//Çıktılar arasında boşluk olması için bir boş sout ifadesi yazıldı

    }
}
