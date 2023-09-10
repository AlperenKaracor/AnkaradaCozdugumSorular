package practıce05.inheritance02;

public class Corsa extends Opel {


    String hiz = "Corsa arabalar 200 km hiz yapar";

    String yakit = "Corsa arabalar benzinli veya elektriklidir";

    String model = "Corsa";

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar cevreci motor kullanir ");
    }


    @Override
    protected void yakitTuketimi() {
        System.out.println("Corsa arabalar 5.6 lt yakit tuketir");
    }

    protected void vitesSayisi(){
        System.out.println("Corsalar 5 viteslidir");

    }

    public static void main(String[] args) {
        //Corsa objesi olusturalim
        //Aramaya obje olusturdugu classdan basliyor
        Corsa arb1 = new Corsa();

        System.out.println("arb1.hareket = " + arb1.hareket);
        System.out.println("arb1.hiz = " + arb1.hiz);
        System.out.println("arb1.yakit = " + arb1.yakit);
        System.out.println("arb1.marka = " + arb1.marka);
        System.out.println("arb1.sirketMerkezi = " + arb1.sirketMerkezi);
        System.out.println("arb1.model = " + arb1.model);
        arb1.motor();//Corsa


        Opel arb2 = new Corsa();

        System.out.println("arb2.hareket = " + arb2.hareket);

        System.out.println("arb2.hiz = " + arb2.hiz);//opel
        System.out.println("arb2.yakit = " + arb2.yakit);//araba
        System.out.println("arb2.marka = " + arb2.marka);//opel
        System.out.println("arb2.sirketMerkezi = " + arb2.sirketMerkezi);//opel


        //Hangi classin objesiyse oradan aramaya baslar
        //Methodlarda ilk buldugunu hemen yazdirmaz
        //Cons datanin child larindan secilir
        /*
        inheritancede variablelar:
        aramaya data turunden baslanir , bulamazsa parenta bakar
        ilk buldugunuz getirir
        inheritancede methodlar:
        aramaya data turunden baslar, bulamazsa parenta bakar
        ilk buldugu yerden almaz , constructorun oldugu yere kadar override
        edilmis mi diye bakar ve son buldugunu getirir

        =============================================================

        arama islemi asagidan yukari dogrudur
        override kontrol islemi yukaridan asagi dogrudur


         */
        arb2.motor();

        arb2.garanti();//opel
        arb2.yakitTuketimi();//corsa

        //arb2.vitesSayisi() hata veiyor cunku aramaya opelden basladi

        Araba arb3 = new Corsa();

        System.out.println("arb3.hareket = " + arb3.hareket);//araba
        System.out.println("arb3.hiz = " + arb3.hiz);//araba
        System.out.println("arb3.yakit = " + arb3.yakit);//araba
        arb3.motor();//corsa
        arb3.yakitTuketimi();//corsa

        Araba arb4 = new Opel();

        System.out.println("arb4.hiz = " + arb4.hiz);
        System.out.println("arb4.yakit = " + arb4.yakit);

        arb4.motor();//opel
        arb4.yakitTuketimi();


    }

}
