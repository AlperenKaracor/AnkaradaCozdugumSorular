package day02;

import java.util.Scanner;

public class Soru5 {

    /*
        Basit 4 islem yapan bir hesap makinesi kodlayınız
        Kullanıcıcn yapacagi islemi islem sembolu ile( +  -  /  *  ) secmesini isteyiniz
        Kullanıcının 2 sayi girmesini isteyiniz
        Girilen islem ve sayilara gore dogru sonucu ekrana yazdırınız
        */


    public static void main(String[] args) {

        System.out.println("Basit hesap makinesi \n" +
                "========================================= ");

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen yapmak istediginiz islemi seciniz : \n" +
                           "'-' , '+' , '/' , '*' ");
        System.out.print("Islem = ");

        char islem = scan.next().charAt(0);

        if(islem == '-' || islem == '+' || islem == '/' || islem == '*'){

            System.out.print("Lutfen islem yapmak icin sirasiyla 2 adet sayi giriniz : \n 1.Sayiyi giriniz  : ");
            double num1 = scan.nextDouble();
            System.out.println("Sayi 1 = " + num1);
            System.out.print("2. Sayiyi giriniz  yi  : ");
            double num2 = scan.nextDouble();
            System.out.println("Sayi 2 = " + num2);

            hesapMakinesi(islem,num1,num2);



        }else System.out.println("Hatali islem!!!");





    }

    public static void hesapMakinesi(char islem , double num1 , double num2){

        switch (islem){

            case '+' :
                System.out.println(num1  + "+" +  num2 + " = " + (num1 + num2));
                break;
            case '-' :
                System.out.println(num1  + "-" +  num2 + " = " + (num1 - num2));
                break;
            case '*' :
                System.out.println(num1  + "*" +  num2 + " = " + (num1 * num2));
                break;
            case '/' :
                System.out.println(num1  + "/" +  num2 + " = " + (num1 / num2));
                break;


        }




    }



}
