/**
 * Pertemuan 3 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 13 Maret 2025
 */

public class TabunganLog {
    private double debit;
    private double kredit;
    private double saldo;

    public TabunganLog(double debit, double kredit, double saldo) {
        this.debit = debit;
        this.kredit = kredit;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "TabunganLog{" +
                "debit=" + debit +
                ", kredit=" + kredit +
                ", saldo=" + saldo +
                '}';
    }
}
