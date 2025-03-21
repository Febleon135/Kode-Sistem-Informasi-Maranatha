
/**
 * Pertemuan 4 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 20 Maret 2025
 */
// Subclass Mage dari Character
public class Mage extends Character {

    private int mana;
    private String spell;

    public Mage(String name, int level, int health, int mana, String spell) {
        super(name, level, health);
        this.mana = mana;
        this.spell = spell;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with " + spell + " using " + mana + " Mana");
    }
}
