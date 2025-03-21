
/**
 * Pertemuan 5 [Praktikum]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 21 Maret 2025
 */
public class Segitiga extends BangunDatar {

    private float alas, tinggi, sisiMiring;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = (float) Math.sqrt((alas / 2) * (alas / 2) + tinggi * tinggi); // Hipotenusa segitiga sama kaki
    }

    public float getAlas() {
        return alas;
    }

    public float getTinggi() {
        return tinggi;
    }

    @Override
    public float getAtributUtama() {
        return alas;
    }

    @Override
    public float luas() {
        return 0.5f * alas * tinggi;
    }

    @Override
    public float keliling() {
        return alas + 2 * sisiMiring;
    }
}
