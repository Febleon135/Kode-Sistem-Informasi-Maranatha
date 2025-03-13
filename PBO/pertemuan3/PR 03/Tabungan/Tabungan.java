
/**
 * Pertemuan 3 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 13 Maret 2025
 */
import java.util.ArrayList;
import java.util.List;

public class Tabungan {

    private String namaBank;
    private String noRekening;
    private String namaPemilik;
    private double saldo;
    private List<TabunganLog> logTransaksi;

    public Tabungan(String namaBank, String noRekening, String namaPemilik) {
        this.namaBank = namaBank;
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = 0;
        this.logTransaksi = new ArrayList<>();
    }

    public void menabung(double jumlah) {
        saldo += jumlah;
        logTransaksi.add(new TabunganLog(0, jumlah, saldo));
    }

    public void mengambil(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            logTransaksi.add(new TabunganLog(jumlah, 0, saldo));
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }

    public void transfer(Tabungan tujuan, double jumlah) {
        if (saldo >= jumlah) {
            this.mengambil(jumlah);
            tujuan.menabung(jumlah);
        } else {
            System.out.println("Saldo tidak cukup untuk transfer.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Tabungan tab) {
            return this.namaBank.equals(tab.namaBank)
                    && this.noRekening.equals(tab.noRekening)
                    && this.namaPemilik.equals(tab.namaPemilik);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tabungan{"
                + "namaBank='" + namaBank + '\''
                + ", noRekening='" + noRekening + '\''
                + ", namaPemilik='" + namaPemilik + '\''
                + ", saldo=" + saldo
                + '}';
    }

    public void printBukuTabungan() {
        System.out.println(this);
        for (TabunganLog log : logTransaksi) {
            System.out.println(log);
        }
    }

    public String getNamaBank() {
        return namaBank;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }
}
