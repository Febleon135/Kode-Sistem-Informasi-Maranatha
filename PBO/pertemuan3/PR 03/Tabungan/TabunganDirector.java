
/**
 * Pertemuan 3 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 13 Maret 2025
 */
import java.util.Scanner;

public class TabunganDirector {

    private Tabungan[] eBank = new Tabungan[2];
    private Scanner sc = new Scanner(System.in);

    public TabunganDirector() {
        System.out.println("==========E-Bank===========");
        System.out.println(":::::::::::::::::::::::::::::::::");
        System.out.println("::Masukkan data nasabah pertama::");
        eBank[0] = createTabungan();

        System.out.println(":::Masukkan data nasabah kedua:::");
        eBank[1] = createTabungan();

        System.out.println(":::::::::::::::::::::::::::::::::");
        System.out.println(eBank[0]);
        System.out.println(eBank[1]);
        System.out.println(":::::::::::::::::::::::::::::::::");
    }

    private Tabungan createTabungan() {
        System.out.print("Nama Bank: ");
        String bank = sc.nextLine();
        System.out.print("Nomor Rekening: ");
        String rekening = sc.nextLine();
        System.out.print("Nama Pemilik: ");
        String pemilik = sc.nextLine();
        return new Tabungan(bank, rekening, pemilik);
    }

    public void menu() {
        while (true) {
            System.out.println("\n========Menu E-Bank========");
            System.out.println("1. Nasabah Menabung");
            System.out.println("2. Nasabah Mengambil");
            System.out.println("3. Nasabah Transfer");
            System.out.println("4. Nasabah Print Buku Tabungan");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    menabung();
                    break;
                case 2:
                    mengambil();
                    break;
                case 3:
                    transfer();
                    break;
                case 4:
                    printBukuTabungan();
                    break;
                case 5:
                    System.out.println("System E-Bank Offline");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private void menabung() {
        Tabungan tab = cariNasabah();
        if (tab != null) {
            System.out.print("Jumlah Menabung: ");
            double jumlah = sc.nextDouble();
            tab.menabung(jumlah);
        }
    }

    private void mengambil() {
        Tabungan tab = cariNasabah();
        if (tab != null) {
            System.out.print("Jumlah Mengambil: ");
            double jumlah = sc.nextDouble();
            tab.mengambil(jumlah);
        }
    }

    private void transfer() {
        System.out.println("Nasabah Pengirim:");
        Tabungan sumber = cariNasabah();
        if (sumber == null) {
            return;
        }

        System.out.println("Nasabah Penerima:");
        Tabungan tujuan = cariNasabah();
        if (tujuan == null || sumber.equals(tujuan)) {
            System.out.println("Transfer gagal: rekening tujuan tidak valid.");
            return;
        }

        System.out.print("Jumlah Transfer: ");
        double jumlah = sc.nextDouble();
        sumber.transfer(tujuan, jumlah);
    }

    private void printBukuTabungan() {
        Tabungan tab = cariNasabah();
        if (tab != null) {
            tab.printBukuTabungan();
        }
    }

    private Tabungan cariNasabah() {
        System.out.print("Nama Bank: ");
        String bank = sc.nextLine();
        System.out.print("Nomor Rekening: ");
        String rekening = sc.nextLine();
        System.out.print("Nama Pemilik: ");
        String pemilik = sc.nextLine();

        for (Tabungan tab : eBank) {
            if (tab.getNamaBank().equals(bank)
                    && tab.getNoRekening().equals(rekening)
                    && tab.getNamaPemilik().equals(pemilik)) {
                return tab;
            }
        }
        System.out.println("Nasabah tidak ditemukan.");
        return null;
    }

    public static void main(String[] args) {
        TabunganDirector director = new TabunganDirector();
        director.menu();
    }
}
