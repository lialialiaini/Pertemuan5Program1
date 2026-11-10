import java.util.Scanner;
public class ceksebuahangka {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan angka = ");
        int angka = in.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap");
        } else {
            System.out.println(angka + " adalah bilangan ganjil");
           in.close();
      }
    }
}
