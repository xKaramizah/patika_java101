// N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
// N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
//
//Java ile kombinasyon hesaplayan program yazınız.
//
//Kombinasyon formülü
//C(n,r) = n! / (r! * (n-r)!)

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını giriniz (n): ");
        int no1 = input.nextInt();
        System.out.print("Grup sayısını giriniz (r): ");
        int no2 = input.nextInt();
        int n = 1, r = 1, total, diff = 1;

        if (no1 > no2) {
            for (int i = 1; i <= no1; i++) {
                n = n * i;
            }
            for (int j = 1; j <= no2; j++) {
                r = r * j;
            }
            for (int k = 1; k <= (no1 - no2); k++) {
                diff = diff * k;
            }
            total = n / (r * diff);

            System.out.println("Kombinasyon (C(n,r)): " + total);
        } else {
            System.out.println("Küme sayısı grup sayısından büyük olmalıdır. Tekrar deneyiniz.");
        }
    }
}
