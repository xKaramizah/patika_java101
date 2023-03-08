//Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz: ");
        int n1 = in.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int n2 = in.nextInt();
        int ebob = 1, ekok = 1, buyuk = 1, kucuk = 1;

        if (n1 == n2) {
            System.out.print("Farklı sayılar giriniz");
        } else {
            if (n1 > n2) {
                buyuk = n1;
                kucuk = n2;
            } else {
                buyuk = n2;
                kucuk = n1;
            }
/*
            // EBOB 1. YÖNTEM

            int i = 1;
            do {
                if (buyuk % i == 0 && kucuk % i == 0) {
                    ebob = i;
                }
                i++;
            } while (i != kucuk);
            System.out.println("Girdiğiniz sayılar EBOB'u: " + ebob);

 */
            // EBOB 2. YÖNTEM
            int i = kucuk;
            do {
                if (buyuk % i == 0 && kucuk % i == 0) {
                    ebob = i;
                    break;
                }
                i--;
            } while (i != 1);
            System.out.println("Girdiğiniz sayılar EBOB'u: " + ebob);
            // EKOK HESABI
            int j = 1;
            do {
                j++;
                if (j % n1 == 0 && j % n2 == 0) {
                    ekok = j;
                    break;
                }
            } while (j != (n1 * n2));
            System.out.println("Girdiğiniz sayılar EKOK'u: " + ekok);

        }
    }
}
