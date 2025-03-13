package PR13_2473021_JAVA;
/**
 *
 * @author Febrianus Leon
 * @version 22 December 2024
 */
import java.util.Scanner;

public class C_HotelDirector {
    public static void main(String[] args) {
        String namaPemesan = "Andi";
        int jumlahKamar = 3;

        C_Hotel hotel = new C_Hotel(namaPemesan, jumlahKamar, 0, 0);

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan lama inap (hari): ");
        int lamaInap = sc.nextInt();

        System.out.print("Masukkan harga kamar per malam: ");
        double hargaKamar = sc.nextDouble();

        hotel.setLamaInap(lamaInap);
        hotel.setHargaKamar(hargaKamar);
        hotel.hitungTotalBiaya();
        hotel.tampilkanInfo();

        sc.close();
    }
}
