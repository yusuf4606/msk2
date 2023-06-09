package day_01;

public class C02_KullaniciBilgileri {

    public static void main(String[] args) {



        /*
     isim, soyisim, yas, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
        Isim: ...
        Soyisim: ...
        Yas: ...
        Boy: ...
        Kilo: ...
Not: Sadece bir adet "System.out.println(); kullanınız.
*/
        String isim = "ALi";
        String soyIsim = "Can";
        int yas = 25;
        double boy = 1.85;
        double kilo = 79.5;

        // ctrl alt l ile daginik olan kodlar düzene sokulabilir
        /*
         String isim = "ALi";
                     String soyIsim = "Can";
        int yas = 25;
                  double boy = 1.85;
        double kilo = 79.5;

        // ctrl alt l ile daginik olan kodlar düzene sokulabilir
        String isim = "ALi";
        String soyIsim = "Can";
        int yas = 25;
        double boy = 1.85;
        double kilo = 79.5;


         */

        // Isim: Ali

        // "\n" ifadesi yazdirirken alt satira gecer ==> cift tirnak icinde "\n" yazilmasi gerekir

        System.out.println("Isim: " + isim + "\nSoyisim: " + soyIsim + "\nYas: " + yas + "\nBoy: " + boy + "\nKilo: " + kilo);

    }
}
