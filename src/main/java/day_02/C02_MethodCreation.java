package day_02;

import java.util.Scanner;

public class C02_MethodCreation {
     // kullanicidan fahrenheit cinsi bir deger girmesini isteyin
    // Fahrenheit değeri, Celsius değere çeviren method yazınız.
    // formül: c = (f-32)/1.8

    //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen fahrenheit bir deger giriniz");
        double fahrenheit = scan.nextDouble();
        donustur(fahrenheit);

    }

    public static double donustur ( double a){
       double cel =  (a-32)/1.8;
       return cel;
    }


}
