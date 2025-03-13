package PR13_2473021_JAVA;
/**
 *
 * @author Febrianus Leon
 * @version 22 December 2024
 */
public class C_Hotel {
    private String namaPemesan;
    private int jumlahKamar;
    private int lamaInap;
    private double hargaKamar;
    private double totalBiaya;

    // Constructor
    public C_Hotel(String namaPemesan, int jumlahKamar, int lamaInap, double hargaKamar) {
        this.namaPemesan = namaPemesan;
        this.jumlahKamar = jumlahKamar;
        this.lamaInap = 0;
        this.hargaKamar = 0;
        this.totalBiaya = 0; 
    }

    // Getter dan Setter
    public String getNamaPemesan() {
        return namaPemesan;
    }

    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

    public int getJumlahKamar() {
        return jumlahKamar;
    }

    public void setJumlahKamar(int jumlahKamar) {
        this.jumlahKamar = jumlahKamar;
    }

    public int getLamaInap() {
        return lamaInap;
    }

    public void setLamaInap(int lamaInap) {
        this.lamaInap = lamaInap;
    }

    public double getHargaKamar() {
        return hargaKamar;
    }

    public void setHargaKamar(double hargaKamar) {
        this.hargaKamar = hargaKamar;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public void hitungTotalBiaya() {
        totalBiaya = jumlahKamar * lamaInap * hargaKamar;
    }

    public void tampilkanInfo() {
        System.out.println("Informasi Pemesanan Hotel:");
        System.out.println("Nama Pemesan: " + namaPemesan);
        System.out.println("Jumlah Kamar: " + jumlahKamar);
        System.out.println("Lama Inap: " + lamaInap + " hari");
        System.out.println("Harga Kamar per Malam: " + hargaKamar);
        System.out.println("Total Biaya: " + totalBiaya);
    }

    @Override
    public String toString() {
        return "C_Hotel{" +
                "namaPemesan='" + namaPemesan + '\'' +
                ", jumlahKamar=" + jumlahKamar +
                ", lamaInap=" + lamaInap +
                ", hargaKamar=" + hargaKamar +
                ", totalBiaya=" + totalBiaya +
                '}';
    }
}
