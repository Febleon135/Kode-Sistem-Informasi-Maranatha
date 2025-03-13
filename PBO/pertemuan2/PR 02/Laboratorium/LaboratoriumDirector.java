
/**
 * Pertemuan 2 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 05 Maret 2025
 */
public class LaboratoriumDirector {

    public static void main(String[] args) {
        Laboratorium lab1 = new Laboratorium("PROG 2", 32, 3, 10, 5);
        System.out.println(lab1);

        lab1.asistenMasuk(3);
        System.out.println(lab1);

        lab1.mhsMasuk(15);
        System.out.println(lab1);

        lab1.tutupLab();

        lab1.mhsKeluar(25);
        System.out.println(lab1);

        lab1.asistenKeluar(2);
        System.out.println(lab1);

        lab1.tutupLab();
    }
}
