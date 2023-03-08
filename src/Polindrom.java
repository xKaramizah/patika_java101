import java.util.Scanner;

public class Polindrom {
    public static boolean isPolindrom(int no) {
        int tempNo = no, revNo = 0, lastNo;
        while (tempNo != 0) {
            lastNo = tempNo % 10;
            revNo = (revNo * 10) + lastNo;
            tempNo = tempNo / 10;
        }
        return no == revNo;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n1 = in.nextInt();
        System.out.println("Polindrom olma durumu : " + isPolindrom(n1));
    }
}
