package day01;

import java.util.Scanner;

public class Soru09 {

    public static void main(String[] args) {

        /*
        Kullanicidan sisteme 5 adet sayi girmesini isteyiniz
        Bu sayilardan birler basamagi 7 veya 9 olanlar haric digerlerinin toplamini bulunuz
           */


        Scanner scan = new Scanner(System.in);


        System.out.println("Lutfen sisteme 5 adet sayi giriniz : ");
         int toplam = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer : ");
            int num = scan.nextInt();

            if(num%10 ==9 || num%10 == 7){
                continue;
            }else{
                toplam += num;
            }
        }

        System.out.println(toplam);


    }


}
