
package PBOpraktikum;

import java.util.Scanner;

public class LuasBangunDatar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Trapesium");
        System.out.println("5. Layang-layang");
        System.out.print("Masukkan pilihan: ");
        int pilih = in.nextInt();

        double luas = 0;

        switch (pilih) {
            case 1:
                System.out.print("Masukkan sisi: ");
                double sisi = in.nextDouble();
                luas = sisi * sisi;
                break;
            case 2:
                System.out.print("Masukkan alas: ");
                double alas = in.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = in.nextDouble();
                luas = 0.5 * alas * tinggi;
                break;
            case 3:
                System.out.print("Masukkan jari-jari: ");
                double r = in.nextDouble();
                luas = Math.PI * r * r;
                break;
            case 4:
                System.out.print("Masukkan sisi atas: ");
                double atas = in.nextDouble();
                System.out.print("Masukkan sisi bawah: ");
                double bawah = in.nextDouble();
                System.out.print("Masukkan tinggi: ");
                tinggi = in.nextDouble();
                luas = 0.5 * (atas + bawah) * tinggi;
                break;
            case 5:
                System.out.print("Masukkan diagonal 1: ");
                double d1 = in.nextDouble();
                System.out.print("Masukkan diagonal 2: ");
                double d2 = in.nextDouble();
                luas = 0.5 * d1 * d2;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }

        System.out.println("Luas = " + luas);
    }
}
