package day02;

import java.util.Arrays;

public class Arraylenght {

    public static void main(String[] args) {

        int arr [][] = new int [3][2];

        System.out.println("arr.length = " + arr.length);

        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));

        arr[0][0] = 4;

        System.out.println("arr[0] = " + arr[0].length);
        System.out.println(Arrays.toString(arr[0]));

        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));


    }

}
