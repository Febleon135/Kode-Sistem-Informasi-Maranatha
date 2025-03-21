
/**
 * Pertemuan 4 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 20 Maret 2025
 */
class DesktopDeveloper extends Employee {

    public DesktopDeveloper(String nama, int umur, int tahunMasuk) {
        super(nama, umur, 3000000, tahunMasuk);
    }

    public void tulisKodeProgram(String bahasa) {
        System.out.println("Desktop developer sedang menulis kode program " + bahasa);
    }

    @Override
    public long getTunjangan() {
        return 100000;
    }

    @Override
    public String toString() {
        return "seorang desktop developer bernama " + nama + " dengan umur " + umur
                + " yang mulai bekerja dari " + tahunMasuk + " dan memiliki gaji bulanan Rp. " + getGajiBulanan();
    }
}
