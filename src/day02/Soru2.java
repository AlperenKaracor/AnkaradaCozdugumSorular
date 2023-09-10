package day02;

import java.util.Arrays;
import java.util.Scanner;

public class Soru2 {

    public static void main(String[] args) {

        /*
        5 elemanlı bir array olusturunuz(int)
        Arrayin elemanlarını sıra ile kullanıcıdan alınız, arrayi yazdırınız
        Arrayın elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız
        Ortalamadan daha buyuk olan array elemanlarını yazdırınız
        Arrayin elemanlarının işaretlerini degistiren bir kod yazzınız
         */
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println("Lutfen 5 adet sayi giriniz : ");
        for (int i = 0; i < arr.length; i++) {

            int num = scan.nextInt();

            arr[i] = num;

        }

        System.out.println("arr = " + Arrays.toString(arr));
        int toplam = 0;
        for (int w : arr) {

            toplam += w;

        }
        double ortalama = toplam / 5;

        System.out.println("Arraydeki elemanlarin ortalamalari = " + ortalama);


        for (int each : arr) {

            if (each > ortalama) {

                System.out.println("Ortalamadan buyuk eleman = " + each);
            }

        }


        for (int i = 0; i < arr.length; i++) {


            arr[i] = arr[i] * -1;
        }


        System.out.println("Isaretleri degistirilmis arraylist = " + Arrays.toString(arr));
    }


}








