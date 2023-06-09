package day_04;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {
        /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next().toLowerCase();

        int sayac = 0; // a harflerinin sayisini koyacagimiz konteyner

        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == 'a') {
                sayac++;
            } else if (kelime.charAt(i) == 'c') {
                break;
            }
        } // code lari hizalamak icin CTRL+ALT+L
        System.out.println("Girdiginiz kelimedeki ilk c 'ye kadar  a harflerinin sayiyi : " + sayac);
    }
}
