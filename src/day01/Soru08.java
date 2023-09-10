package day01;

import java.util.Scanner;

public class Soru08 {

    public static void main(String[] args) {


        /*
        Kullanicidan bir kelime sisteme girmesini isteyiniz
        kelimede ilk c harfi rastlanana kadar a harflerinin sayisiniz yazdiriniz

         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen sisteme bir kelime giriniz : ");

        String str = scan .next();
        String newStr = "";
      int  charACounter = 0;
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == 'a'){

                charACounter++;

            }else if(str.charAt(i) == 'c'){
                break;
            }



        }

        System.out.println(charACounter);
























    }

}
