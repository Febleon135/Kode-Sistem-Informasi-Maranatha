
public class Member {

    private String nama;
    private String nomorAnggota;
    private String alamat;

    public Member(String nama, String nomorAnggota, String alamat) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorAnggota() {
        return nomorAnggota;
    }

    public String getAlamat() {
        return alamat;
    }
}
