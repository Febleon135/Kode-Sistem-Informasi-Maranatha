
/**
 * Pertemuan 4 [Praktikum]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 14 Maret 2025
 */
public abstract class Person {

    private String nama;
    private String email;
    private String noTelp;

    public Person(String nama, String email, String noTelp) {
        this.nama = nama;
        this.email = email;
        this.noTelp = noTelp;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNoTelp() {
        return noTelp;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public abstract String displayRole();
}
