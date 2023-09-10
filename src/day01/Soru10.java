package day01;

import java.util.Scanner;

public class Soru10 {

    /*
           Kullanicidan sisteme satir sayisini girmesini isteyiniz
           ve ardindan yildiz isaretini kullanrak bir dik ucgen cizin

           satir sayisi ===> 4           *
                                         * *
                                         * * *
                                         * * * *
            */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen satir sayisi giriniz : ");

        int row = scan.nextInt();


        for (int i = 0; i <= row; i++) {
            System.out.println();

            for (int j = 0; j < i; j++) {

                System.out.print("* ");

            }


        }






        }




    }



