
import java.util.Scanner;

/**
 * Pertemuan 4 [Praktikum]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 14 Maret 2025
 */
public class Librarian extends Person {

    private int employeeID;
    private String section;

    public Librarian(String nama, String email, String noTelp, int employeeID, String section) {
        super(nama, email, noTelp);
        this.employeeID = employeeID;
        this.section = section;
    }

    @Override
    public String displayRole() {
        return "Hi, I'm " + getNama() + "-" + employeeID + ". A librarian, responsible for the " + section + " section.";
    }

    // Input
    public static Librarian inputLibrarian(Scanner sc) {
        System.out.println("\nMasukkan data Librarian:");
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("No Telepon: ");
        String noTelp = sc.nextLine();
        System.out.print("Employee ID: ");
        int employeeID = Integer.parseInt(sc.nextLine());
        System.out.print("Section: ");
        String section = sc.nextLine();

        return new Librarian(nama, email, noTelp, employeeID, section);

    }
}
