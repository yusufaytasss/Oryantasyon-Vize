import java.util.Scanner;
public class negatifpozitifsayi {
    public static void main(String[] args){
        Scanner giris = new Scanner(System.in);
        System.out.print("Lütfen sayı girişi yapınız : ");
        double sayi = giris.nextDouble();

        if(sayi < 0){
            System.out.println("Sayınız negatifirtir!");
        }
        else if(sayi > 0){
            System.out.println("Sayınız pozitiftir!");
        }
        else{
            System.out.println("Sayınız sıfıra eşittir.");
        }
    }
}
