
/**
 * Pertemuan 3 [Praktikum]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 07 Maret 2025
 */
public class Hotel {

    private String Pemesan;
    private int JmlKamar;
    private int lamaInap;
    private int harga;
    private int totalBiaya;
    private String JenisKamar;

    // Constructors
    public Hotel(String Pemesan, int JmlKamar, int lamaInap, String JenisKamar) {
        this.Pemesan = Pemesan;
        this.JmlKamar = JmlKamar;
        this.lamaInap = lamaInap;
        this.JenisKamar = JenisKamar;
        setHarga();
        hitungBiaya();
    }

    // Menentukan harga berdasarkan jenis kamar
    private void setHarga() {
        switch (JenisKamar.toLowerCase()) {
            case "single bed":
                this.harga = 500000;
                break;
            case "twin bed":
                this.harga = 1200000;
                break;
            case "suite":
                this.harga = 3800000;
                break;
            case "deluxe":
                this.harga = 5000000;
                break;
            default:
                this.harga = 0;
                System.out.println("Jenis Kamar Tidak Valid");
        }
    }

    private void hitungBiaya() {
        this.totalBiaya = JmlKamar * lamaInap * harga;
    }

    public void tampilkanInfo() {
        System.out.println("Pemesan: " + Pemesan);
        System.out.println("Jenis Kamar: " + JenisKamar);
        System.out.println("Jumlah Kamar: " + JmlKamar);
        System.out.println("Lama Inap: " + lamaInap + " malam");
        System.out.println("Harga per malam: Rp " + harga);
        System.out.println("Total Biaya: Rp " + totalBiaya);
        System.out.println("---------------------------");
    }
}
