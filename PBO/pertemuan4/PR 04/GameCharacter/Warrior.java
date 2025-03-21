
/**
 * Pertemuan 4 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 20 Maret 2025
 */
// Subclass Warrior dari Character
public class Warrior extends Character {

    private int strength;
    private String weapon;

    public Warrior(String name, int level, int health, int strength, String weapon) {
        super(name, level, health);
        this.strength = strength;
        this.weapon = weapon;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with " + weapon + " using " + strength + " strength");
    }
}
