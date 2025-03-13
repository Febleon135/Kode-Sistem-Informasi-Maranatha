package PR13_2473021_JAVA;
/**
 *
 * @author Febrianus Leon
 * @version 22 December 2024
 */
public class B_Maskapai {
    private String maskapai;
    private String jumlahPenumpang;
    private boolean terbang;

    public B_Maskapai(String maskapai, String jumlahPenumpang, boolean terbang) {
        this.maskapai = maskapai;
        this.jumlahPenumpang = jumlahPenumpang;
        this.terbang = terbang;
    }

    public String getMaskapai() {
        return maskapai;
    }

    public void setMaskapai(String maskapai) {
        this.maskapai = maskapai;
    }

    public String getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public void setJumlahPenumpang(String jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public boolean isTerbang() {
        return terbang;
    }

    public void setTerbang(boolean terbang) {
        this.terbang = terbang;
    }

    public void tampilkanInfo() {
        String statusTerbang = terbang ? "Sedang Terbang" : "Tidak Terbang";
        System.out.println("Informasi Pesawat:");
        System.out.println("Maskapai: " + maskapai);
        System.out.println("Jumlah Penumpang: " + jumlahPenumpang);
        System.out.println("Status Terbang: " + statusTerbang);
    }

    public void mulaiTerbang() {
        if (!terbang) {
            System.out.println("Pesawat " + maskapai + " mulai terbang.");
            terbang = true;
        } else {
            System.out.println("Pesawat " + maskapai + " sudah dalam keadaan terbang.");
        }
    }

    public void mendarat() {
        if (terbang) {
            System.out.println("Pesawat " + maskapai + " mulai mendarat.");
            terbang = false;
        } else {
            System.out.println("Pesawat " + maskapai + " sudah dalam keadaan mendarat.");
        }
    }

    @Override
    public String toString() {
        String statusTerbang = terbang ? "Sedang Terbang" : "Tidak Terbang";
        return "Maskapai: " + maskapai + "\n" +
               "Jumlah Penumpang: " + jumlahPenumpang + "\n" +
               "Status Terbang: " + statusTerbang;
    }
}
