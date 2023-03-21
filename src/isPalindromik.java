import java.util.Scanner;

public class isPalindromik {
    static boolean isPalindrome(String str) {
        int j = str.length() - 1;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Palindromi kontrolü için kelime giriniz: ");
        String str = scan.nextLine();

        System.out.println(isPalindrome(str));
    }
}
