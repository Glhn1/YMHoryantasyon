//mantık operatörleri
import java.util.Scanner;
public class o4{
    public static void main(String[]args){

        //Tarayıcı nesnesi oluştur
        Scanner giris = new Scanner (System.in);

        //Giriş Al
        System.out.print("Lütfen bir tam sayı giriniz:");
        int sayi = giris.nextInt();

        if(sayi%2==0 && sayi%3 == 0){
            System.out.println(sayi +" sayısı 2 ve üçe bölünebilir ");
        }
        if(sayi%2==0 || sayi%3 == 0) {
            System.out.println(sayi +" sayısı 2 veya üçe bölünebilir");
        }
        if(sayi%2==0 ^ sayi%3 == 0) {
            System.out.println(sayi + " sayısı 2 veya üçe bölünebilir" + "her ikisinede bölünemez");
        }

    }
}