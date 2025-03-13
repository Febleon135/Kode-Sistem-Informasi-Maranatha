
/**
 * Pertemuan 3 [Praktikum]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 07 Maret 2025
 */
public class Safari {

    private String NamaHewan;
    private int jmlPengunjung;
    private int jmlZookeeper;
    private int jmlMakanan;

    // Constructor untuk menerima 4 parameter
    public Safari(String NamaHewan, int jmlPengunjung, int jmlZookeeper, int jmlMakanan) {
        this.NamaHewan = NamaHewan;
        this.jmlPengunjung = jmlPengunjung;
        this.jmlZookeeper = jmlZookeeper;
        this.jmlMakanan = jmlMakanan;
    }

    // Method pengunjung masuk
    public void pengunjungMasuk(int jumlah) {
        if (jumlah >= 0) {
            jmlPengunjung += jumlah;
        }
    }

    // Method pengunjung keluar
    public void pengunjungKeluar(int jumlah) {
        if (jumlah >= 0) {
            jmlPengunjung = Math.max(0, jmlPengunjung - jumlah);
        }
    }

    // Method zookeeper masuk
    public void zookeeperMasuk(int jumlah) {
        if (jumlah >= 0) {
            jmlZookeeper += jumlah;
        }
    }

    // Method zookeeper keluar
    public void zookeeperKeluar(int jumlah) {
        if (jumlah >= 0) {
            jmlZookeeper = Math.max(0, jmlZookeeper - jumlah);
        }
    }

    // Method tutup
    public void Tutup() {
        if (jmlPengunjung == 0 && jmlZookeeper == 0) {
            System.out.println("Taman Safari telah ditutup");
        } else {
            System.out.println("Taman Safari tidak boleh ditutup");
        }
    }

    // Method toString untuk menampilkan data
    @Override
    public String toString() {
        return "Hewan: " + NamaHewan
                + ", Pengunjung: " + jmlPengunjung
                + ", Zookeeper: " + jmlZookeeper
                + ", Makanan: " + jmlMakanan;
    }
}
