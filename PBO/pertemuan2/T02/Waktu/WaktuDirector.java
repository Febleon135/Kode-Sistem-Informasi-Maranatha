
/**
 * Pertemuan 2 [Tugas]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 04 Maret 2025
 */
public class WaktuDirector {

    public static void main(String[] args) {
        Waktu waktu1 = new Waktu(5, 55, 55);
        waktu1.tampilkan_jam();
        System.out.println(waktu1.waktu_to_detik() + " detik");

        Waktu waktu2 = new Waktu();
        waktu2.detik_to_waktu(4000);
        waktu2.tampilkan_jam();
    }
}
