
/**
 * Pertemuan 3 [Praktikum]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 07 Maret 2025
 */
import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class SafariDirector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Safari> listSafari = new ArrayList<>();

        // Memasukkan data 5 hewan 
        System.out.println("Masukkan 5 jenis hewan yang ada di Safari:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama hewan ke-" + (i + 1) + ": ");
            String namaHewan = sc.nextLine();

            int jmlPengunjung, jmlZookeeper, jmlMakanan;

            // Validasi jumlah pengunjung (tidak boleh negatif)
            do {
                System.out.print("Masukkan jumlah pengunjung awal (>=0): ");
                jmlPengunjung = sc.nextInt();
            } while (jmlPengunjung < 0);

            // Validasi jumlah zookeeper (tidak boleh negatif)
            do {
                System.out.print("Masukkan jumlah zookeeper awal (>=0): ");
                jmlZookeeper = sc.nextInt();
            } while (jmlZookeeper < 0);

            // Validasi jumlah makanan (tidak boleh negatif)
            do {
                System.out.print("Masukkan jumlah makanan awal (>=0): ");
                jmlMakanan = sc.nextInt();
            } while (jmlMakanan < 0);

            sc.nextLine();

            listSafari.add(new Safari(namaHewan, jmlPengunjung, jmlZookeeper, jmlMakanan));
        }

        // Memasukkan data untuk setiap hewan
        for (Safari safari : listSafari) {
            System.out.println("\nData " + safari.toString());

            int input;

            // Validasi pengunjung masuk
            do {
                System.out.print("Masukkan jumlah pengunjung yang masuk (>=0): ");
                input = sc.nextInt();
            } while (input < 0);
            safari.pengunjungMasuk(input);

            // Validasi pengunjung keluar
            do {
                System.out.print("Masukkan jumlah pengunjung yang keluar (>=0): ");
                input = sc.nextInt();
            } while (input < 0);
            safari.pengunjungKeluar(input);

            // Validasi zookeeper masuk
            do {
                System.out.print("Masukkan jumlah zookeeper yang masuk (>=0): ");
                input = sc.nextInt();
            } while (input < 0);
            safari.zookeeperMasuk(input);

            // Validasi zookeeper keluar
            do {
                System.out.print("Masukkan jumlah zookeeper yang keluar (>=0): ");
                input = sc.nextInt();
            } while (input < 0);
            safari.zookeeperKeluar(input);
        }

        // Menampilkan hasil setelah input manual
        System.out.println("\n== Data Akhir ==");
        for (Safari safari : listSafari) {
            System.out.println(safari);
        }

        // Mengecek status penutupan taman safari
        System.out.println("\n== Status Taman Safari ==");
        for (Safari safari : listSafari) {
            safari.Tutup();
        }

        sc.close();
    }
}
