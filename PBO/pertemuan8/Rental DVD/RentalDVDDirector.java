
import java.util.Scanner;

public class RentalDVDDirector {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("     Selamat datang di RentalDVD     ");
        System.out.println("=====================================");
        System.out.println("Hari ini kamu mau melakukan apa nih?");
        System.out.println("1. Pinjam DVD");
        System.out.println("2. Kembalikan DVD");
        System.out.print("Pilihan kamu (1/2): ");
        int pilihan = input.nextInt();
        input.nextLine(); // clear buffer

        if (pilihan == 1) {
            System.out.println("\nOke, kita proses peminjamannya ya!");
            System.out.println("-----------------------------------");
            System.out.print("Kode Catalog      : ");
            String kode = input.nextLine();
            System.out.print("Judul DVD         : ");
            String judul = input.nextLine();
            System.out.print("Sutradara         : ");
            String sutradara = input.nextLine();
            System.out.print("Durasi (angka)    : ");
            int durasi = input.nextInt();
            input.nextLine();

            System.out.println("\nSekarang isi info kamu ya!");
            System.out.print("Nama              : ");
            String nama = input.nextLine();
            System.out.print("Nomor Anggota     : ");
            String nomor = input.nextLine();
            System.out.print("Alamat            : ");
            String alamat = input.nextLine();

            System.out.print("\nTanggal Peminjaman (dd/mm/yyyy): ");
            String tglPinjam = input.nextLine();

            DVD dvd = new DVD(kode, judul, sutradara, durasi);
            Member member = new Member(nama, nomor, alamat);
            PeminjamanDVD transaksi = new PeminjamanDVD(dvd, member, tglPinjam);
            transaksi.peminjaman();

        } else if (pilihan == 2) {
            System.out.println("\nBaik, kita proses pengembaliannya ya!");
            System.out.println("-------------------------------------");
            System.out.print("Kode Catalog      : ");
            String kode = input.nextLine();
            System.out.print("Judul DVD         : ");
            String judul = input.nextLine();

            System.out.println("\nMasukkan info pengembali:");
            System.out.print("Nama              : ");
            String nama = input.nextLine();
            System.out.print("Nomor Anggota     : ");
            String nomor = input.nextLine();
            System.out.print("Alamat            : ");
            String alamat = input.nextLine();

            System.out.print("\nTanggal Pengembalian (dd/mm/yyyy): ");
            String tglKembali = input.nextLine();

            DVD dvd = new DVD(kode, judul, "", 0); // data tidak lengkap karena hanya pengembalian
            Member member = new Member(nama, nomor, alamat);
            PeminjamanDVD transaksi = new PeminjamanDVD(dvd, member, tglKembali);
            transaksi.setTanggalKembali(tglKembali);
            transaksi.pengembalian();
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
