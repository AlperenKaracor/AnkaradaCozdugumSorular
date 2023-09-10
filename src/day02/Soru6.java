package day02;

import java.util.Scanner;

public class Soru6 {

    // Fahrenheit değeri, Celsius değere çeviren method yazınız.
    // formül: c = (f-32)/1.8

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen fahrenheit cinsinde bir deger giriniz : ");

        double fahrenheit = scan.nextDouble();

       double result = fahrenheitToCelcius(fahrenheit);
        System.out.println("Celcius = " + result);

    }

    public static double fahrenheitToCelcius(double fahrenheit){

        double celcius = (fahrenheit - 32) /1.8;

        return celcius;
    }


}
