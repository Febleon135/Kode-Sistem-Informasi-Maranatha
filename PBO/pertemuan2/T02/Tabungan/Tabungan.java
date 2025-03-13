
/**
 * Pertemuan 2 [Tugas]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 04 Maret 2025
 */
public class Tabungan {

    private String nama_bank;
    private String no_rek;
    private double total_debet;
    private double total_kredit;
    private double saldo;

    // Constructor
    public Tabungan() {
        this.nama_bank = "";
        this.no_rek = "";
        this.total_debet = 0;
        this.total_kredit = 0;
        this.saldo = 0;
    }

    // Getters and Setters
    public String getNama_bank() {
        return nama_bank;
    }

    public void setNama_bank(String nama_bank) {
        this.nama_bank = nama_bank;
    }

    public String getNo_rek() {
        return no_rek;
    }

    public void setNo_rek(String no_rek) {
        this.no_rek = no_rek;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTotal_debet() {
        return total_debet;
    }

    public double getTotal_kredit() {
        return total_kredit;
    }

    // Methods
    public void menabung(int rpDitabung) {
        this.saldo += rpDitabung;
        this.total_kredit += rpDitabung;
    }

    public void mengambil(int rpDiambil) {
        if (rpDiambil <= this.saldo) {
            this.saldo -= rpDiambil;
            this.total_debet += rpDiambil;
        } else {
            System.out.println("Saldo tidak cukup untuk melakukan penarikan!");
        }
    }

    public void tutupRekening() {
        this.nama_bank = "";
        this.no_rek = "";
        this.total_debet = 0;
        this.total_kredit = 0;
        this.saldo = 0;
    }

    @Override
    public String toString() {
        return "Nama Bank   : " + nama_bank + "\n"
                + "No Rekening : " + no_rek + "\n"
                + "Total Debet : " + total_debet + "\n"
                + "Total Kredit: " + total_kredit + "\n"
                + "Saldo       : " + saldo + "\n";
    }

}
