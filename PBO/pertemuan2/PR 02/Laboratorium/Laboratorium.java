
/**
 * Pertemuan 2 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 05 Maret 2025
 */
public class Laboratorium {

    private String nama_lab;
    private int jml_pc;
    private int jml_printer;
    private int jml_mhs;
    private int jml_asisten;

    // Constructor
    public Laboratorium(String nama_lab, int jml_pc, int jml_printer, int jml_mhs, int jml_asisten) {
        this.nama_lab = nama_lab;
        this.jml_pc = jml_pc;
        this.jml_printer = jml_printer;
        this.jml_mhs = jml_mhs;
        this.jml_asisten = jml_asisten;
    }

    // Getter and Setter methods
    public String getNama_lab() {
        return nama_lab;
    }

    public void setNama_lab(String nama_lab) {
        this.nama_lab = nama_lab;
    }

    public int getJml_pc() {
        return jml_pc;
    }

    public void setJml_pc(int jml_pc) {
        this.jml_pc = jml_pc;
    }

    public int getJml_printer() {
        return jml_printer;
    }

    public void setJml_printer(int jml_printer) {
        this.jml_printer = jml_printer;
    }

    public int getJml_mhs() {
        return jml_mhs;
    }

    public void setJml_mhs(int jml_mhs) {
        this.jml_mhs = jml_mhs;
    }

    public int getJml_asisten() {
        return jml_asisten;
    }

    public void setJml_asisten(int jml_asisten) {
        this.jml_asisten = jml_asisten;
    }

    // Methods
    public void mhsMasuk(int jml_mhs) {
        this.jml_mhs += jml_mhs;
    }

    public void mhsKeluar(int jml_mhs) {
        this.jml_mhs -= jml_mhs;
        if (this.jml_mhs < 0) {
            this.jml_mhs = 0;
        }
    }

    public void asistenMasuk(int jml_asisten) {
        this.jml_asisten += jml_asisten;
    }

    public void asistenKeluar(int jml_asisten) {
        this.jml_asisten -= jml_asisten;
        if (this.jml_asisten < 0) {
            this.jml_asisten = 0;
        }
    }

    public void tutupLab() {
        if (jml_mhs == 0 && jml_asisten == 0) {
            System.out.println("Laboratorium " + nama_lab + " telah ditutup");
        } else {
            System.out.println("Laboratorium " + nama_lab + " tidak boleh ditutup");
        }
    }

    @Override
    public String toString() {
        return "Laboratorium " + nama_lab + " [PCs: " + jml_pc + ", Printers: " + jml_printer
                + ", Students: " + jml_mhs + ", Assistants: " + jml_asisten + "]";
    }
}
