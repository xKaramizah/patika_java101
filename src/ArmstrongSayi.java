//Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.
//
//Armstrong Sayı Nedir ?
//N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
//
//Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
//
//1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.
//
//1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
//
//54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748

import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        Scanner init = new Scanner(System.in);
        System.out.print("Armstrong olup olmadığına bakılacak tam sayıyı giriniz: ");
        int no = init.nextInt();
        int tempNo = no;
        int basNo = 0;
        int basValue = 1;
        int basPow = 1;
        int result = 0;

        while (tempNo != 0){

            tempNo /= 10;
            basNo++;
        }
        tempNo = no;

        while (tempNo !=0){
            basValue = tempNo % 10;
            basPow = 1;
            for (int i = 1; i <= basNo; i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNo /= 10;
        }
        if (result == no){
            System.out.println("Girdiğiniz "+no+" sayısı bir Armstrong sayıdır.");
        }else {
            System.out.println("Girdiğiniz "+no+" sayısı Armstrong sayı değildir!");
        }
    }
}

