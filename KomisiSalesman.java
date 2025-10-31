
package PBOpraktikum;

import java.util.Scanner;

public class KomisiSalesman {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan total penjualan hari ini: ");
        double jual = in.nextDouble();

        double jasa = 0, komisi = 0;

        if (jual <= 2000000) {
            jasa = 100000;
            komisi = 0.1 * jual;
        } else if (jual <= 5000000) {
            jasa = 200000;
            komisi = 0.15 * jual;
        } else {
            jasa = 300000;
            komisi = 0.2 * jual;
        }

        double totalPendapatan = jasa + komisi;

        System.out.println("Total Pendapatan Salesman: Rp" + totalPendapatan);
    }
}
