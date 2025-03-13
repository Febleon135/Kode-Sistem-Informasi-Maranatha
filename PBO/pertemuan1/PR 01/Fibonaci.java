
import java.util.Scanner;

/**
 * Pertemuan 1 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 25 Februari 2025
 */
public class Fibonaci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input
        System.out.print("Masukkan batas deret angka: ");
        int n = sc.nextInt();

        // Output
        printFibonacci(n);

        sc.close();
    }

    // Process
    public static void printFibonacci(int n) {
        int pertama = 1, kedua = 1;

        // Menampilkan angka pertama
        System.out.print(pertama + " " + kedua);

        // Hitung dan cetak angka Fibonacci berikutnya
        for (int i = 3; i <= n; i++) {
            int berikutnya = pertama + kedua;
            System.out.print(" " + berikutnya);
            pertama = kedua;
            kedua = berikutnya;
        }
    }
}
