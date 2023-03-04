import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama = toplam / 6.0;
        System.out.print("Ortalamanız: ");
        System.out.println(ortalama);

        String sonuc = ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print(sonuc);

    }
}
