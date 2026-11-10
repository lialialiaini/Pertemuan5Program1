import java.util.Scanner;

public class cekpositifnegatifnol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan angka = ");
        int angka = in.nextInt();

        if (angka > 0) {
            System.out.println(angka + " adalah bilangan positif");
        } else if (angka < 0) {
            System.out.println(angka + " adalah bilangan negatif");
        } else {
            System.out.println(angka + " adalah nol");
        }
        in.close();
        }
        
    }
