import java.util.Arrays;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        Scanner scan = new Scanner(System.in);

        int life = 5;
        int guess;
        boolean isRepeat = false, isWin = false;
        int[] guesses = new int[5];

        System.out.println("=====================\n" +
                "\tOYUN BAŞLADI\n=====================\n" +
                "Tahmin edeceğiniz sayı oluşturuldu !..  -->> " + number + "\n" +
                "NOT: Tahminleriniz 0-100 aralığında olmalıdır!!");

        while (life != 0) {
            System.out.print("===================== \nTahmininizi yapınız: ");
            guess = scan.nextInt();

            if (guess < 0 || guess > 99) {
                if (!isRepeat) {
                    System.out.println("Girdiğiniz sayılar sınırlar dışındadır. '0 - 100' aralığında bir sayı seçiniz. \nTekrarı halinde hak kaybedeceksiniz!");
                    isRepeat = true;
                } else {
                    System.out.println("Çok fazla hatalı giriş yaptınız! \nKalan HAKKINIZ --> " + --life);
                }

                continue;
            }
            if (guess == number) {
                System.out.println("TEBRİKLER!! Tahmininiz doğru.. \nTahmin edilen gizli sayı: " + number);
                isWin = true;
                break;
            } else {
                guesses[5-life] = guess;
                System.out.println("Yanlış tahmin. Kalan HAKKINIZ --> " + --life);
                if (guess > number) {
                    System.out.println("İPUCU: Girdiğiniz " + guess + " sayısı gizli sayıdan BÜYÜKTÜR. ");
                } else {
                    System.out.println("İPUCU: Girdiğiniz " + guess + " sayısı gizli sayıdan KÜÇÜKTÜR. ");
                }
                
            }

        }

        System.out.println("=====================");
        if (isWin) {
            System.out.println("KAZANDINIZ !!");
        }else {
            System.out.println("KAYBETTİNİZ !!" + " Gizli sayı: " + number + " idi.\n" +
                    "Tahminleriniz: " + Arrays.toString(guesses));
            
        }

        System.out.println("OYUN SONA ERDİ...");
    }
}

