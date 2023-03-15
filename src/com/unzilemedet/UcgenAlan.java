package com.unzilemedet;

import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenarlarını sırası ile giriniz:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double u = (a+b+c)/2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin Alanı : " + alan);
    }
}
