package day_03;

import java.util.Scanner;

public class C01_Tekrar2 {
    public static void main(String[] args) {




        //Text
        String txt = "  ali can" ;

        //use trim method to remove spaces before the firstWord and after lastWord
        String firstWord = txt.trim();
        String lastWord = txt.trim();

        //use indexOf to find the first space position in the line
        int index = txt.indexOf(' ');

        //use substring to get firstWord and the rest of the line
        firstWord = txt.substring(0, index);

        //use lastIndexOf to find the last space position in the line
        int lastIndex = txt.lastIndexOf(' ');

        //use substring to find the last word
        lastWord = txt.substring(lastIndex);

        //form a new string using concatenation
        System.out.println(lastWord + " " + firstWord);
    }
}
