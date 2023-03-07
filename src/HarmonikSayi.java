import java.util.Scanner;
public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n sayısını giriniz: ");
        int n = in.nextInt();
        double result = 0;

        for (double i = 1; i <= n; i++){
            result += 1/i;
        }
        System.out.print(n + " sayısı harmonik serisi: " + result);
    }
}
