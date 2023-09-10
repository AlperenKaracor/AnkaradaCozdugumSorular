package day02;

import java.util.Scanner;

public class Soru01 {

    /*
          Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
          Kullaniciya bitirmek istediginde 0'a basmasini soyleyin

          kullanici bitirmek istediginde
          toplam kac adet pozitif tam sayi girdigini
          ve bunlarin toplaminin kac oldugunu yazdirin

          Kullanici negatif sayi girerse
          "negatif sayi kullanamazsiniz " yazdirin
          bu negatif sayiyi sayi adedine ve toplama eklemeyin
         */
    //baslangic degeri
//                do{
//                    calisacak kodlar
//                            artirma/azaltma
//
//                }while(loop calisma kurali);

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen sisteme pozitif sayilar giriniz \n Bitirmek icin '0' a basiniz!!!");


        int i = 0;
        int toplam = 0;
        int counter = 1;
        System.out.print("Lutfen baslamak icin ilk sayiyi giriniz = ");

        do {

            int num = scan.nextInt();

            System.out.println("Sayi " + counter + " = " + num);
            System.out.print("Devam etmek icin deger giriniz = ");



            if (num == 0) {

                System.out.println("Girdiginiz sayi adeti = " + (counter -1 ) + "\n" +
                                   "Girdiginiz sayilarin toplami = " + toplam);
                break;

            } else if (num < 0) {

                System.out.print("Negatif sayi kullanamazsiniz!!!");
                continue;
            }

            toplam += num;
            counter++;

            i++;
        } while (true);


    }


}
