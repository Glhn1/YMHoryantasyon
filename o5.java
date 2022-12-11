//TAŞ-KAĞIT-MAKAS OYUNU
import java.util.Scanner;
public class o5{
    public static void main(String[]args){
        String[] nesneler = {"Tas","Kagit","Makas"};
        int prg = (int)(Math.random()*3);

        Scanner giris = new Scanner (System.in);
        System.out.print("Tas:0, Kagit:1, Makas:2 Hangisi?");
        int sen = giris.nextInt();

        System.out.println("Program:"+ nesneler[prg]);
        System.out.println("Sen:"+ nesneler[sen]);
        if ((prg==0 && sen==1)|| (prg==1 && sen==2) || (prg==2 && sen==0))
            System.out.println("KAZANDIN!");
        else if ((prg==0 && sen==2)|| (prg==1 && sen==0) || (prg==2 && sen==1))
            System.out.println("KAYBETTİN!");
        else
            System.out.println("KAZANAN YOK.");

    }
}
