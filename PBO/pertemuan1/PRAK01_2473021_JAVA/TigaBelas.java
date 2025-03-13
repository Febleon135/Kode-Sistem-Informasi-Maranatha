/**
 * Pertemuan 1 [PRAKTIKUM]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 21 Februari 2025
 */
package PBO.pertemuan1.PRAK01_2473021_JAVA;

import java.util.Scanner;

public class TigaBelas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Contoh Input");
        System.out.print("Masukkan Nilai-A : ");
        int A = sc.nextInt();
        System.out.print("Masukkan Nilai-B : ");
        int B = sc.nextInt();
        System.out.print("Masukkan Nilai-C : ");
        int C = sc.nextInt();

        // Process
        int total;
        if (A == 13) {
            total = 0;
        } else if (B == 13) {
            total = A;
        } else if (C == 13) {
            total = A + B;
        } else {
            total = A + B + C;
        }

        // Output
        System.out.println("Contoh Output");
        System.out.println("Total = " + total);

        sc.close();
    }
}
