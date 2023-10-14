package com.barisbalcikoca.javadersleri.nesne_tabanlı_programlama.override_kullanimi;

//Override ile Overloading karışmaktadır. Burada bu hususa dikkat edilmesi gerekmektedir.
//Override = KALITIM ilişkisi içeren bir olay örgüsünde meydana gelir.
//           Bu işlem şu şekilded açıklanabilir.
//           Hayvan sınıfı ve Kedi sınıfı bulunmakta Kedi Hayvandan miras alıyor.
//           Hayvan ve Kedi sınıfı içerisinde aynı metotlar aynı isimle anılıyor.
//           Bu durumda Kedi sınıfı kendi metodunu kullanır ve Miras aldığı metodu ezer.


//OVERLOADING ise aynı sınıf içerisinde meydana gelmektedipr bir kalıtım olayı yoktur.
//Örnek vermek gerekirse:
//Toplama fonksiyonu yazıldığını düşünelim ve geri dönüş tipi void olsun
//2 parametre alan ismi toplama olan metot
//3 parametre alan ismi toplama olan metot
//2 parametre alan ismi toplama olan geri dönüş tipi int olan metot
//İŞTE bu olaya Overloading denir.