package day_01;

public class C03_Ortalama {
    public static void main(String[] args) {

        /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
     */

        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

        double toplam = num1+num2+num3+num4+num5;
        // ifadenin onunde string varsa + isareti yanyana yazdirir
        // ifadenin onunde string yoksa ve numerik datalar varsa + isareti matematiksel toplama islemi yapar

        System.out.println("Toplam = " + toplam);  // 609.7

        double ortalama = toplam/5;

        System.out.println("Ortalama = " + ortalama);


    }


}
