
/**
 * Pertemuan 2 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 05 Maret 2025
 */
public class PenjualanKomputer {

    private String merk;
    private String type;
    private int harga;
    private int jumlah;
    private int totalHarga;

    // Constructor
    public PenjualanKomputer(String merk, String type, int harga, int jumlah) {
        this.merk = merk;
        this.type = type;
        this.harga = harga;
        this.jumlah = jumlah;
        setTotal(jumlah, harga);
    }

    // Setter dan Getter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setTotal(int jumlah, int harga) {
        this.totalHarga = jumlah * harga;
    }

    public int getTotal() {
        return totalHarga;
    }

    @Override
    public String toString() {
        return "Barang yang dibeli:\n"
                + "==========================================\n"
                + "Barang: " + type + "\n"
                + "Merk: " + merk + "\n"
                + "Harga: " + harga + "\n"
                + "Jumlah: " + jumlah + "\n"
                + "==========================================\n"
                + "Total Belanjaan: " + totalHarga + "\n"
                + "Terbilang: " + Terbilang.generate(totalHarga) + " rupiah";
    }

    public static class Terbilang {

        public static String generate(int number) {
            return convertToWords(number);
        }

        private static String convertToWords(int number) {
            if (number == 0) {
                return "nol";
            }

            String[] units = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
            String result = "";

            if (number < 12) {
                result = units[number];
            } else if (number < 20) {
                result = units[number - 10] + " belas";
            } else if (number < 100) {
                result = units[number / 10] + " puluh " + units[number % 10];
            } else if (number < 200) {
                result = "seratus " + convertToWords(number - 100);
            } else if (number < 1000) {
                result = units[number / 100] + " ratus " + convertToWords(number % 100);
            } else if (number < 2000) {
                result = "seribu " + convertToWords(number - 1000);
            } else if (number < 1000000) {
                result = convertToWords(number / 1000) + " ribu";
                if (number % 1000 != 0) {
                    result += " " + convertToWords(number % 1000);
                }
            } else if (number < 1000000000) {
                result = convertToWords(number / 1000000) + " juta";
                if (number % 1000000 != 0) { // jika tidak habis dibagi 1 juta
                    result += " " + convertToWords(number % 1000000);
                }
            } else {
                result = "Angka terlalu besar";
            }

            return result.trim();
        }
    }

}
