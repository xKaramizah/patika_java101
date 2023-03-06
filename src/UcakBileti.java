import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Uçuş mesafesi KM cinsinde giriniz: ");
        int km = in.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        int age = in.nextInt();
        System.out.print("Yolculuk tipini giriniz (Tek yön için 1, Gidiş-Geliş için 2 seçiniz): ");
        int type = in.nextInt();

        if (km < 0 || age < 0) {
            System.out.println("Hatalı giriş yaptınız!");
        } else {
            if (type == 1 || type == 2) {
                float discount1, discount2;
                if (age < 12) {
                    discount1 = 0.5f;
                } else if (age <= 24) {
                    discount1 = 0.1f;
                } else if (age > 60) {
                    discount1 = 0.3f;
                } else {
                    discount1 = 0;
                }
                if (type == 2) {
                    discount2 = 0.2f;
                } else {
                    discount2 = 0;
                }

                float total = km * type * 0.10f - (km * type * 0.10f * discount1) - (km * type * 0.10f * discount2);
                System.out.println("Toplam tutar: " + (km * type * 0.1));
                System.out.println("İndirim tutarı: " + (discount1 + discount2));
                System.out.println("Ödenecek tutar: " + total +"TL");

            } else {
                System.out.println("Hatalı giriş yaptınız!");
            }
        }
    }
}
