import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class DaireHesaplari {
    public static void main(String[] args) {
        float r, dilimAlan ,  pi =3.14f, aci;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = girdi.nextFloat();
        System.out.print("Dilim açısını giriniz: ");
        aci = girdi.nextFloat();

        dilimAlan = (pi * r * r * aci) / 360;

        System.out.print("Dairenin alanı: " + dilimAlan );

    }
}
