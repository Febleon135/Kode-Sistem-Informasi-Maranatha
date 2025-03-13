
/**
 * Pertemuan 3 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 13 Maret 2025
 */
public class Bill {

    private String menu;
    private int quantity;
    private int price;

    public Bill(String menu, int quantity, int price) {
        this.menu = menu;
        this.quantity = quantity;
        this.price = price;
    }

    public int getTotalPrice() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return "Menu   : " + menu + "\n"
                + "Jumlah : " + quantity + "\n"
                + "Harga  : " + price + "\n"
                + "----------------------------------";
    }
}
