import java.util.Scanner;

public class RecursiveAsal {
    static boolean asal(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            return true;
        } else {

            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = scan.nextInt();
        if (asal(n)) System.out.println(n + " sayısı ASAL'dır.");
        else System.out.println(n + " sayısı ASAL değildir.");
    }
}
