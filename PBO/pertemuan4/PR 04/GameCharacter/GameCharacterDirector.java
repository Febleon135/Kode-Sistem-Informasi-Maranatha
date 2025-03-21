
/**
 * Pertemuan 4 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 20 Maret 2025
 */
public class GameCharacterDirector {

    public static void main(String[] args) {
        // Membuat karakter Warrior dan Mage
        Warrior arthur = new Warrior("Arthur", 70, 2500, 15, "Engraved Spellblade");
        Mage nethamis = new Mage("Nethamis", 68, 1500, 22, "Imperum Caniate");

        // Membuat item
        Item healthPotion = new Item("Health Potion", "Consumable");
        Item ironShield = new Item("Iron Shield", "Armor");
        Item ancientSpellbook = new Item("Ancient Spellbook", "Magic");
        Item mysticStaff = new Item("Mystic Staff", "Weapon");
        Item vialOfVirtues = new Item("Vial of Virtues", "Consumable");

        // Menambahkan item ke inventory Arthur
        arthur.inventory.addItem(healthPotion);
        arthur.inventory.addItem(ironShield);

        // Menampilkan informasi karakter Arthur
        System.out.println();
        arthur.showCharacterInfo();

        // Menyerang dengan Arthur
        arthur.attack();
        System.out.println();

        // Menambahkan item ke inventory Nethamis
        nethamis.inventory.addItem(ancientSpellbook);
        nethamis.inventory.addItem(mysticStaff);

        // Menampilkan informasi karakter Nethamis
        System.out.println();
        nethamis.showCharacterInfo();

        // Menyerang dengan Nethamis
        nethamis.attack();
        System.out.println();

        // Mencoba menambahkan item ke inventory yang sudah penuh
        nethamis.inventory.addItem(vialOfVirtues);

        // Mencoba menghapus item dari inventory
        System.out.println("\nMencoba menghapus item:");
        nethamis.inventory.removeItem("Ancient Spellbook");

        // Menampilkan inventory setelah penghapusan item
        System.out.println();
        nethamis.inventory.showItems();

        // Menambahkan kembali Vial of Virtues
        nethamis.inventory.addItem(vialOfVirtues);

        // Menampilkan inventory setelah penambahan item baru
        System.out.println();
        nethamis.inventory.showItems();
    }
}
