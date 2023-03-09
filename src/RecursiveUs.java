import java.util.Scanner;

public class RecursiveUs {
    static double f(double a, double b) {
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        double a = in.nextDouble();
        System.out.print("Üs değeri giriniz: ");
        double b = in.nextDouble();
        System.out.print("Sonuç: " + f(a, b));
    }
}
