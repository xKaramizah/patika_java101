import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userDB = "user", passDB = "pass";
        String user, pass;
        int balance = 2000, hak = 3, secim = 0, cash;

        do {
            System.out.print("Kullanıcı adı giriniz: ");
            user = in.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            pass = in.nextLine();
            if (user.equals(userDB) && pass.equals(passDB)) {
                System.out.println("Giriş Başarılı. \nX BANK'a Hoş geldiniz.");
                do {
                    System.out.println("""
                            1-Para Yatırma
                            2-Para Çekme
                            3-Bakiye Sorgula
                            4-Çıkış Yap""");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    secim = in.nextInt();
                    if (secim > 5) {
                        System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz.");
                    }
                    switch (secim) {
                        case 1 -> {
                            System.out.println("Yatırmak istediğiniz tutarı yazınız.");
                            cash = in.nextInt();
                            balance += cash;
                            System.out.println("Güncel bakiyeniz: " + balance);
                        }
                        case 2 -> {
                            System.out.println("Çekmek istediğiniz tutarı yazınız.");
                            cash = in.nextInt();
                            if (cash > balance) {
                                System.out.println("Bakiyeniz yetersiz.");
                            } else {
                                balance -= cash;
                                System.out.println("Güncel bakiyeniz: " + balance);
                            }
                        }
                        case 3 -> System.out.println("Güncel bakiyeniz: " + balance);
                        default -> {
                        }
                    }
                }
                while (secim != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;

            } else {
                System.out.println("Kullanıcı adı veya şifre yanlış. \nKalan hakkınız: " + --hak);
            }
            if (hak == 0) {
                System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
            }
        } while (hak > 0);
    }
}
