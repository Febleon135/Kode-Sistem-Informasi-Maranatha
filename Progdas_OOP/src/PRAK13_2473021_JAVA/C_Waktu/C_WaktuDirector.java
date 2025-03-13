package C_Waktu;

/**
 *
 * @author Febrianus Leona Putra - 2473021
 * @version 17 December 2024
 */
public class C_WaktuDirector {
    public static void main(String[] args) {
        C_Waktu waktu1 = new C_Waktu(5, 55, 55);
        System.out.println("Waktu 1:");
        waktu1.tampilkan_jam();
        System.out.println(waktu1.waktu_to_detik() + " detik");
        C_Waktu waktu2 = new C_Waktu();
        waktu2.detik_to_waktu(4000);
        waktu2.tampilkan_jam();
    }
}
