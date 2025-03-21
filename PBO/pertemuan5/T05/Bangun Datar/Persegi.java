
/**
 * Pertemuan 5 [Praktikum]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 21 Maret 2025
 */
public class Persegi extends BangunDatar {

    private float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public float getAtributUtama() {
        return sisi;
    }

    @Override
    public float luas() {
        return sisi * sisi;
    }

    @Override
    public float keliling() {
        return 4 * sisi;
    }
}
