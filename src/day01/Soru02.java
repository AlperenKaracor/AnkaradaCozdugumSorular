package day01;

import java.util.Scanner;

public class Soru02 {

     /*
    kullanıcıdan aldıgınız sayının karesini bulunuz bulunuz
    not:bir sayının karesi,sayının kendisi ile carpımına esittir
     */


    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen karsini almak istediginiz sayiyi giriniz : ");

        int num = scan.nextInt();

        int result = karesiniAl(num);

        System.out.println("result = " + result);


    }

    public static int karesiniAl(int a){

        return a*a;

    }


}
