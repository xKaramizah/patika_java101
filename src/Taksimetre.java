import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float bFiyat = 2.20f;
        int minTutar = 20, acilis = 10, km;
        System.out.print("Mesafe giriniz (km): ");
        km = input.nextInt();

        float hesap = 10 + km * bFiyat;
        hesap = hesap < 20 ? 20 : hesap;

        System.out.println("Taksimetre Ücreti: " + hesap);
    }
}
