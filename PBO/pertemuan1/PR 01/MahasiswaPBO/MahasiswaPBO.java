
/**
 * Pertemuan 1 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 25 Februari 2025
 */
public class MahasiswaPBO {

    private String nrp;
    private String nama;
    private float uts;
    private float uas;
    private float kat;
    private float nilai_akhir;
    private String nilai_mutu;

    // Constructor
    public MahasiswaPBO() {
    }

    // Setters
    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUts(float uts) {
        this.uts = uts;
        hitungNilaiAkhir();
    }

    public void setUas(float uas) {
        this.uas = uas;
        hitungNilaiAkhir();
    }

    public void setKat(float kat) {
        this.kat = kat;
        hitungNilaiAkhir();
    }

    // Calculate final grade and assign letter grade
    private void hitungNilaiAkhir() {
        this.nilai_akhir = (0.3f * uts) + (0.3f * uas) + (0.4f * kat);
        this.nilai_mutu = determineLetterGrade(this.nilai_akhir);
    }

    private String determineLetterGrade(float naa) {
        if (naa >= 80) {
            return "A";
        } else if (naa >= 73) {
            return "B'";
        } else if (naa >= 67) {
            return "B";
        } else if (naa >= 61) {
            return "C'";
        } else if (naa >= 55) {
            return "C";
        } else if (naa >= 41) {
            return "D";
        } else {
            return "E";
        }
    }

    // toString method
    @Override
    public String toString() {
        return "NRP: " + nrp + "\n"
                + "Nama: " + nama + "\n"
                + "UTS: " + uts + "\n"
                + "UAS: " + uas + "\n"
                + "KAT: " + kat + "\n"
                + "Nilai Akhir: " + nilai_akhir + "\n"
                + "Nilai Mutu: " + nilai_mutu;
    }
}
