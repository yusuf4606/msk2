package day_02;

import java.util.Scanner;

public class C04_MethodCreation {


    //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen bir character giriniz");
            char ch = input.next().charAt(0);
            ucgenYap(ch);

        }

        public static void ucgenYap(char a){
            /*
            System.out.println("  "+ a);
            System.out.println(" "+ a+ " "+a);
            System.out.println( a+" "+a+" "+a);

             */
            // veya tek bir sout ile de yapilabilir
            System.out.println("  "+a+"  \n "+a+" "+a+" \n"+a+" "+a+" "+a );
        }
}
