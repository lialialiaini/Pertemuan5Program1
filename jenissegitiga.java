import java.util.Scanner;
public class jenissegitiga {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukan sisi 1 = ");
        double a = in.nextDouble();
        System.out.println("Masukan sisi 2 = ");
        double b = in.nextDouble();
        System.out.println("Masukan sisi 3 = ");
        double c = in.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if (a == b && b == c) {
                System.out.println("Jenis segitiga = Segitiga Sama Sisi");
            } else if (a == b || a == c || b == c) {
                System.out.println("Jenis segitiga = Segitiga Sama Kaki");
            } else {
                System.out.println("Jenis segitiga = Segitiga Sembarang");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }
        in.close();
        }                                  
    }
