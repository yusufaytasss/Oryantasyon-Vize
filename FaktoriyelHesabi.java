import java.util.Scanner;
public class FaktoriyelHesabi {
    public static void main(String[] args){
        System.out.print("Lütfen faktöriyelinin alınmasını istediğiniz sayıyı giriniz : ");
        Scanner FaktoriyelHesabi = new Scanner(System.in);
        double sayi = FaktoriyelHesabi.nextDouble();

        double faktöriyel = 1;

        for(int i = 1; i <=sayi; i++) {
            faktöriyel = faktöriyel * i;
        }
        System.out.println("Faktöriyeli :"+faktöriyel);
    }
}
