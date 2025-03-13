
/**
 * Pertemuan 2 [Tugas]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 04 Maret 2025
 */
public class TabunganDirector {

    public static void main(String[] args) {
        Tabungan tabB = new Tabungan();
        tabB.setNama_bank("ABC");
        tabB.setNo_rek("1123 1234 1235");
        tabB.menabung(15000);
        System.out.println(tabB);

        tabB.mengambil(1000);
        System.out.println(tabB);

        tabB.menabung(50000);
        System.out.println(tabB);

        Tabungan tabC = new Tabungan();
        tabC.setNama_bank("BCD");
        tabC.setNo_rek("321 1234 1234");
        tabC.menabung(5000);
        System.out.println(tabC);

        tabB.tutupRekening();
        System.out.println(tabB);
    }
}
