package day_01;

public class C06_MethodCreation {

    public static void main(String[] args) {
        //kare prizmanın hacmini bulan ve donduren bir method yazınız
        // not : kare prizma hacmi -> taban alani * yukseklik --> a*a* h

        int kenar = 3 ;
        int yukseklik = 4;

        // tabankenari 3 yuksekligi 4 olan prizmanin hacmi --> 3*3*4 = 36

        System.out.println("Prizmanin Hacmi= " + karePrizmaHacimBul(3, 4));


    }

    public static int karePrizmaHacimBul ( int tabanKenari,int yukseklik){

        int hacim = tabanKenari*tabanKenari*yukseklik;

        return hacim;




    }




}
