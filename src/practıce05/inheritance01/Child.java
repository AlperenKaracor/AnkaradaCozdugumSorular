package practıce05.inheritance01;

public class Child extends Parent{

    int yas = 10;

    public static void main(String[] args) {

        Parent.method1();
        method1();//static method child classtaki static main
        //methoddan direk cagirabilir
        method2();
        System.out.println("isim = " + isim);

        System.out.println("soyisim = " + soyisim);
        isim = "Veli";

        System.out.println("isim = " + isim);
        //instace var/method static baska bir methodun icinden obje
        //olusturularak cagirilir

        Parent obj1 = new Parent();
        obj1.method3();
        obj1.method4();
        System.out.println("obj1.yas = " + obj1.yas);

        Child obj2 = new Child();
        obj2.method3();
        obj2.method4();
        System.out.println("obj2.yas = " + obj2.yas);


    }



}
