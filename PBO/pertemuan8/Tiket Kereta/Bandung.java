
import java.util.Date;

public class Bandung extends Kereta {

    public Bandung(int jml_penumpang, Date tgl_berangkat, String nama, String tujuan, Kelas kelas) {
        super(jml_penumpang, tgl_berangkat, nama, tujuan, kelas);
    }

    @Override
    double getHargaTiket() {
        switch (tujuan) {
            case "Gambir":
                return 70000;
            case "Yogyakarta":
                return 100000;
            default:
                return 0;
        }
    }
}
