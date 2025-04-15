
import java.util.*;

public class TiketKeretaDirector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> stasiun = Arrays.asList("Bandung", "Gambir", "Yogyakarta");
        List<Kelas> daftarKelas = Arrays.asList(
                new Kelas("Kelas Ekonomi", 30000),
                new Kelas("Kelas Bisnis", 50000),
                new Kelas("Kelas Eksekutif", 75000),
                new Kelas("Kelas Luxury", 100000)
        );

        System.out.println("Welcome to KAI");
        System.out.print("Pilih stasiun keberangkatan : \n");
        for (int i = 0; i < stasiun.size(); i++) {
            System.out.println((i + 1) + ". " + stasiun.get(i));
        }
        System.out.print("Pilih stasiun : ");
        int asal = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < stasiun.size(); i++) {
            if (i != asal - 1) {
                System.out.println((i + 1) + ". " + stasiun.get(i));
            }
        }
        System.out.print("Pilih stasiun tujuan : ");
        int tujuan = sc.nextInt();
        sc.nextLine();

        System.out.println("Jenis kursi :");
        for (int i = 0; i < daftarKelas.size(); i++) {
            System.out.println((i + 1) + ". " + daftarKelas.get(i).jenis);
        }
        System.out.print("Pilih jenis kursi : ");
        int jenis = sc.nextInt();
        sc.nextLine();

        System.out.println("\nMasukkan informasi penumpang");
        System.out.print("Masukkan jumlah penumpang : ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan tanggal keberangkatan (dd/MM/yyyy) : ");
        String tglInput = sc.nextLine();
        Date tanggal = null;
        try {
            tanggal = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(tglInput);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.print("Nama : ");
        String nama = sc.nextLine();

        Kereta kereta = null;
        String stTujuan = stasiun.get(tujuan - 1);

        switch (asal) {
            case 1:
                kereta = new Bandung(jumlah, tanggal, nama, stTujuan, daftarKelas.get(jenis - 1));
                break;
            case 2:
                kereta = new Gambir(jumlah, tanggal, nama, stTujuan, daftarKelas.get(jenis - 1));
                break;
            case 3:
                kereta = new Yogyakarta(jumlah, tanggal, nama, stTujuan, daftarKelas.get(jenis - 1));
                break;
        }

        if (kereta != null) {
            kereta.cetakInvoice();
        }
    }
}
