
/**
 * Pertemuan 4 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 20 Maret 2025
 */
import java.util.ArrayList;
import java.util.List;

// Inventory untuk menyimpan item yang dimiliki character
public class Inventory {

    private List<Item> items;
    private int maxCapacity;

    public Inventory(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (items.size() < maxCapacity) {
            items.add(item);
            System.out.println(item.getName() + " added to inventory.");
        } else {
            System.out.println("Inventory is full, cannot add " + item.getName());
        }
    }

    public void removeItem(String itemName) {
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                items.remove(item);
                System.out.println(item.getName() + " removed from inventory.");
                return;
            }
        }
        System.out.println("Item not found: " + itemName);
    }

    public void showItems() {
        System.out.println("Inventory Items:");
        for (Item item : items) {
            System.out.println("- " + item);
        }
    }
}
