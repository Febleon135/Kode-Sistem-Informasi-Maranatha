package A_MahasiswaPBO;

/**
 *
 * @author Febrianus Leona Putra - 2473021
 * @version 17 December 2024
 */
public class A_MahasiswaPBODirector {
    public A_MahasiswaPBODirector() {
        A_MahasiswaPBO newMahasiswaPBO = new A_MahasiswaPBO();
        newMahasiswaPBO.setNrp("217397");
        newMahasiswaPBO.setNama("Martin Juan");
        newMahasiswaPBO.setUts(60f);
        newMahasiswaPBO.setUas(77f);
        newMahasiswaPBO.setKat(65f);
        System.out.println(newMahasiswaPBO.toString());
    }

    public static void main(String[] args) {
        new A_MahasiswaPBODirector();
    }
}
