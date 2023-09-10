package day01;

import java.util.Scanner;

public class Soru06 {

     /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.print("Lutfen sisteme 2 adet tam sayi giriniz : ");

        int num = scan.nextInt();
        System.out.println("Birinci sayi :  " + num);

        int num1 = scan.nextInt();
        System.out.println("Ikinci sayi : " + num1);

      Object result =  num == num1 ? "Sayilar birbirine esit" : num>num1 ? num : num1;

        System.out.println(result);


    }







}
