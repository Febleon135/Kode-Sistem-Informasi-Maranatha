
/**
 * Pertemuan 2 [Tugas]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 04 Maret 2025
 */
public class Buah {

    private String nama;
    private String warna;
    private String rasa;
    private int berat;

    // Constructor
    public Buah(String nama, String warna, String rasa, int berat) {
        this.nama = nama;
        this.warna = warna;
        this.rasa = rasa;
        this.berat = berat;
    }

    // Getter and Setter methods
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    // Hitung Harga
    public int hitungHarga() {
        return 10000 * berat;
    }

    // toString method
    @Override
    public String toString() {
        return "Nama  : " + nama + "\n"
                + "Warna : " + warna + "\n"
                + "Rasa  : " + rasa + "\n"
                + "Berat : " + berat + " kg\n"
                + "Harga : Rp " + hitungHarga() + "\n";
    }

}
