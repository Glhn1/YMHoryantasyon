//Toplama Testi
import java.util.Scanner;
public class o2{
    public static void main(String[]args){
        int sayi1= (int) (System.currentTimeMillis()%10);
        int sayi2= (int) (System.currentTimeMillis()/7%10);

        //Scanner oluşturma(klavyeden/konsoldan giriş için)
        Scanner giris = new Scanner(System.in);
        System.out.println(sayi1+ "+" + sayi2+ "sonucu nedir?");
        int cevap = giris.nextInt();
        System.out.println(sayi1+ "+" + sayi2+ "=" + cevap + "sonucu" +(sayi1 + sayi2 == cevap));
    }

}


