package day01;

import java.util.Scanner;

public class Soru11 {


    public static void main(String[] args) {


        // Kullanıcından sisteme bir sayi girmesini isteyiniz,
        // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız
        // Not: While loop kullanınız
        // Örn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49


        Scanner scan = new Scanner(System.in);

        System.out.print("Sisteme bir sayi giriniz : ");

        int num = scan.nextInt();

        while(num%10!=0){

            System.out.println(num);

            num++;
        }





    }

}
