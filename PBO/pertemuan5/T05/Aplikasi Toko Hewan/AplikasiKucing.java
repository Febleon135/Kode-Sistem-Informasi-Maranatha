
/**
 * Pertemuan 5 [Praktikum]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 21 Maret 2025
 */
public class AplikasiKucing {

    public static void main(String[] args) {

        Kucing k1 = new KucingKecil();
        Kucing k2 = new KucingBesar();
        Kucing k3 = new Harimau();

        Kucing[] kucingArray = {k1, k2, k3};

        KucingDijual jualan = new KucingDijual();
        for (Kucing kucing : kucingArray) {
            System.out.println(kucing.cekJenis(kucing));
            System.out.println("Suara: " + kucing.bersuara());
            System.out.println("Umur: " + jualan.cekUmur(kucing) + " tahun");
            System.out.println("Harga: " + jualan.cekHarga(kucing) + " IDR");
            System.out.println("-----------------------");
        }
    }
}
