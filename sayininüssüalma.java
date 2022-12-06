import java.util.Scanner;
public class sayininüssüalma {
    public static void main(String[] args) {
        System.out.print("Lütfen sayı girişi yapınız : ");
        Scanner sayigirisi = new Scanner(System.in);
        double sayi = sayigirisi.nextDouble();

        System.out.print("Lütfen almak istediğiniz üssü giriniz : ");
        Scanner üsgirisi = new Scanner(System.in);
        double üssü = sayigirisi.nextDouble();

        double üsalma = Math.pow(sayi, üssü);
        System.out.println("Girdiğiniz sayının üssel ifadesi : "+üsalma);
    }
}
