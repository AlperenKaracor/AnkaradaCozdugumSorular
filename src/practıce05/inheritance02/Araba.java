package practıce05.inheritance02;

public class Araba {

    // Araba, Opel, Corsa adında farklı class'lar olusturunuz.
    // Opel class'ı Araba class'ına baglı olacak
    // Corsa class'ı Opel class'ına baglı olacak
    // Araba class'ına genel bilgileri, variable ve method olarak yazınız.
    // Opel class'ına gerekli bilgileri, variable ve method olarak yazınız.
    // Corsa class'ına en spesifik bilgileri, variable ve method olarak yazınız.
    // Corsa class'ından obje olusturarak variableları ve methodları yazdırınız.

    //Tum arabalar icin ortak olan ozellikleri variable olarak tanimlayalim

    String hareket = "Arabalar teker ile hareket eder";


    String marka = "Arabalar uretildikleri markaya sahiptir";

    String hiz = "Arabalar motor gucune gore hareket eder";

    String yakit = "Arabalar farkli turde yakitlar kullanirlar";

    //Tum arabalar icin ortak ozellikleri method olarak yazalim


    protected void motor(){

        System.out.println("Arabalar farkli markalarda motor kullanirlar");
    }

    protected void yakitTuketimi(){

        System.out.println("Arabalar motor gucune ve yakit turune gore yakit kullanirlar");

    }






}
