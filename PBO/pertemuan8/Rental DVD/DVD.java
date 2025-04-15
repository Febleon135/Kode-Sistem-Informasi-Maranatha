
public class DVD extends Item {

    private String sutradara;
    private int durasi;

    public DVD(String kodeCatalog, String judul, String sutradara, int durasi) {
        super(kodeCatalog, judul);
        this.sutradara = sutradara;
        this.durasi = durasi;
    }

    public String getSutradara() {
        return sutradara;
    }

    public int getDurasi() {
        return durasi;
    }
}
