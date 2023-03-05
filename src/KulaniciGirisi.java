import java.util.Scanner;

public class KulaniciGirisi {
    public static void main(String[] args) {

        String userName = "admin", pass = "123", userCheck, passCheck, sifirla;

        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz.");
        userCheck = input.nextLine();
        System.out.println("Şifre giriniz.");
        passCheck = input.nextLine();

        if (userCheck.equals(userName) && passCheck.equals(pass)) {
            System.out.println("Giriş başarılı...");
        } else if (userCheck.equals(userName)) {
            System.out.println("Hatalı şifre!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (e/h)");
            sifirla = input.nextLine();
            if (sifirla.equals("e")) {
                String passNew;
                System.out.println("Yeni şifrenizi belirleyiniz: ");
                passNew = input.nextLine();
                if (passNew.equals(pass)) {
                    System.out.println("Şifre yenileme başarısız! Tekrar deneyiniz.\n Not: Yeni şifreniz eski şifreniz ile aynı olamaz. ");
                } else {
                    System.out.println("Şifre başarıyla oluşturuldu..");
                }

            } else if (sifirla.equals("h")) {
                System.out.println("İşlem sonlandırıldı.");
            } else {
                System.out.println("Hatalı seçim yaptınız.");
            }
        } else {
            System.out.println("Kullanıcı bulunamadı!");
        }
    }
}


