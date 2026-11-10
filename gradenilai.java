import  java.util.Scanner;
public class gradenilai {
    public static void main(String[] args) {
        String grade;

        Scanner in = new Scanner(System.in);

        System.out.println("Berapa nilainya = ");
        double nilai = in.nextDouble();

        if (nilai >= 85) {
            grade = "A";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 55) {
            grade = "C";
        } else if (nilai >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }

        String status = (nilai >= 55) ? "Lulus" : "Tidak Lulus";

        System.out.println("grade nya adalah = " +grade);
        System.out.println("Statusnya adalah = " +status);
        in.close();
    }
}