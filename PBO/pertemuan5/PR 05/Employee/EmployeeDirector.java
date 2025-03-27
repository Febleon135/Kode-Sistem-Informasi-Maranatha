
/**
 * Pertemuan 5 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 27 Maret 2025
 */
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDirector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Masukkan jumlah employee: ");
        int jmlEmployee = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jmlEmployee; i++) {
            System.out.print("Masukkan nama, umur, tahun masuk: ");
            String nama = sc.next();
            int umur = sc.nextInt();
            int tahunMasuk = sc.nextInt();

            employees.add(new DesktopDeveloper(nama, umur, tahunMasuk));
        }

        System.out.println("\nData Employee:");
        long totalGajiBulanan = 0;

        for (Employee emp : employees) {
            System.out.println(emp.toString());
            totalGajiBulanan += emp.getGajiBulanan();
        }

        System.out.println("Total gaji bulanan: " + totalGajiBulanan);

        sc.close();
    }
}
