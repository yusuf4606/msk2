package day_02;

import java.util.Scanner;

public class C03_Scanner {
    //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
    //yani alınan iki sayının kareleri esıt ıse true, degıl ıse false yazdırın

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        boolean sonuc1 = karelerEsitMi(sayi1,sayi2);
        System.out.println("sonuc1 = " + sonuc1);


    }
    public static boolean karelerEsitMi(int a, int b){
        boolean sonuc = (a*a) == (b*b);
        return sonuc;


    }



}
