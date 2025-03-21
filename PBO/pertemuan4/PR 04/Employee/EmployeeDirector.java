
/**
 * Pertemuan 4 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 20 Maret 2025
 */
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDirector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        try {
            System.out.print("Masukkan jumlah karyawan: ");
            int jmlEmployee = sc.nextInt();
            sc.nextLine(); // Buang newline setelah angka

            for (int i = 0; i < jmlEmployee; i++) {
                System.out.print("Masukkan mode (1/2): ");
                while (!sc.hasNextInt()) {
                    System.out.println("Error: Mode harus berupa angka.");
                    sc.next(); // Buang input yang salah
                }
                int mode = sc.nextInt();
                sc.nextLine(); // Buang newline

                if (mode != 1 && mode != 2) {
                    System.out.println("Error: Mode tidak valid.");
                    return;
                }

                System.out.print("Masukkan nama: ");
                String nama = sc.nextLine().trim();

                System.out.print("Masukkan umur: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Error: Umur harus berupa angka.");
                    sc.next(); // Buang input yang salah
                }
                int umur = sc.nextInt();

                System.out.print("Masukkan tahun masuk: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Error: Tahun masuk harus berupa angka.");
                    sc.next(); // Buang input yang salah
                }
                int tahunMasuk = sc.nextInt();
                sc.nextLine(); // Buang newline

                if (mode == 1) {
                    employees.add(new DesktopDeveloper(nama, umur, tahunMasuk));
                } else if (mode == 2) {
                    System.out.print("Masukkan proyek: ");
                    String proyek = sc.nextLine().trim();
                    ExperiencedDesktopDeveloper expDev = new ExperiencedDesktopDeveloper(nama, umur, tahunMasuk);
                    expDev.setHandledProject(proyek);
                    employees.add(expDev);
                }
            }

            System.out.println("Data employee:");
            long totalGaji = 0;
            for (Employee emp : employees) {
                System.out.println(emp);
                totalGaji += emp.getGajiBulanan();
            }

            System.out.println("Total gaji bulanan: " + totalGaji);
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
