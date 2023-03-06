//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
// girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

import java.util.Scanner;

public class SayiTopla {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sayi, total = 0;

        do {
            System.out.print("Sayı giriniz: ");
            sayi = in.nextInt();
            if (sayi % 4 == 0) {
                total += sayi;
            }
        } while (sayi % 2 == 0);

        System.out.print("Toplam :" + total);
    }
}
