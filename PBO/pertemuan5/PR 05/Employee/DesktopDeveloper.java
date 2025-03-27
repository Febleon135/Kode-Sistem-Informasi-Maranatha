
/**
 * Pertemuan 5 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 27 Maret 2025
 */
public class DesktopDeveloper extends Employee implements JavaProgrammer {

    public DesktopDeveloper(String nama, int umur, int tahunMasuk) {
        super(nama, umur, 3000000, tahunMasuk); // Gaji pokok 3.000.000
    }

    @Override
    public void tulisKodeProgramJava() {
        System.out.println("Desktop developer sedang menulis kode program Java.");
    }

    @Override
    public void tulisKodeProgram() {
        System.out.println("Desktop developer sedang menulis kode program.");
    }

    @Override
    public long getTunjangan() {
        int tahunSekarang = 2024;
        int tahunKerja = tahunSekarang - getTahunMasuk();
        return tahunKerja * 100000;
    }

    @Override
    public long getGajiBulanan() {
        return getGajiPokok() + getTunjangan();
    }

    @Override
    public String toString() {
        return "seorang desktop developer bernama " + getNama() + " dengan umur " + getUmur()
                + " yang mulai bekerja dari " + getTahunMasuk() + " dan memiliki gaji bulanan Rp. " + getGajiBulanan() + ".";
    }
}
