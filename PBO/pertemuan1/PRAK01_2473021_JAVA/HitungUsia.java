/**
 * Pertemuan 1 [PRAKTIKUM]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 21 Februari 2025
 */
package PBO.pertemuan1.PRAK01_2473021_JAVA;

import java.util.Scanner;

public class HitungUsia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Contoh Input");
        System.out.print("Tanggal lahir : ");
        int tglLahir = sc.nextInt();
        System.out.print("Bulan lahir : ");
        int blnLahir = sc.nextInt();
        System.out.print("Tahun lahir : ");
        int thnLahir = sc.nextInt();

        // Process
        int tanggalHariIni = 14;
        int bulanHariIni = 2;
        int tahunHariIni = 2023;

        int usiaTahun = tahunHariIni - thnLahir;
        int usiaBulan = bulanHariIni - blnLahir;
        int usiaHari = tanggalHariIni - tglLahir;

        // Jika hari dan bulan kurang dari 0
        if (usiaHari < 0) {
            usiaHari += 30;
            usiaBulan--;
        }
        if (usiaBulan < 0) {
            usiaBulan += 12;
            usiaTahun--;
        }

        // Output
        System.out.println("Contoh Output");
        System.out.println("Usia anda " + usiaTahun + " tahun, " + usiaBulan + " bulan, " + usiaHari + " hari");

        sc.close();
    }
}
