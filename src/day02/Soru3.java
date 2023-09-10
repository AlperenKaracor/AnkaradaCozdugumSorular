package day02;

import java.util.Arrays;
import java.util.Scanner;

public class Soru3 {

    public static void main(String[] args) {

        /*
        arr[3][2] luk  int bir mdarray olusturun
        Arrayın elemanlarını kullanıcıdan alın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int [][] arr={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */


        //Multidimensional bir array olustur

        int mdArr [][] = new int[1][2];

        mdArr [0][0] = 1;
        mdArr [0][1] = 1;

        System.out.println("Arrays.deepToString(mdArr) = " + Arrays.deepToString(mdArr));

        int arr [][] = new int [3][2];

        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]]

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print("Lutfen eklemek istediginiz degeri giriniz : ");
                arr[i][j] = scan.nextInt();

            }

        }

        System.out.println(Arrays.deepToString(arr));


        int brr [] = new int [arr.length];

        for (int i = 0; i < arr.length; i++) {

           int toplam = 0 ;

            for (int j = 0; j < arr[i].length; j++) {

                toplam += arr[i][j];

            }

            brr[i] = toplam;
        }

        System.out.println(Arrays.toString(brr));


    }
}
