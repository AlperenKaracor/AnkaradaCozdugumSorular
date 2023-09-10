package day02;

import java.util.Scanner;

//Bu class da method olacak ama argumani child class da girecegim
public class Soru8Parent {

  public static int toplamaYap(){

      Scanner scan = new Scanner(System.in);
      int toplam = 0;
       while(true){

           System.out.print("Lutfen toplanacak degeri giriniz : ");
           int num = scan.nextInt();

           if(num == 0){
               break;
           }

           toplam += num;
       }
       return toplam;


  }


}
