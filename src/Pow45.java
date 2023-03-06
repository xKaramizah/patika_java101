// Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

import java.util.Scanner;

public class Pow45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz :");
        int sayi = in.nextInt();

        for (int i = 1, j = 1; i <= sayi && j <= sayi; i *= 4, j *= 5) {
            System.out.println(i + " , " + j);
        }
    }
}
