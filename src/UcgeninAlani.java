import  java.util.Scanner;
public class UcgeninAlani {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("ÜÇGENİN ALANININ HESAPLAMASI \n1. Kenar Uz. Giriniz: ");
        int a = input.nextInt();
        System.out.print("2. Kenar Uz. Giriniz: ");
        int b = input.nextInt();
        System.out.print("3. Kenar Uz. Giriniz: ");
        int c = input.nextInt();
        double u = (a+b+c)/2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin Alanı: " + alan);

    }
}
