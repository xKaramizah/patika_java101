// Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
//
//Örnek : 1643 = 1 + 6 + 4 + 3 = 14
import java.util.Scanner;
public class BasamakSayiTopla {
    public static void main(String[] args) {
        Scanner init = new Scanner(System.in);
        System.out.print("Basamak sayıları toplanacak sayıyı giriniz: ");
        int no = init.nextInt();
        int basNo;
        int result = 0;

        while (no != 0){
            basNo = no % 10;
            no /= 10;
            result += basNo;
        }
        System.out.println(result);
    }
}
