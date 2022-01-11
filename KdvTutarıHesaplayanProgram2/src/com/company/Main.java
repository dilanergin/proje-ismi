package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak
        KDV tutarı hesaplayan programı yazınız.
         */
        double para, kdv1 = 0.18, kdv2 = 0.08, kdvliFiyat, kdvliFiyat2, kdvTutar, kdvTutar2;

        Scanner input = new Scanner(System.in);
        System.out.print("Para tutarını giriniz: ");
        para = input.nextDouble();
        kdvTutar = para * kdv1;
        kdvliFiyat = para + kdvTutar;
        kdvTutar2 = para * kdv2;
        kdvliFiyat2 = para + kdvTutar2;
        if (para > 0 && para <= 1000) {
            System.out.println("Uygulanan kdv oranı: " + kdv1);
            System.out.println("Kdvli fiyat: " + kdvliFiyat);
            System.out.println("Kdv tutarı: " + kdvTutar);

        } else {
            System.out.println("Uygulanan kdv oranı: " + kdv2);
            System.out.println("Kdvli fiyat: " + kdvliFiyat2);
            System.out.println("Kdv tutarı: " + kdvTutar2);

        }


    }
}
