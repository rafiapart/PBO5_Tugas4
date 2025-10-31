
package PBOpraktikum;

import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan NIK: ");
        String nik = in.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = in.nextLine();
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int gol = in.nextInt();
        System.out.print("Masukkan jumlah anak: ");
        int anak = in.nextInt();

        double gajiPokok = 0;
        switch (gol) {
            case 1: gajiPokok = 1200000; break;
            case 2: gajiPokok = 1500000; break;
            case 3: gajiPokok = 1750000; break;
            case 4: gajiPokok = 2000000; break;
            default: System.out.println("Golongan tidak valid!");
        }

        double tunjPasangan = 0;
        double tunjAnak = 0;

        if (gol == 1 || gol == 4) {
            tunjPasangan = 0.1 * gajiPokok;
        }
        if (gol == 4 && anak > 0) {
            tunjAnak = 0.05 * gajiPokok * anak;
        }

        double gajiBersih = gajiPokok + tunjPasangan + tunjAnak;

        System.out.println("\n===== SLIP GAJI =====");
        System.out.println("NIK        : " + nik);
        System.out.println("Nama       : " + nama);
        System.out.println("Golongan   : " + gol);
        System.out.println("Gaji Pokok : Rp" + gajiPokok);
        System.out.println("Tunj. Pasangan : Rp" + tunjPasangan);
        System.out.println("Tunj. Anak     : Rp" + tunjAnak);
        System.out.println("Gaji Bersih    : Rp" + gajiBersih);
    }
}


