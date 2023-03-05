import java.util.Scanner;
public class VkIndex {
    public static void main(String[] args) {
        float kilo, boy, vki;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = girdi.nextFloat();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = girdi.nextFloat();
        vki = kilo / (boy * boy);
        System.out.print("Vücut kitle indeksiniz: " + vki);

    }
}
