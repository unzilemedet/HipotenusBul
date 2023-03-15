package com.unzilemedet;

import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen dik kenarların uzunluklarını sırası ile giriniz:");
        double kenar1 = input.nextDouble();
        double kenar2 = input.nextDouble();
        double hipotenus = Math.sqrt(Math.pow(kenar1,2)+Math.pow(kenar2,2));
        System.out.println("Hipotenüs :" + hipotenus);


    }
}