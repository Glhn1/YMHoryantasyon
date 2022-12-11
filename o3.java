//İf-else daire alanı
import java.util.Scanner;
public class o3{
    public static void main(String[]args){
        Scanner giris = new Scanner (System.in);
        System.out.print("Lütfen çapı giriniz:");
        int cap = giris.nextInt();
        if(cap<0){
            System.out.println("Yanlış Giriş");
        }
        else {
            double alan= cap*cap*3.14159;
            System.out.println("Alan:"+alan);
        }

    }
}
