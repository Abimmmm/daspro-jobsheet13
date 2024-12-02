import java.util.Scanner;

public class Studicase {

    static String[][] dataMhs = new String[100][5];
    static int jmlData = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int pilih;

        while (true) {
            System.out.println("=== PENCATATAN PRESTASI MAHASISWA ===");
            System.out.println("1. Tambah Data Prestasi");
            System.out.println("2. Tampilkan Semua Prestasi");
            System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
            System.out.println("4. keluar");

            System.out.print("Pilih Menu : ");
            pilih = sc.nextInt();

            if (pilih == 1) {
                tambahPrestasi();
            } else if (pilih == 2) {
                tampilDataPrestasi();
            } else if (pilih == 3) {

            } else if (pilih == 4) {
                break;
            } else {
                System.out.println("Menu Tidak Valid!!");
            }
        }

    }

    static void tambahPrestasi() {
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = sc.next();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = sc.next();
        System.out.print("Masukkan Jenis Prestasi: ");
        String jenis = sc.next();
        String tingkat;
        while (true) {
            System.out.print("Masukkan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
            tingkat = sc.next();
            if (!tingkat.equalsIgnoreCase("Lokal") && !tingkat.equalsIgnoreCase("Nasional")
                    && !tingkat.equalsIgnoreCase("Internasional")) {
                System.out.println("Tingkat prestasi tidak valid. Coba lagi!");
            } else {
                break;
            }
        }

        String tahun;
        while (true) {
            System.out.print("Masukkan Tahun Prestasi (2010 - 2024): ");
            tahun = sc.next();
            if (!(tahun.equals("2010") || tahun.equals("2011") || tahun.equals("2012") || tahun.equals("2013")
                    || tahun.equals("2014") || tahun.equals("2015") || tahun.equals("2016") || tahun.equals("2017")
                    || tahun.equals("2018") || tahun.equals("2019") || tahun.equals("2020") || tahun.equals("2021")
                    || tahun.equals("2022") || tahun.equals("2023") || tahun.equals("2024"))) {
                System.out.println("Tahun tidak valid. Coba lagi!");
            } else {
                break;
            }
        }
        System.out.println("Data Berhasil Ditambahkan!!");

        dataMhs[jmlData][0] = nama;
        dataMhs[jmlData][1] = nim;
        dataMhs[jmlData][2] = jenis;
        dataMhs[jmlData][3] = tingkat;
        dataMhs[jmlData][4] = tahun;
        jmlData++;

    }

    public static void tampilDataPrestasi() {
        if (jmlData == 0) {
            System.out.println("Data Belum Diisi!!");
        } else if (jmlData > 0) {
            System.out.println("=== Daftar Prestasi Mahasiswa ===");
            System.out.println("Nama | " + "NIM | " + "Jenis | " + "Tingkat | " + "Tahun | ");
            for (int i = 0; i < jmlData; i++) {
                System.out.println(dataMhs[i][0] + " | " + dataMhs[i][1] + " | " + dataMhs[i][2] + " | " + dataMhs[i][3]
                        + " | " + dataMhs[i][4]);
            }
        }

    }

    public static void analisisPrestasi() {
        System.out.println("Masukkan Jenis Prestasi yang ingin dianalisis : ");
        int analisis = sc.nextInt();

        System.out.println("=== ANALISIS PRESTASI MAHASISWA ===");
        for (int i = 0; i < dataMhs.length; i++) {

        }
    }

}