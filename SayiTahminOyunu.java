import java.util.Scanner;
public class SayiTahminOyunu {
    public static void main(String[] args){
        int randomSayi = (int)(Math.random()*10);

        Scanner giris = new Scanner(System.in);
        System.out.println("Sayı denemesi yapınız");

        for(int i=0; i<10; i++){
            System.out.print("=> ");
            int sayigirisi = giris.nextInt();
            if(sayigirisi > randomSayi){
                System.out.println("Daha Küçük!");
            }
            if(sayigirisi < randomSayi){
                System.out.println("Daha Büyük!");
            }
            if(sayigirisi == randomSayi){
                System.out.println("Doğru Tahmin ! :"+randomSayi);
                break;
            }
        }
    }   
}
