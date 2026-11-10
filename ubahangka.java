import java.util.Scanner;
public class ubahangka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Mau Hari Apa (1-7) = ");
        int hari = in.nextInt();

        String namaHari;
        
        switch (hari) {
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5:
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
            case 7:
                namaHari = "Minggu";
                break;
            default:
                namaHari = "Hari tidak valid: " + hari;
                break;
        }
            System.out.println("Nama hari = " + namaHari);
            in.close();
        }                                       
    }


