
/**
 * Pertemuan 5 [Praktikum]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 21 Maret 2025
 */
public abstract class BangunDatar {

    public abstract float getAtributUtama();

    public float luas() {
        if (this instanceof Persegi) {
            float sisi = getAtributUtama();
            return sisi * sisi;
        } else if (this instanceof Lingkaran) {
            float r = getAtributUtama();
            return (float) (Math.PI * r * r);
        } else if (this instanceof PersegiPanjang) {
            PersegiPanjang p = (PersegiPanjang) this;
            return p.getPanjang() * p.getLebar();
        } else if (this instanceof Segitiga) {
            Segitiga s = (Segitiga) this;
            return 0.5f * s.getAlas() * s.getTinggi();
        }
        return 0;
    }

    public float keliling() {
        if (this instanceof Persegi) {
            float sisi = getAtributUtama();
            return 4 * sisi;
        } else if (this instanceof Lingkaran) {
            float r = getAtributUtama();
            return (float) (2 * Math.PI * r);
        } else if (this instanceof PersegiPanjang) {
            PersegiPanjang p = (PersegiPanjang) this;
            return 2 * (p.getPanjang() + p.getLebar());
        } else if (this instanceof Segitiga) {
            Segitiga s = (Segitiga) this;
            float sisiMiring = (float) Math.sqrt((s.getAlas() / 2) * (s.getAlas() / 2) + s.getTinggi() * s.getTinggi());
            return s.getAlas() + 2 * sisiMiring;
        }
        return 0;
    }
}
