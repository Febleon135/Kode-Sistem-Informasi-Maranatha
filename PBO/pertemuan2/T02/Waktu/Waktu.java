
/**
 * Pertemuan 2 [Tugas]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 04 Maret 2025
 */
public class Waktu {

    private int jam;
    private int menit;
    private int detik;

    // Constructor
    public Waktu(int jam, int menit, int detik) {
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    public Waktu() {
        this(0, 0, 0);
    }

    // Format waktu
    public void tampilkan_jam() {
        System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
    }

    // Konversi
    public int waktu_to_detik() {
        return (jam * 3600) + (menit * 60) + detik;
    }

    public void detik_to_waktu(int totalDetik) {
        this.jam = totalDetik / 3600;
        totalDetik %= 3600;
        this.menit = totalDetik / 60;
        this.detik = totalDetik % 60;
    }
}
