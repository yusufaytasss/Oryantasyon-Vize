import java.util.Scanner;
public class dairealancevre {
    public static void main(String[] args){
        double alan,cevre,pi=3.14;

        Scanner giris = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz : ");
        int r =giris.nextInt();
        cevre = 2 * pi * r;
        alan = pi * (r*r);
        System.out.println("Dairenin alanı : "+ alan);
        System.out.println("Dairenin Çevresi : "+cevre);

    }
}
