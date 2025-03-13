
/**
 * Pertemuan 3 [Praktikum]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 07 Maret 2025
 */
import java.util.ArrayList;
import java.util.Scanner;

public class JarakDirector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Jarak> daftarJarak = new ArrayList<>();

        System.out.println("Masukkan data 5 Kendaraan:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama Kendaraan ke-" + (i + 1) + ": ");
            String kendaraan = sc.nextLine();

            System.out.print("Masukkan waktu tempuh (jam): ");
            int waktu = sc.nextInt();

            System.out.print("Masukkan kecepatan kendaraan (km/jam): ");
            int kecepatan = sc.nextInt();
            sc.nextLine();

            // Memasukkan data ke list
            daftarJarak.add(new Jarak(kendaraan, waktu, kecepatan));
        }

        // Output
        System.out.println("\nData Kendaraan dan Jarak:");
        for (Jarak j : daftarJarak) {
            System.out.println(j);
        }

        sc.close();
    }
}
