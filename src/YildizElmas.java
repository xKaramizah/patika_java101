// Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
//
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *


import java.util.Scanner;

public class YildizElmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 0;
        do {
            System.out.print("Bir sayı giriniz: ");
            n = input.nextInt();
            if (n<2){
                System.out.println("Girdiğiniz sayı 1'den büyük olmalıdır. Tekrar deneyiniz!");
            }
        } while ( n<2);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k =(2 * (n - i )-1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


