
/**
 * Pertemuan 5 [Praktikum]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 21 Maret 2025
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BangunDatar> daftarBangunDatar = new ArrayList<>();
        int pilihan;

        while (true) {
            System.out.println("\nPilih bangun datar untuk ditambahkan:");
            System.out.println("1. Persegi");
            System.out.println("2. Lingkaran");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Segitiga");
            System.out.println("5. Tampilkan Semua Data");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan: ");

            try {
                pilihan = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                scanner.next(); // Membersihkan buffer
                continue;
            }

            if (pilihan == 6) {
                System.out.println("Terima kasih telah menggunakan program.");
                break;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi: ");
                    float sisi = validasiInput(scanner);
                    daftarBangunDatar.add(new Persegi(sisi));
                    break;
                case 2:
                    System.out.print("Masukkan jari-jari: ");
                    float r = validasiInput(scanner);
                    daftarBangunDatar.add(new Lingkaran(r));
                    break;
                case 3:
                    System.out.print("Masukkan panjang: ");
                    float panjang = validasiInput(scanner);
                    System.out.print("Masukkan lebar: ");
                    float lebar = validasiInput(scanner);
                    daftarBangunDatar.add(new PersegiPanjang(panjang, lebar));
                    break;
                case 4:
                    System.out.print("Masukkan alas: ");
                    float alas = validasiInput(scanner);
                    System.out.print("Masukkan tinggi: ");
                    float tinggi = validasiInput(scanner);
                    daftarBangunDatar.add(new Segitiga(alas, tinggi));
                    break;
                case 5:
                    if (daftarBangunDatar.isEmpty()) {
                        System.out.println("Belum ada bangun datar yang dimasukkan.");
                    } else {
                        System.out.println("\nDaftar Bangun Datar:");
                        for (int i = 0; i < daftarBangunDatar.size(); i++) {
                            BangunDatar bd = daftarBangunDatar.get(i);
                            System.out.println("Bangun Datar ke-" + (i + 1));
                            System.out.println("Luas: " + bd.luas());
                            System.out.println("Keliling: " + bd.keliling());
                            System.out.println("--------------------------");
                        }
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }

    public static float validasiInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.print("Input harus berupa angka! Masukkan lagi: ");
                scanner.next();
            }
        }
    }
}
