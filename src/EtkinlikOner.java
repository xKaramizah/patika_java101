import java.util.Scanner;

public class EtkinlikOner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        int heat = input.nextInt();

        if (heat <= 25) {
            if (heat < 5) System.out.println("Bu havada bi kayak yapılır.");
            if (heat >= 5 && heat <= 15) System.out.println("Sinema neden olmasın");
            if (heat > 10) System.out.println("Piknik makul");
        } else {
            System.out.print("Yüzmeye gidebilirsin.");
        }
    }
}
