package PR13_2473021_JAVA;
/**
 *
 * @author Febrianus Leon
 * @version 22 December 2024
 */
public class A_EBank {
    private String nama_bank;
    private String no_rek;
    private double total_debet;
    private double total_kredit;
    private double saldo;

    public A_EBank() {
        nama_bank = "";
        no_rek = "";
        total_debet = 0;
        total_kredit = 0;
        saldo = 0;
    }

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

    public void Menabung(double rpDitabung) {
        saldo += rpDitabung;
        total_kredit += rpDitabung;
    }

    public void Mengambil(double rpDiambil) {
        if (rpDiambil <= saldo) {
            saldo -= rpDiambil;
            total_debet += rpDiambil;
        } else {
            System.out.println("Saldo tidak mencukupi!");
        }
    }

    public void tutupRekening() {
        nama_bank = "";
        no_rek = "";
        saldo = 0;
        total_debet = 0;
        total_kredit = 0;
    }

    @Override
    public String toString() {
        return "Bank: " + nama_bank + ", No Rekening: " + no_rek + ", Saldo: " + saldo + 
               ", Total Debet: " + total_debet + ", Total Kredit: " + total_kredit;
    }
}
