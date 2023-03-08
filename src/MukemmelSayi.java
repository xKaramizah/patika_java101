// Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.
// ” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
//
//Mükemmel Sayı Nedir ?
//Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();
        int test = 0;
        for (int i = 1; i < n; i++){
            if(n % i == 0){
                test += i;
            }
        }
        if (n == test) System.out.println(test + " mükemmel sayıdır.");
        else System.out.println(n + " mükemmel sayı değildir.");
    }
}












