package day_04;

import java.util.Scanner;

public class C03_Switch {
    public static void main(String[] args) {
        // Kullanicidan uc basamakli bir sayi sisteme girmesini isteyiniz
        // bu sayiyi okunusuna ceviren kodu yaziniz

        Scanner scan  = new Scanner(System.in);
        System.out.println("Lutfen uc basamakli bir sayi giriniz...");
        int sayi = scan.nextInt();

        //125
        //yuz
        //yirmi
        //bes

        // kullanicinin girdigi sayinin 3 basamakli olup olmadigini kontrol etmek icin  (100 den 999 a kadar) ...
        if (sayi<100 || sayi>999){  // sayinin 3 basamakli olmama durumu !
            System.out.println("Uc basamakli sayi girmelisiniz...");
        }else {// sayinin 3 basamakli olma durumunda yapilcak islemler
            int birler = sayi % 10; // birler basamagi
            int onlar = (sayi / 10) % 10; // onlar basamagi
            int yuzler = sayi / 100;

            switch (yuzler) {
                case 1:
                    System.out.print("Yuz");
                    break;
                case 2:
                    System.out.print("Ikiyuz");
                    break;
                case 3:
                    System.out.print("Ucyuz");
                    break;
                case 4:
                    System.out.print("Dortyuz");
                    break;
                case 5:
                    System.out.print("Besyuz");
                    break;
                case 6:
                    System.out.print("Altiyuz");
                    break;
                case 7:
                    System.out.print("Yediyuz");
                    break;
                case 8:
                    System.out.print("Sekizyuz");
                    break;
                case 9:
                    System.out.print("Dokuzyuz");
                    break;
            }
            switch (onlar) {
                case 1:
                    System.out.print("On");
                    break;
                case 2:
                    System.out.print("Yirmi");
                    break;
                case 3:
                    System.out.print("Otuz");
                    break;
                case 4:
                    System.out.print("Kirk");
                    break;
                case 5:
                    System.out.print("Elli");
                    break;
                case 6:
                    System.out.print("Altmis");
                    break;
                case 7:
                    System.out.print("Yetmis");
                    break;
                case 8:
                    System.out.print("Seksen");
                    break;
                case 9:
                    System.out.print("Doksan");
                    break;
            }
            switch (birler) {
                case 1:
                    System.out.print("Bir");
                    break;
                case 2:
                    System.out.print("Iki");
                    break;
                case 3:
                    System.out.print("Uc");
                    break;
                case 4:
                    System.out.print("Dort");
                    break;
                case 5:
                    System.out.print("Bes");
                    break;
                case 6:
                    System.out.print("Alti");
                    break;
                case 7:
                    System.out.print("Yedi");
                    break;
                case 8:
                    System.out.print("Sekiz");
                    break;
                case 9:
                    System.out.print("Dokuz");
                    break;
            }

        }









    }
}
