package day_03;

import java.util.Scanner;

public class C06_Tekrar {
    public static void main(String[] args) {
        //kullanıcıdan pozitif bir sayı alınız
        //verılen sayının 3 veya daha cok bsmklı olup olmadıgını  ternary ile kontrol eden
        // ve yazdıran bir method olusturun
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int number = scan.nextInt();

        ucBasamak(number);
        System.out.println(ucBasamak(number));
        kacBasamakli(number);



    }

    public static String ucBasamak(int a) {

            String sonuc = a>99?"uc veya daha cok basamakli sayi":"uc ten daha az basamakli sayi";
            return sonuc;
    }
    public static void kacBasamakli(int k){
        System.out.println(k>999?" 4 veya daha cok basamakli sayi":"4 ten daha az basamakli sayi");
    }







}
