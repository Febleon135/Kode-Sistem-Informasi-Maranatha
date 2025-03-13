package C_Waktu;

/**
 *
 * @author Febrianus Leona Putra - 2473021
 * @version 17 December 2024
 */
public class C_Waktu {
    private int jam;
    private int menit;
    private int detik;
    
    public C_Waktu(){
        jam = 0;
        menit = 0;
        detik = 0;
    }
    
    public C_Waktu(int jam, int menit, int detik){
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }
    
    public void setJam(int jam) {
        this.jam = jam;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public void setDetik(int detik) {
        this.detik = detik;
    }
    
    public int getJam() {
        return jam;
    }

    public int getMenit() {
        return menit;
    }

    public int getDetik() {
        return detik;
    }
    
    public void tampilkan_jam() {
        System.out.printf("%02d:%02d:%02d\n", jam, menit, detik);
    }
    
    public int waktu_to_detik() {
        return (jam * 3600) + (menit * 60) + detik;
    }
    
    public void detik_to_waktu(int totalDetik) {
        jam = totalDetik / 3600;
        totalDetik %= 3600;
        menit = totalDetik / 60;
        detik = totalDetik % 60;
    }
    
}
