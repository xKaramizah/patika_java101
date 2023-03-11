//Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
//
//Dizi : {15,12,788,1,-1,-778,2,0}
//Girilen Sayı : 5
//Girilen sayıdan küçük en yakın sayı : 2
//Girilen sayıdan büyük en yakın sayı : 12

import java.util.Arrays;
import java.util.Scanner;

public class EnYakinKucukBuyuk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list);

        int max = list[0];
        int min = list[0];
        int n;
        for (int i : list) {
            if (i < min) {
                min = i;
            } else if (i > max) {
                max = i;
            }
        }

        do {
            System.out.print(min + " ve " + max + " Değerleri arasında bir sayı giriniz: ");
            n = in.nextInt();
        } while (n < min || n > max);

        max = list[0];
        min = list[0];

        for (int j : list) {
            if (j < n) {
                min = j;
            }
            if (j > n) {
                max = j;
                break;
            }
        }
        System.out.println(n + " sayısına; " +
                "\nKüçük ve en yakın sayı: " + min +
                "\nBüyük ve en yakın sayı: " + max);
    }
}
