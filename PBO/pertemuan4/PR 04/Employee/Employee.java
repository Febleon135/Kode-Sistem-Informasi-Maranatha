
/**
 * Pertemuan 4 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 20 Maret 2025
 */
abstract class Employee {

    protected String nama;
    protected int umur;
    protected int tahunMasuk;
    protected long gajiPokok;

    public Employee(String nama, int umur, int tahunMasuk) {
        this.nama = nama;
        this.umur = umur;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = 2000000;
    }

    public Employee(String nama, int umur, long gajiPokok, int tahunMasuk) {
        this.nama = nama;
        this.umur = umur;
        this.gajiPokok = gajiPokok;
        this.tahunMasuk = tahunMasuk;
    }

    public long getGajiBulanan() {
        return gajiPokok + getTunjangan();
    }

    public abstract long getTunjangan();

    @Override
    public abstract String toString();
}
