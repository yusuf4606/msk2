package day_06;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
        // input : 1,2,-3,4,-5,-6
        // output :-1,-2,3,-4,5,6
        // int arr[] = new int [6];

        int arr[] = {1,2,-3,4,-5,-6};

        for (int i= 0; i<arr.length; i++){
            arr[i]=arr[i]*-1;
        }

        System.out.println(Arrays.toString(arr));

    }
}
