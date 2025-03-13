
/**
 * Pertemuan 3 [Praktikum]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 07 Maret 2025
 */
import java.util.ArrayList;
import java.util.Scanner;

public class HotelDirector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Hotel> daftarPemesanan = new ArrayList<>();

        System.out.println("Masukkan data pemesanan hotel (maksimal 10):");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nPemesanan ke-" + (i + 1));
            System.out.print("Nama Pemesan: ");
            String Pemesan = sc.nextLine();
            System.out.print("Jenis Kamar (Single Bed / Twin Bed / Suite / Deluxe): ");
            String jenisKamar = sc.nextLine();
            System.out.print("Jumlah Kamar: ");
            int JmlKamar = sc.nextInt();
            System.out.print("Lama Inap (malam): ");
            int lamaInap = sc.nextInt();
            sc.nextLine();

            // Membuat objek hotel dan menambahkannya ke dalam list
            Hotel hotel = new Hotel(Pemesan, JmlKamar, lamaInap, jenisKamar);
            daftarPemesanan.add(hotel);
        }

        System.out.println("\n===== DATA PEMESANAN HOTEL =====");
        for (Hotel h : daftarPemesanan) {
            h.tampilkanInfo();
        }

        sc.close();
    }
}
