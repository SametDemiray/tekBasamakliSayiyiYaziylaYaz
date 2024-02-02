package org.example;

// Klavyeden girilen -9 ile 9 arasındaki bir basamaklı tamsayıyı kelime olarak ekrana yazdıran program.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x;
        String[] R ={"Sıfır","Bir","İki","Üç","Dört","Beş","Altı","Yedi","Sekiz","Dokuz"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nLütfen Tek Basamaklı Bir Sayı Giriniz : ");
        x = scanner.nextInt();
        System.out.print("\nGirdiğiniz Sayı = ");

        if (x<0)
            System.out.print("Eksi ");
        System.out.println(R[Math.abs(x)]);
    }
}