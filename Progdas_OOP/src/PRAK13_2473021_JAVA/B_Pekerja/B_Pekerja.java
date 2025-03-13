package B_Pekerja;

/**
 *
 * @author Febrianus Leona Putra - 2473021
 * @version 17 December 2024
 */
public class B_Pekerja {
    private String nama;
    private String posisi;
    private double gaji;
    
    public B_Pekerja(){
        nama = "";
        posisi = "";
        gaji = 0;
    }
    
    public B_Pekerja(String nama, String posisi, double gaji) {
        this.nama = nama;
        this.posisi = posisi;
        this.gaji = gaji;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    public String getNama() {
        return nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public double getGaji() {
        return gaji;
    }
    
    public void tampilkanInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Posisi: " + posisi);
        System.out.println("Gaji: " + gaji);
    }
    
    public double naikkanGaji(double persentase) {
        gaji += gaji * (persentase / 100);
        return gaji;
    }
}

