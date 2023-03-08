public class AsalSayiYazdir {
    public static void main(String[] args) {
        int no = 100;

        System.out.println("Aralıktaki asal sayılar: ");

        for (int i = 2; i < no; i++) {
            int sayac = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sayac++;
                }
            }
            if (sayac < 2) {
                System.out.print(i +" ");
            }

        }
    }
}
