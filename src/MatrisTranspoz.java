import java.util.Scanner;

public class MatrisTranspoz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Matris Satır sayısı giriniz: ");
        int n1 = input.nextInt();
        System.out.print("Matris Sütun sayısı giriniz: ");
        int n2 = input.nextInt();
        int sayisay = 1;
        int[][] list = new int[n1][n2];
        System.out.println("Sırasıyla " + (n1*n2) + " adet sayı giriniz: ");

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++){
                System.out.print( sayisay + ". Sayı: ");
                list[i][j] = input.nextInt();
                sayisay++;
            }
        }
        System.out.println("Girilen MATRIS: ");
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++){
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }

        int[][] tList = new int[list[0].length][list.length];

        System.out.println("Transpoz'u: ");

        for (int i = 0; i < tList.length; i++) {
            for (int j = 0; j < tList[0].length; j++) {
                tList[i][j] = list[j][i];
                System.out.print(tList[i][j] + " ");
            }
            System.out.println();
        }
    }
}
