import java.util.Scanner;

public class GelismisHesMak {
    static void sum() {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz? :");
        double n = input.nextDouble();

        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = input.nextInt();
            if (i == (n + 1)) {
                break;
            }
            result += number;
        }
        System.out.println("Toplama sonucu : " + result);
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç işlem yapacaksınız: ");
        int n = input.nextInt();
        double number = 0, result = 0;
        int i = 1;

        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = input.nextDouble();
            if (i == (n + 1)) break;
            result -= number;
        }
        System.out.println("Toplama sonucu : " + result);
    }

    static void multi() {
        Scanner input = new Scanner(System.in);
        System.out.print("Çarpımı yapılacak sayıları giriniz: \n1. Sayı: ");
        double a = input.nextDouble();
        System.out.println("2. Sayı: ");
        double b = input.nextDouble();

        double result = a * b;
        System.out.println("Çarpım sonucu: " + result + "\n");
    }

    static void divide() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        double n = input.nextDouble();
        double result = 1, number;
        int i = 1;
        while (true) {
            System.out.println(i++ + ". sayı: ");
            number = input.nextDouble();
            if (i == (n + 1)) {
                break;
            }
            result /= number;
        }
        System.out.println("Bölme sonucu: " + result + "\n");

        /* Diğer yöntem
        System.out.print("Bölümü yapılacak sayıları giriniz: \n1. Sayı: ");
        double a = input.nextDouble();
        System.out.print("2. Sayı: ");
        double b = input.nextDouble();
        if (b == 0) {
            System.out.println("2. sayı sıfırdan farklı olmalı");
            return;
        }
        double result = a / b;
        System.out.println("Bölme sonucu: " + result + "\n");
         */
    }

    static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Üs almak için sayıları giriniz: \nTaban sayısı: ");
        double a = input.nextDouble();
        System.out.println("Üs değeri: ");
        double b = input.nextDouble();

        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println(a + "üzeri " + b + ":" + result + "\n ");
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Faktoriyeli alınacak sayıyı giriniz: ");
        double n = input.nextDouble();
        double result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Sonuç: " + n + "! = " + result);
    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        System.out.print("Mod alınacak sayıyı giriniz: ");
        double n1 = input.nextDouble();
        System.out.print("Bölüm değeri giriniz: ");
        double n2 = input.nextDouble();
        double result = n1 % n2;
        System.out.println(n1 + " sayısının " + n2 + "ile bölümünden kalan (mod) : " + result);
    }

    static void rectangle() {
        Scanner input = new Scanner(System.in);
        int select;
        do {
            System.out.print("""
                    1- Alan hesabı
                    2- Çevre hesabı
                    3- İkiside
                    0- Çıkış yap
                    İşlem şeçimi yapınız: 
                    """);
            select = input.nextInt();
            System.out.print("1. Sayı : ");
            double n1 = input.nextDouble();
            System.out.print("2. Sayı : ");
            double n2 = input.nextDouble();

            switch (select) {
                case 1:
                    double area = n1 * n2;
                    System.out.println("Alanı: " + area);
                    break;
                case 2:
                    double circum = 2 * (n1 + n2);
                    System.out.println("Çevresi: " + circum);
                    break;
                case 3:
                    double area1 = n1 * n2;
                    double circum1 = 2 * (n1 + n2);
                    System.out.println("Alanı: " + area1 + "\nÇevresi: " + circum1);
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız. Tekrar deneyiniz.");
            }
        } while (select != 0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int select;
        String menu = """
                1- Toplama İşlemi
                2- Çıkarma İşlemi
                3- Çarpma İşlemi
                4- Bölme İşlemi
                5- Üslü Sayı Hesaplama
                6- Faktoriyel Alma
                7- Mod Alma
                8- Dikdörtgen alanı ve çevre hesabı
                0- Çıkış yap
                """;
        System.out.println(menu);
        while (true) {
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            select = in.nextInt();
            if (select == 0) {
                break;
            }
            switch (select) {
                case 1 -> sum();
                case 2 -> minus();
                case 3 -> multi();
                case 4 -> divide();
                case 5 -> power();
                case 6 -> factorial();
                case 7 -> mod();
                case 8 -> rectangle();
                default -> System.out.println("Hatalı seçin yaptınız. Tekrar deneyiniz.");
            }
        }
    }
}
