package day01;


import java.util.Scanner;

public class Soru05 {

    /*
            Kullanıcıdan bir sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */
    //condition ?  code1(true) : code2(false) ;


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen sisteme bir sayi giriniz : ");

        int num = scan.nextInt();

       Object result =  num%2 == 0 ?   "Cift Sayi"   :  num+3  ;

        System.out.println(result);


    }






}
