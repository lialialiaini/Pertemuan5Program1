import java.util.Scanner;
public class kalkulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan angka pertama = ");
        double a = in.nextDouble();

        System.out.println("Masukkan operator (+, -, *, /, %) = ");
        char operator = in.next().charAt(0);

        System.out.println("Masukkan angka kedua = ");
        double b = in.nextDouble();

        double hasil  = 0;
        boolean valid = true;
        
        switch (operator) {
            case '+':
                hasil = a + b;
                break;
            case '-':
                hasil = a - b;
                break;
            case '*':
                hasil = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    valid = false;
                } else {
                    hasil = a / b;
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Error: Modulus dengan nol tidak diperbolehkan.");
                    valid = false;
                } else {
                    hasil = a % b;
                }
                break;
            default:
                valid = false;
                System.out.println("Operator tidak valid");
                break;
        }
            in.close();
            if (valid) {
                System.out.println("Hasil = " + hasil);
            }
        }                                       
    }