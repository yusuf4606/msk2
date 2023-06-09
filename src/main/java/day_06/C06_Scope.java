package day_06;

public class C06_Scope {

    /*
    scope kapsam anlamina gelir, bir variable in nerede gecerli oldugunu bildirir

    4 cesit scope vardir

    1- static variable lar = class variable lar
    2- instance variable lar class level da olusturulur
    3- local variable lar>> methodlarin icinde olusturulan variable lar ve methodun icinde gecerli olur
    4- loop variable >> loop un icinde olusturdugumuz variable lar loop un icinde gecerli olur
     */


    static int staticSayi;
    int instanceSayi =0;
    public static void main(String[] args) {

        int localSayi =0;

    }
}
