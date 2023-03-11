import java.util.Arrays;
import java.util.Scanner;

public class YildizlarIle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Bir karakter seçiniz: ");
        String c = in.nextLine();

        String[][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 || i == 6 || j == 0 || j == 3) {
                    letter[i][j] = c + " ";
                } else {
                    letter[i][j] = "  ";
                }
            }
        }

//        for (String[] row : letter) {
//            for (String col : row) {
//                System.out.print(col);
//            }
//            System.out.println();
//        }

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                System.out.print(letter[i][j]);
            }
            System.out.println();
        }
    }
}
