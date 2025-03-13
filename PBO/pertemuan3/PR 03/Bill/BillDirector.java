
/**
 * Pertemuan 3 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 13 Maret 2025
 */
import java.util.ArrayList;
import java.util.Scanner;

public class BillDirector {

    private static final String[] MENU_ITEMS = {"Ayam Goreng", "Ayam Bakar", "Nasi Uduk", "Nasi Putih", "Tahu Goreng"};
    private static final int[] PRICES = {18000, 20000, 15000, 5000, 7000};
    private ArrayList<Bill> transactions = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void showMenu() {
        System.out.println("Menu yang ada:");
        for (int i = 0; i < MENU_ITEMS.length; i++) {
            System.out.println((i + 1) + ". " + MENU_ITEMS[i] + " - Rp " + PRICES[i]);
        }
    }

    public void processOrder() {
        showMenu();

        System.out.println("\nMasukkan nomor menu yang ingin dibeli: ");
        int choice = sc.nextInt();
        if (choice < 1 || choice > MENU_ITEMS.length) {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        System.out.println("Jumlah yang ingin dibeli: ");
        int quantity = sc.nextInt();

        System.out.println("\nMenu yang ingin dibeli: " + MENU_ITEMS[choice - 1]);
        System.out.println("Harga satuan: " + PRICES[choice - 1]);

        System.out.println("\nApakah yakin? (Y/N): ");
        String confirm = sc.next();

        if (confirm.equalsIgnoreCase("Y")) {
            transactions.add(new Bill(MENU_ITEMS[choice - 1], quantity, PRICES[choice - 1]));
            System.out.println("\nTransaksi berhasil ditambahkan!\n");
        } else {
            System.out.println("\nTransaksi dibatalkan.\n");
        }
    }

    public void printBills() {
        System.out.println("=================================");
        System.out.println("         AYAM BERKAH             ");
        System.out.println("=================================");
        int total = 0;
        for (Bill bill : transactions) {
            System.out.println(bill);
            total += bill.getTotalPrice();
        }
        System.out.println("----------------------------------");
        System.out.println("Total : Rp " + total);
    }

    public static void main(String[] args) {
        BillDirector director = new BillDirector();
        char repeat;

        do {
            director.processOrder();
            System.out.print("Ingin menambah transaksi lagi? (Y/N): ");
            repeat = director.sc.next().charAt(0);
        } while (repeat == 'Y' || repeat == 'y');

        director.printBills();
    }
}
