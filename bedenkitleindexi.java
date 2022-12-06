import java.util.Scanner;
public class bedenkitleindexi {
    public static void main(String[] args){
        Scanner boygirisi = new Scanner(System.in);
        Scanner kilogirisi = new Scanner(System.in);

        System.out.print("Boy uzunluğunuzu giriniz : ");
        double boy = boygirisi.nextDouble();

        System.out.print("Kilo bilginizi giriniz : ");
        double kilo = kilogirisi.nextDouble();

        double islem = kilo / (boy*boy);
        System.out.println("Beden Kitle İndexiniz : "+islem);
    }
}
