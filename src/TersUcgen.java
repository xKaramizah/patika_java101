import java.util.Scanner;

//Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
public class TersUcgen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz: ");
        int n = in.nextInt();
        System.out.print("Şekilde kullanılacak sembolü giriniz (Tek haneli): ");
        String sekil = in.next();

        for (int i = n; i >= 1; i--) {

            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(sekil);
            }
            System.out.println(" ");
        }
    }
}

