
/**
 * Pertemuan 5 [Praktikum]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 21 Maret 2025
 */
public class KucingDijual {

    public int cekUmur(Kucing miau) {
        return 3;
    }

    public int cekHarga(Kucing miau) {
        if (miau instanceof KucingKecil) {
            return 20000;
        } else if (miau instanceof KucingBesar) {
            return 50000;
        } else if (miau instanceof Harimau) {
            return 90000;
        }
        return 15000;
    }
}
