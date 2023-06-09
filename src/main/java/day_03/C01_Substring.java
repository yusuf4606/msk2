package day_03;

import java.util.Scanner;

public class C01_Substring {
    public static void main(String[] args) {

        /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ad ve soyadinizi aralarinda bir bosluk olacak sekilde giriniz\n"
                +"Yalnizca bir ad bir soyad girilmeli");

        String adSoyad = scan.nextLine();
        int spaceIndex = adSoyad.trim().indexOf(" ");   // Space " " karakterinin indexini aldik
        String ad = adSoyad.substring(0,spaceIndex);
        String soyad = adSoyad.substring(spaceIndex+1);
        // ad in ilk karakterini buyuk harf olacak sekilde aliyoruz
        char adIlkHarf = ad.toUpperCase().charAt(0);
        // ad in ilk harf disindaki kismini aliyoruz
        String adGeriKalan = ad.substring(1).toLowerCase();
        // ad in ilk harf ve geri kalan kismini birlestiriyoruz
        ad = adIlkHarf+adGeriKalan;

        char soyAdIlkHarf = soyad.toUpperCase().charAt(0);
        String soyAdGeriKalan = soyad.substring(1).toLowerCase();
        soyad = soyAdIlkHarf+soyAdGeriKalan;

        System.out.println("  Ad : " +ad+"\n Soyad : "+soyad);







    }
}
