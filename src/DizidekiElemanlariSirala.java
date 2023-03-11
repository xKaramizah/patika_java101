import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSirala {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Dizinin oluşacağı eleman sayısını giriniz: ");
        int n = in.nextInt();
        int[] list = new int[n];
        int temp;
        System.out.println("Dizinin elemanları: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            list[i] = in.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
