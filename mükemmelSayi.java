import java.util.Scanner;
public class mükemmelSayi {
    public static void main(String[] args){

        /* 
         * Mükemmel Sayı Nedir? 
         * Mükemmel sayı, kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayı.
         * 6 = 1,2,3
         * 28 =1,2,4,7,14
        */

        Scanner giris = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = giris.nextInt();

        int toplam = 0;

        for(int i = 1; i < sayi; i++)
        {
            if(sayi % i == 0) {
                toplam = toplam + i;
            }
        }
        if(sayi == toplam) {
            System.out.println(sayi + " Mükemmel bir sayidir");
        }
        else {
            System.out.println(sayi + " Mükemmel bir sayi degildir.");
        }
    }
}
