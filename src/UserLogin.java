import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName = "admin", pass = "123", userCheck, passCheck, talep;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adı giriniz: ");
        userCheck = input.nextLine();
        System.out.print("Şifre giriniz: ");
        passCheck = input.nextLine();

        if (userName.equals(userCheck) && pass.equals(passCheck)) {
            System.out.print("Kullanıcı girişi başarılı...");
        } else if (userName.equals(userCheck)) {
            System.out.println("Hatalı şifre!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (e/h)");
            talep = input.nextLine();
            switch (talep) {
                case "e":
                    String newPass;
                    System.out.print("Yeni şifrenizi belirleyiniz: ");
                    newPass = input.nextLine();
                    if (newPass.equals(pass)) {
                        System.out.print("Şifre seçimi hatalı! (Yeni şifreniz eskisi ile aynı olamaz)");
                    } else {
                        System.out.println("Şifreniz güncellendi... Tekrar giriş yapınız!");
                        pass = newPass;
                        System.out.print("Kullanıcı adınız: " + userName + "\nYeni şifreniz: " + pass);
                    }
                    break;
                case "h":
                    System.out.print("İşlem iptal edildi.");
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız!");
            }
        } else {
            System.out.print("Kullanıcı bulunamadı!");
        }
    }
}
