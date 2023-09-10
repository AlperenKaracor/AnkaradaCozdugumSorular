package day01;

import java.util.Scanner;

public class Soru07 {

    public static void main(String[] args) {


            /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */


        Scanner scan = new Scanner(System.in);


        System.out.print("Lutfen adinizi ve soyadinizi aralarinda bosluk koyarak giriniz : ");

        String adSoyad = scan.nextLine();

        int spcIdx = adSoyad.indexOf(" ");


        String ad = adSoyad.substring(0,spcIdx);//ali

        String soyad = adSoyad.substring(spcIdx+1);//can


        String ad2 = ad.toUpperCase().charAt(0) + ad.toLowerCase().substring(1);

        String soyad2 = soyad.toUpperCase().charAt(0) + soyad.toLowerCase().substring(1);

        System.out.println(ad2 + " " +  soyad2);


















    }



}
