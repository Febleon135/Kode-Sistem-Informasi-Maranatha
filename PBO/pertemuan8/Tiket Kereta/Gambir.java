
import java.util.Date;

public class Gambir extends Kereta {

    public Gambir(int jml_penumpang, Date tgl_berangkat, String nama, String tujuan, Kelas kelas) {
        super(jml_penumpang, tgl_berangkat, nama, tujuan, kelas);
    }

    @Override
    double getHargaTiket() {
        switch (tujuan) {
            case "Bandung":
                return 70000;
            case "Yogyakarta":
                return 90000;
            default:
                return 0;
        }
    }
}
