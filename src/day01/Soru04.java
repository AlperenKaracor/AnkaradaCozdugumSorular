package day01;

import java.util.Scanner;

/*
     Kullanıcıdan sisteme bir numara girmesini isteyin.

     Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

     Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Rakam" yazdırın,
     10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.
 */
public class Soru04 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen sisteme bir sayi giriniz : ");

        int num = scan.nextInt();

        if(num < 0){

            System.out.println("Negatif Sayi");

        }else if(num < 10){

            System.out.println("Rakam");

        }else if(num >= 10){

            System.out.println("Pozitif sayi");
        }






    }

}
