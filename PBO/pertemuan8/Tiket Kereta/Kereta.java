
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Date;

public abstract class Kereta {

    int jml_penumpang;
    Date tgl_berangkat;
    String nama;
    String tujuan;
    Kelas kelas;

    public Kereta(int jml_penumpang, Date tgl_berangkat, String nama, String tujuan, Kelas kelas) {
        this.jml_penumpang = jml_penumpang;
        this.tgl_berangkat = tgl_berangkat;
        this.nama = nama;
        this.tujuan = tujuan;
        this.kelas = kelas;
    }

    abstract double getHargaTiket();

    public double hitungHarga() {
        return (getHargaTiket() + kelas.harga) * jml_penumpang;
    }

    public void cetakInvoice() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        DecimalFormat formatter = new DecimalFormat("#,###", symbols);

        System.out.println("\n===== INVOICE =====");
        System.out.println("Berangkat : " + this.getClass().getSimpleName());
        System.out.println("Tujuan : " + tujuan);
        System.out.println("Jenis kursi : " + kelas.jenis);
        System.out.println("Jumlah : " + jml_penumpang);
        System.out.println("Tanggal keberangkatan : " + new java.text.SimpleDateFormat("dd/MM/yyyy").format(tgl_berangkat));
        System.out.println("Nama : " + nama);
        System.out.println("Total : Rp " + formatter.format((int) hitungHarga()));

        System.out.println("Thankyou for your purchase!\n");
    }
}
