package day_01;

public class day_02 {
    // iki sayinin kareleri toplamini bulan ve yazdiran bir method olusturunuz
    // main methodun icinde tanimladigim iki sayinin kareleri toplamini bulan ve yazdiran bir method olusturun

    public static void main(String[] args) {
        int a= 2 , b= 3;
        kareToplaYazdir(a,b); // parantez icindeki ifadeler "Argument" olarak adlandirilir
        // Ornek 2; 6 ve 7 nin kareleri toplami

        kareToplaYazdir(6,7);




    }

    public static void kareToplaYazdir(int sayi1, int sayi2){
        int toplam=sayi1*sayi1+sayi2*sayi2;
        System.out.println("toplam = " + toplam);
    }


}
