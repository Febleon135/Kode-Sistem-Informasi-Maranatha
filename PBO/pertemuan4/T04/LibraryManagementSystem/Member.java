
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Pertemuan 4 [Praktikum]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 14 Maret 2025
 */
public class Member extends Person {

    private int memberID;
    private String registerDate;
    private String expirationDate;

    public Member(String nama, String email, String noTelp, int memberID, String registerDate) {
        super(nama, email, noTelp);
        this.memberID = memberID;
        this.registerDate = registerDate;
        this.expirationDate = hitungExpirationDate(registerDate);
    }

    private String hitungExpirationDate(String registerDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate regDate = LocalDate.parse(registerDate, formatter);
        LocalDate expDate = regDate.plusYears(3);
        return expDate.format(formatter);
    }

    @Override
    public String displayRole() {
        return "Hi, I'm " + getNama() + ". A member, with ID: " + memberID
                + " registered on " + registerDate + ". My member card will expire on: " + expirationDate;
    }

    public void pinjam(String isbn, String tanggalPinjam) {
        System.out.println("\nNama         : " + getNama());
        System.out.println("Member ID    : " + memberID);
        System.out.println("Buku         : " + isbn);
        System.out.println("Tanggal Pinjam : " + tanggalPinjam);
    }

    public static Member inputMember(Scanner sc) {
        System.out.println("\nMasukkan data Member:");
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("No Telepon: ");
        String noTelp = sc.nextLine();
        System.out.print("Member ID: ");
        int memberID = Integer.parseInt(sc.nextLine());
        System.out.print("Register Date (dd MM yyyy): ");
        String registerDate = sc.nextLine();

        return new Member(nama, email, noTelp, memberID, registerDate);
    }
}
