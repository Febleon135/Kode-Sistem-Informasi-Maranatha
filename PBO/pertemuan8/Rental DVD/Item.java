
public abstract class Item {

    protected String kodeCatalog;
    protected String judul;

    public Item(String kodeCatalog, String judul) {
        this.kodeCatalog = kodeCatalog;
        this.judul = judul;
    }

    public String getKodeCatalog() {
        return kodeCatalog;
    }

    public String getJudul() {
        return judul;
    }
}
