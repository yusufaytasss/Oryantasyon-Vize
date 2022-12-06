public class yildizlarlaücgen {
    public static void main(String[] args){
        for(int i=1; i<=10;i++) {   //koşul ifadesi, satır sayısı.
            for(int j=i;j<=10;j++) {
                System.out.print(" "); //sol taraftaki boşluğu oluşturur.
            }
            for(int k =1;k<=i;k++) {
                System.out.print("*");
                System.out.print(" "); //yıldızlar arası boşluk.
            }
            System.out.println(" "); //bir alt satıra geçiş için kullanılıyor.
        }
    }
}
