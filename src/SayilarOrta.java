//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

import java.util.Scanner;

public class SayilarOrta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = in.nextInt();
        int toplam = 0, j = 0, ort;

        for (int i = 0; i <= sayi; i++) {
            if (i != 0 && i % 3 == 0 && i % 4 == 0) {
                j++;
                toplam += i;
            }
        }

        ort = toplam / j;
        System.out.println("Ortalama: " + ort);
    }
}


