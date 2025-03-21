
/**
 * Pertemuan 4 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 20 Maret 2025
 */
// Character adalah class parent
public abstract class Character {

    private String name;
    private int level;
    private int health;
    protected Inventory inventory;

    public Character(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.inventory = new Inventory(2);
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    // Setter
    public void setName(String nama) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attack();

    @Override
    public String toString() {
        return "Character\n"
                + "Name=" + name + "\n"
                + "Level=" + level + "\n"
                + "Health=" + health;
    }

    public void showCharacterInfo() {
        System.out.println(this);
        inventory.showItems();
    }
}
