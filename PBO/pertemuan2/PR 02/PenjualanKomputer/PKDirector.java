
/**
 * Pertemuan 2 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 05 Maret 2025
 */
import java.util.Scanner;

public class PKDirector {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Jenis Barang yang ada di toko FIT:");
            System.out.println("1. Desktop\n2. Laptop\n3. Notebook\n4. Ultrabook\n5. Tablet\n6. Server");

            System.out.print("\n>> Barang yang ingin dibeli: \n");
            String type = input.nextLine();

            System.out.print(">> Merk yang diinginkan: \n");
            String merk = input.nextLine();

            System.out.print(">> Harga satuan barang: \n");
            int harga = input.nextInt();

            System.out.print(">> Jumlah yang ingin dibeli: \n");
            int jumlah = input.nextInt();

            System.out.print(">> Apakah barang ini jadi dibeli? (Y/N) \n");
            input.nextLine();
            String confirm = input.nextLine();

            if (confirm.equalsIgnoreCase("Y")) {
                PenjualanKomputer pk = new PenjualanKomputer(merk, type, harga, jumlah);
                System.out.println(pk.toString());
                break;
            } else {
                System.out.println("\nPertanyaan akan diulang dari awal.\n");
            }
        }
        input.close();
    }
}
