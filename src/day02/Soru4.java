package day02;

import java.util.ArrayList;
import java.util.List;
public class Soru4 {

    public static void main(String[] args) {

        // Verilen bir array'den tekrar eden elemanları silip
        // tekrarsız elemanlardan olusan bir array haline donusturun
        //  int arr[]={1,2,2,3,4,4,5};



        int arr[]= {1,2,2,3,4,4,5};

        List<Integer> tekrarsiz = new ArrayList<>();

        for ( int w : arr ) {

            if(!tekrarsiz.contains(w)){

                tekrarsiz.add(w);

            }

        }

        System.out.println(tekrarsiz);


    }

}
