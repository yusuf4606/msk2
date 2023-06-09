package day_01;

public class C05_MethodCreation {

    public static void main(String[] args) {

      kareTopla(3,5);

      kareTopla(10,100);

      kareTopla(4,9);


    }

    //iki sayının kareleri toplamını bulan ve yazdıran bır method olusturunuz

    protected static void kareTopla(int a, int b){

     int sonuc = a*a+b*b;
        System.out.println(sonuc);

    }
}
