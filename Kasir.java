
package PBOpraktikum;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Apakah memiliki kartu member? (ya/tidak): ");
        String member = in.next();
        System.out.print("Masukkan total belanja: Rp");
        double belanja = in.nextDouble();

        double diskon = 0;

        if (member.equalsIgnoreCase("ya")) {
            if (belanja > 500000) diskon = 50000;
            else if (belanja > 100000) diskon = 15000;
        } else {
            if (belanja > 100000) diskon = 10000;
        }

        double totalBayar = belanja - diskon;

        System.out.print("Masukkan uang yang dibayar: Rp");
        double bayar = in.nextDouble();

        double kembalian = bayar - totalBayar;

        System.out.println("\n=== STRUK PEMBAYARAN ===");
        System.out.println("Total Belanja : Rp" + belanja);
        System.out.println("Diskon        : Rp" + diskon);
        System.out.println("Total Bayar   : Rp" + totalBayar);
        System.out.println("Kembalian     : Rp" + kembalian);
    }
}
