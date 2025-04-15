
public class PeminjamanDVD implements Peminjaman {

    private DVD dvd;
    private Member member;
    private String tanggalPinjam;
    private String tanggalKembali;

    public PeminjamanDVD(DVD dvd, Member member, String tanggalPinjam) {
        this.dvd = dvd;
        this.member = member;
        this.tanggalPinjam = tanggalPinjam;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    @Override
    public void peminjaman() {
        System.out.println("\n========== RINCIAN PEMINJAMAN ==========");
        System.out.println("Judul DVD      : " + dvd.getJudul());
        System.out.println("Nama Peminjam  : " + member.getNama());
        System.out.println("Tanggal Pinjam : " + tanggalPinjam);
        System.out.println("----------------------------------------");
        System.out.println("DVD " + dvd.getJudul() + " dipinjam oleh " + member.getNama() + " pada tanggal " + tanggalPinjam);
    }

    @Override
    public void pengembalian() {
        System.out.println("\n========== RINCIAN PENGEMBALIAN ==========");
        System.out.println("Judul DVD      : " + dvd.getJudul());
        System.out.println("Nama Peminjam  : " + member.getNama());
        System.out.println("Tanggal Pengembalian : " + tanggalKembali);
        System.out.println("------------------------------------------");
        System.out.println("DVD " + dvd.getJudul() + " dikembalikan oleh " + member.getNama() + " pada tanggal " + tanggalKembali);
    }
}
