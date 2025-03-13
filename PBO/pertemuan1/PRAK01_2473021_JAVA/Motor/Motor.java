
/**
 * Pertemuan 1
 * [PRAKTIKUM]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 21 Februari 2025
 */
public class Motor {

    private String merk;
    private String tipe;
    private int gigi_sekarang;
    private int kecepatan;

    // Constructor tanpa parameter
    public Motor() {
        merk = "";
        tipe = "";
        gigi_sekarang = 0;
        kecepatan = 0;
    }

    // Setter dan Getter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setGigiSekarang(int gigi_sekarang) {
        this.gigi_sekarang = gigi_sekarang;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    // Method
    public void naikkanGigi() {
        gigi_sekarang += 1;
    }

    public void turunkanGigi() {
        gigi_sekarang -= 1;
    }

    public void tambahKecepatan() {
        kecepatan += 1;
    }

    public void rem() {
        kecepatan -= 1;
    }

    // Method Override
    @Override
    public String toString() {
        return "Motor [Merk=" + merk + ", Tipe=" + tipe + ", Gigi Sekarang=" + gigi_sekarang + ", Kecepatan=" + kecepatan + "]";
    }
}
