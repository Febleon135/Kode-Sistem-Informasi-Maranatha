
/**
 * Pertemuan 5 [Praktikum]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 21 Maret 2025
 */
public class Lingkaran extends BangunDatar {

    private float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    @Override
    public float getAtributUtama() {
        return r;
    }

    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }

    @Override
    public float keliling() {
        return (float) (2 * Math.PI * r);
    }
}
