//https://app.patika.dev
//https://app.patika.dev/thendbranch

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Manav Kasa Programı
            Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
            toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

            Armut : 2,14 TL
            Elma : 3,67 TL
            Domates : 1,11 TL
            Muz: 0,95 TL
            Patlıcan : 5,00 TL

        Örnek Çıktı;

            Armut Kaç Kilo ? :0
            Elma Kaç Kilo ? :1
            Domates Kaç Kilo ? :1
            Muz Kaç Kilo ? :2
            Patlıcan Kaç Kilo ? :3
            Toplam Tutar : 21.68 TL
         */

        Scanner input = new Scanner(System.in);
        int armut, elma, domates, muz, patlican;
        System.out.println("!! Manav Kasa Programı !!");

        System.out.print("Armut Kaç Kilo ? :");
        armut=input.nextInt();

        System.out.print("Elma Kaç Kilo ? :");
        elma=input.nextInt();

        System.out.print("Domates Kaç Kilo ?");
        domates=input.nextInt();

        System.out.print("Muz Kaç Kilo ? :");
        muz=input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican=input.nextInt();

        // Fiyatlar
        double fiyatArmut = 2.14;
        double fiyatElma = 3.67;
        double fiyatDomates = 1.11;
        double fiyatMuz = 0.95;
        double fiyatPatlican = 5.00;

        double tutar = (armut*fiyatArmut)+(elma*fiyatElma)+(domates*fiyatDomates)+(muz*fiyatMuz)+(patlican*fiyatPatlican);

        System.out.println("Toplam Tutar : " + tutar);
    }
}