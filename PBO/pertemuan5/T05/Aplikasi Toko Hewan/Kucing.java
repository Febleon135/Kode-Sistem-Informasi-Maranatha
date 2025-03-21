
/**
 * Pertemuan 5 [Praktikum]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 21 Maret 2025
 */
public abstract class Kucing {

    protected String jenis;

    public Kucing(String jenis) {
        this.jenis = jenis;
    }

    public String cekJenis(Kucing miau) {
        return "Jenis kucing: " + miau.jenis;
    }

    public abstract String bersuara();
}
