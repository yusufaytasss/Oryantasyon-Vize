import java.util.Scanner;
public class tekcift {
    public static void main(String[] args){
        System.out.print("Sayı girişi yapınız : ");
        Scanner giris = new Scanner(System.in);
        int sayi = giris.nextInt();

        if(sayi %2 == 0){
            System.out.println("Sayınız çift");
        }
        else{
            System.out.println("Sayınız tek");
        }
    }
}
