import java.util.Scanner;
public class Studicase {

    public static void main(String[] args) {
        tambahPrestasi();
    }

    static void tambahPrestasi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Jenis Prestasi: ");
        String jenis = sc.nextLine();
        String tingkat;
        
        while (true) {
            System.out.print("Masukkan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
            tingkat = sc.nextLine();
            if (!tingkat.equalsIgnoreCase("Lokal") && !tingkat.equalsIgnoreCase("Nasional") && !tingkat.equalsIgnoreCase("Internasional")) {
                System.out.println("Tingkat prestasi tidak valid. Coba lagi!");
            } else {
                continue;
            }
        }
        
        int tahun;
        while (true) {
            System.out.print("Masukkan Tahun Prestasi (2010 - 2024): ");
            tahun = sc.nextInt();
            if (tahun < 2010 || tahun > 2024) {
                System.out.println("Tahun Prestasi tidak valid. Coba lagi!");
            } else {
                continue;
            }
        }
    }
}