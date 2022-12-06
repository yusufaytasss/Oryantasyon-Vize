import java.util.Scanner;
public class vizefinalnotortalaması {
    public static void main(String[] args){
        Scanner vizegiris = new Scanner(System.in);
        Scanner finalgiris = new Scanner(System.in);
        Scanner vizeyüzdelik = new Scanner(System.in);

        System.out.print("Vize notunuzu giriniz: ");
        double vizenotu = vizegiris.nextDouble();

        System.out.print("Final notunuzu giriniz: ");
        double finalnotu = vizegiris.nextDouble();

        System.out.print("Vize yüzdelik oranınızı giriniz :");
        double vizeoranı = vizegiris.nextDouble();

        double finaloranı = 100 - vizeoranı;

        double ortlama = (vizenotu * vizeoranı) + (finalnotu * finaloranı);

        System.out.print("Ortalamanız : "+ortlama);
    }
}
