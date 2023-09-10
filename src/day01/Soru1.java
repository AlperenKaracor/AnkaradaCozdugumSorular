package day01;

import java.util.ArrayList;
import java.util.Scanner;

/*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
        ortalama nasıl hesaplanır -> tum sayıları topla, sayı adedine böl
     */


public class Soru1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ortalamasini bullmak istediginiz sayilari giriniz  ");


        int toplam = 0;
        int counter = 0;
        int a = 1;

        while (a > 0) {

            System.out.print("Enter a num : ");
            int num = scan.nextInt();
            System.out.println("Press 'E' to result!!!\nPress 'C' to continue");
            String exit = scan.next();

            toplam += num;

            counter++;
            a++;

            if (exit.equals("E")) {

                break;
            }
        }

        System.out.println("Girdiginiz sayilarin ortalamasi = " + toplam/counter);


    }


}















