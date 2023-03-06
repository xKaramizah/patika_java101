import java.util.Scanner;

public class SayiSirala {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner input = new Scanner(System.in);
        System.out.print("A. Sayı: ");
        a = input.nextInt();
        System.out.print("B. Sayı: ");
        b = input.nextInt();
        System.out.print("C. Sayı: ");
        c = input.nextInt();
        System.out.print("D. Sayı: ");
        d = input.nextInt();

        if (a > b && a > c && a > d) {
            if (b > c && b > d) {
                if (c > d) {
                    System.out.print("Sıralama: A > B > C > D");
                } else {
                    System.out.print("Sıralama: A > B > D > C");
                }
            } else if (c > b && c > d) {
                if (b > d) {
                    System.out.print("Sıralama: A > C > B > D");
                } else {
                    System.out.print("Sıralama: A > C > D > B");
                }
            } else {
                if (b > c) {
                    System.out.print("Sıralama: A > D > B > C");
                } else {
                    System.out.print("Sıralama: A > D > C > B");
                }
            }
        }
        if (b > a && b > c && b > d) {
            if (a > c && a > d) {
                if (c > d) {
                    System.out.print("Sıralama: B > A > C > D");
                } else {
                    System.out.print("Sıralama: B > A > D > C");
                }
            } else if (c > a && c > d) {
                if (a > d) {
                    System.out.print("Sıralama: B > C > A > D");
                } else {
                    System.out.print("Sıralama: B > C > D > A");
                }
            } else {
                if (a > c) {
                    System.out.print("Sıralama: B  > D > A > C");
                } else {
                    System.out.print("Sıralama: B  > D > C > A");
                }
            }
        }
        if (c > a && c > b && c > d) {
            if (a > b && a > d) {
                if (b > d) {
                    System.out.print("Sıralama: C > A > B > D");
                } else {
                    System.out.print("Sıralama: C > A > D > B");
                }
            } else if (b > a && b > d) {
                if (a > d) {
                    System.out.print("Sıralama: C > B > A > D");
                } else {
                    System.out.print("Sıralama: C > B > D > A");
                }
            } else {
                if (a > b) {
                    System.out.print("Sıralama: C > D > A > B");
                } else {
                    System.out.print("Sıralama: C > D > B > A");
                }
            }
        }
        if (d > a && d > b && d > c) {
            if (a > b && a > c) {
                if (b > c) {
                    System.out.print("Sıralama: D > A > B > C");
                } else {
                    System.out.print("Sıralama: D > A > C > B");
                }
            } else if (b > a && b > c) {
                if (a > c) {
                    System.out.print("Sıralama: D > B > A > C");
                } else {
                    System.out.print("Sıralama: D > B > C > A");
                }
            } else {
                if (a > b) {
                    System.out.print("Sıralama: D > C > A > B");
                } else {
                    System.out.print("Sıralama: D > C > B > A");
                }
            }
        }
    }
}
