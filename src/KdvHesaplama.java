import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("KDV'siz fiyat giriniz: ");
        float hamFiyat = input.nextFloat();
        float kdvOran = hamFiyat > 0 && hamFiyat < 1000 ? 0.18f : 0.08f;
        float kdvliFiyat = hamFiyat * (1+kdvOran);
        float kdvTutar = hamFiyat * kdvOran;

        System.out.println("KDV'siz fiyat: " + hamFiyat);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV'li fiyat: " + kdvliFiyat);
        System.out.println("KDV tutarı: " + kdvTutar);

    }
}
