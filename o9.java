public class o9 {
    public static void main(String[] args) {

        int sayi, faktoriyel = 1;
        java.util.Scanner oku = new java.util.Scanner(System.in);
        System.out.print("Faktöriyeli alınacak sayıyı girin : ");
        sayi = oku.nextInt();
        for (int i = 2; i <= sayi; i++) {
            faktoriyel = i * faktoriyel;
        }
        System.out.println(sayi + " sayısının faktöriyeli = " + faktoriyel);
    }
}