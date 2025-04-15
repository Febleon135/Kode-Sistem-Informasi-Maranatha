
import java.util.Date;

public class Yogyakarta extends Kereta {

    public Yogyakarta(int jml_penumpang, Date tgl_berangkat, String nama, String tujuan, Kelas kelas) {
        super(jml_penumpang, tgl_berangkat, nama, tujuan, kelas);
    }

    @Override
    double getHargaTiket() {
        switch (tujuan) {
            case "Bandung":
                return 100000;
            case "Gambir":
                return 90000;
            default:
                return 0;
        }
    }
}
