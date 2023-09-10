package day01;

import java.util.Scanner;

//kullanıcıdan iki sayı isteyin
//sayıların ikisi de pozitifse sayıların toplamını yazdırın
//ikisi de negatifse sayıların çarpımını yazdırın
//ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
//sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın
public class Soru3 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen 2 adet sayi giriniz : ");

        int num = scan.nextInt();

        System.out.println("Sayi 1 = " + num);

        int num2 = scan.nextInt();

        System.out.println("Sayi 2 = " + num2);

        if(num > 0 && num2>0){

            System.out.println(num2 + num);

        }else if(num < 0 && num2 < 0){

            System.out.println(num*num2);

        }else if(num > 0 || num2 < 0){

            System.out.println("Farkli isaretli sayilarla islem yapilamz");
        }else if(num == 0 || num2 == 0){

            System.out.println("0 carpmada yutan elemandir");


        }









    }




}
