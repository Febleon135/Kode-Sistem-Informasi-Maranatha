
import java.util.Scanner;

/**
 * Pertemuan 1 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 25 Februari 2025
 */
public class TongkatKayu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Contoh Input");
        System.out.print("Jumlah kayu besar : ");
        int kayuBesar = sc.nextInt();
        System.out.print("Jumlah kayu kecil : ");
        int kayuKecil = sc.nextInt();
        System.out.print("Panjang tongkat yang ingin dibuat : ");
        int tongkat = sc.nextInt();
        System.out.println("Contoh Output");

        // Menentukan jumlah maksimal kayu besar yang bisa digunakan
        int jumlahMaks = tongkat / 5;
        if (jumlahMaks > kayuBesar) {
            jumlahMaks = kayuBesar;
        }

        // Menghitung sisa panjang yang perlu ditutupi oleh kayu kecil
        int sisaPanjang = tongkat - (jumlahMaks * 5);

        // Mengecek apakah kayu kecil cukup untuk menutupi sisa panjang
        if (sisaPanjang <= kayuKecil) {
            System.out.println("Bisa membuat tongkat");
        } else {
            System.out.println("Tidak bisa membuat tongkat");
        }
        sc.close();
    }
}
