
/**
 * Pertemuan 4 [Praktikum]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 14 Maret 2025
 */
import java.util.Scanner;

public class Director {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membuat objek Librarian dari user input
        Librarian librarian = Librarian.inputLibrarian(sc);

        // Membuat objek Member dari user input
        Member member = Member.inputMember(sc);

        // Menampilkan informasi person
        System.out.println("\n=== Informasi Person ===");
        System.out.println(librarian.displayRole());
        System.out.println(member.displayRole());

        // Memasukkan data peminjaman buku oleh member
        System.out.println("\n=== Peminjaman Buku ===");
        System.out.print("Masukkan ISBN buku: ");
        String isbn = sc.nextLine();
        System.out.print("Masukkan Tanggal Pinjam (dd MM yyyy): ");
        String tanggalPinjam = sc.nextLine();

        // Menampilkan data peminjaman
        member.pinjam(isbn, tanggalPinjam);

        sc.close();
    }
}
