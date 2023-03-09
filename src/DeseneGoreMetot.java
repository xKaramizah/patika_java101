//Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
//
//Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
// Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

import java.util.Scanner;

public class DeseneGoreMetot {
    static void f(int a){
        System.out.print(a + " ");
        if (a<=0){
            return;
        }
        f(a - 5);
        System.out.print(a + " ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();
        System.out.print("Sonuç: ");
        f(n);
    }
}
