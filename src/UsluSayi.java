//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sayı: ");
        int sayi = in.nextInt();
        System.out.print("Üs olacak sayı: ");
        int us = in.nextInt();
        int total = 1;

        for (int i = 1; i <= us; i++) {
            total *= sayi;
        }
        System.out.print("Sonuç: " + total);
    }
}
