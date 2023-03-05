import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notu: ");
        mat = input.nextInt();
        mat = mat >=0 && mat <=100 ? mat : 0;
        System.out.print("Fizik notu: ");
        fizik = input.nextInt();
        fizik = fizik >=0 && fizik <=100 ? fizik : 0;
        System.out.print("Türkçe notu: ");
        turkce = input.nextInt();
        turkce = turkce >=0 && turkce <=100 ? turkce : 0;
        System.out.print("Kimya notu: ");
        kimya = input.nextInt();
        kimya = kimya >=0 && kimya <=100 ? kimya : 0;
        System.out.print("Müzik notu: ");
        muzik = input.nextInt();
        muzik = muzik >=0 && muzik <=100 ? muzik : 0;

        double average = (mat + fizik + turkce + kimya + muzik) / 5;
        System.out.print("Ortalama notunuz: " + average);


    }
}
