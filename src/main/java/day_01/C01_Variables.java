package day_01;

public class C01_Variables {



    public static void main(String[] args) {

        //Bir variable olustur, yazdır
        //Olusturdugun variable'ı farkli bir variable'a kopyala
        //Aynı satırda coklu variable deklare et
        //Bir variable degerini guncelle
        //Degişkenleri(variable) yazdır

        //Bir variable olustur, yazdır

        int yas = 32;

        int sayi = 50;

        System.out.println(yas);

        System.out.println("yas = " + yas);

        System.out.println(sayi);

        // "soutv " atiketi ile yazdirir ====> System.out.println("sayi = " + sayi);
        // variable ismi ni yazip "." koyabiliriz
        // sayi.soutv ==> System.out.println("sayi = " + sayi);

        System.out.println("sayi = " + sayi);

        String isim = "Ali";

        // camelCase
        // PascalCase
        // snake_case
        // kebab-case

        System.out.println("isim = " + isim);

        //Olusturdugun variable'ı farkli bir variable'a kopyala

        int benimYasim = yas;

        System.out.println("benimYasim = " + benimYasim);

        String onunismi = isim;

        System.out.println("onunismi = " + onunismi);

        System.out.println("onunismi = " + onunismi);

        // Variavle ismini her yerde degistirmek icin
        // variable ustune gelinir ve sag tiklanir ==> Refactor ==> rename all occurens
        // ve yeni variable ismi yazilir

        //Aynı satırda coklu variable deklare et

        int yil = 2023, ay = 4 , gün = 21 ;

        System.out.println("yil = " + yil);

        //Bir variable degerini guncelle

        yil = 2024;

        System.out.println("yil = " + yil);

        // java yukaridan asagi ve soldan saga dogru calisir, java run time programing dir

        //Bir variable deklere et : x

        double x ;

        //Bir variable baslat : y

        double y = 12.5;
        //Başka bir variable başlat : z

        double z = 33;


        //x degişkenini y degişkeni ile başlat

        x= y ;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        //Variable y'i 14.9 olarak guncelle

        y = 14.9 ;

        //Degişkenleri yazdır

        System.out.println("x = " + x);

        System.out.println("y = " + y);


    }

}
