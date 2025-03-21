
/**
 * Pertemuan 4 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 20 Maret 2025
 */
class ExperiencedDesktopDeveloper extends DesktopDeveloper {

    private String handledProject;

    public ExperiencedDesktopDeveloper(String nama, int umur, int tahunMasuk) {
        super(nama, umur, tahunMasuk);
        this.handledProject = "";
    }

    public void setHandledProject(String projectName) {
        this.handledProject = projectName;
    }

    public void removeHandledProject() {
        this.handledProject = "";
    }

    @Override
    public long getTunjangan() {
        if (tahunMasuk < 2016) {
            return 500000;
        } else {
            return 100000;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nproyek yang dikerjakan : " + handledProject;
    }
}
