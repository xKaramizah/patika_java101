import java.util.Scanner;
public class ArtikYilHesap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Hesaplanacak yıl bilgisi giriniz: ");
        int year = in.nextInt();

        if (year % 4 == 0 || year % 400 == 0) {
            System.out.print(year + " yılı artık bir yıldır!");
        }else {
            System.out.print(year + " yılı artık bir yıl değildir.");
        }
    }
}
