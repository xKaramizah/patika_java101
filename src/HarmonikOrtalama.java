import java.util.Arrays;
import java.util.Scanner;

public class HarmonikOrtalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısı : ");
        int n = input.nextInt();
        double harmonikSeri = 0;
        double harmonikOrt = 0;
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            array[i] = input.nextInt();
            harmonikSeri += (double) 1 / array[i];
        }
        harmonikOrt = array.length / harmonikSeri;

        System.out.println("Oluşturulan dizi: " + Arrays.toString(array) + "\nGirilen " + n + " sayının : \n" +
                "Harmonik serisi : " + harmonikSeri +
                "\nHarmonik Ortalaması : " + harmonikOrt);
    }
}
