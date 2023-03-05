import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        float fArmut = 2.14f, fElma = 3.67f, fDomates = 1.11f, fMuz = 0.95f, fPatlican = 5f, total;
        int armut, elma, domates, muz, patlican;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Armut kaç kg? : ");
        armut = girdi.nextInt();
        System.out.print("Elma kaç kg? : ");
        elma = girdi.nextInt();
        System.out.print("Domates kaç kg? : ");
        domates = girdi.nextInt();
        System.out.print("Muz kaç kg? : ");
        muz = girdi.nextInt();
        System.out.print("Patlıcan kaç kg? : ");
        patlican = girdi.nextInt();

        total = armut * fArmut +
                elma * fElma +
                domates * fDomates +
                muz * fMuz +
                patlican * fPatlican;
        System.out.print("Toplam ödenecek tutar : " + total + " TL");
    }
}
