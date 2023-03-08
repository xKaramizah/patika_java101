//Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

import java.util.Scanner;

public class MinMaxDeger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int n = in.nextInt(), a, kucuk = 0, buyuk = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". Sayıyı giriniz: ");
            a = in.nextInt();
            if (a < kucuk || (kucuk == 0 && a > 0)) {
                kucuk = a;
            }
            if (a > buyuk) {
                buyuk = a;
            }
        }
        System.out.println("En büyük sayı:" + buyuk);
        System.out.println("En küçük sayı:" + kucuk);

    }
}
