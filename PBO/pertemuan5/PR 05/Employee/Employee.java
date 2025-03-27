
/**
 * Pertemuan 5 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 27 Maret 2025
 */
public abstract class Employee {

    private String nama;
    private int umur;
    private long gajiPokok;
    private int tahunMasuk;

    public Employee(String nama, int umur, long gajiPokok, int tahunMasuk) {
        this.nama = nama;
        this.umur = umur;
        this.gajiPokok = gajiPokok;
        this.tahunMasuk = tahunMasuk;
    }

    public Employee(String nama, int umur, int tahunMasuk) {
        this(nama, umur, 2000000, tahunMasuk); // Gaji pokok default 2.000.000
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    // **Tambahkan getter untuk gajiPokok**
    public long getGajiPokok() {
        return gajiPokok;
    }

    public abstract long getTunjangan();

    public long getGajiBulanan() {
        return getGajiPokok() + getTunjangan();
    }
}
