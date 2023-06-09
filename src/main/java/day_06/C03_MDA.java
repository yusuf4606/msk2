package day_06;

import java.util.Arrays;
import java.util.Scanner;

public class C03_MDA {

     /*
        arr[3][2] luk bir mdarray olusturun
        Arrayın elemanlarını kullanıcıdan alın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int arr[][]={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */
     public static void main(String[] args) {
         int arr[][] = new int [3][2];

         Scanner scan = new Scanner(System.in);

         for (int i = 0; i < arr.length ; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 System.out.println("Lutfen eklemek istediginiz elemani giriniz");
                 arr[i][j]= scan.nextInt();
             }
         }

         int brr[] = new int [arr.length];
         System.out.println(Arrays.deepToString(arr));

         for (int i = 0; i < arr.length; i++) {
             int toplam =0;
             for (int j = 0; j <arr[i].length ; j++) {
                 toplam+=arr[i][j];



             }
             brr[i]=toplam;
         }
         System.out.println(Arrays.toString(brr));


     }
}
