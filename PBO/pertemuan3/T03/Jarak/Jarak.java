
/**
 * Pertemuan 3 [Praktikum]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 07 Maret 2025
 */
public class Jarak {

    private String kendaraan;
    private int waktu;
    private int kecepatan;

    // Constructors
    public Jarak(String kendaraan, int waktu, int kecepatan) {
        this.kendaraan = kendaraan;
        this.waktu = waktu;
        this.kecepatan = kecepatan;
    }

    // Getter dan Setter
    public String getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(String kendaraan) {
        this.kendaraan = kendaraan;
    }

    public int getWaktu() {
        return waktu;
    }

    public void setWaktu(int waktu) {
        this.waktu = waktu;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int hitungJarak() {
        return waktu * kecepatan;
    }

    // toString method
    @Override
    public String toString() {
        return "kendaraan: " + kendaraan + ", waktu: " + waktu + " jam, kecepatan: " + kecepatan + " km/jam, Jarak: " + hitungJarak() + " km";
    }

}
