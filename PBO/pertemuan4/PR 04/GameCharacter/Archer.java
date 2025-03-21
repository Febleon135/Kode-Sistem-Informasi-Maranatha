
/**
 * Pertemuan 4 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 20 Maret 2025
 */
// Subclass Archer dari Character
public class Archer extends Character {

    private int agility;
    private String bow;

    public Archer(String name, int level, int health, int agility, String bow) {
        super(name, level, health);
        this.agility = agility;
        this.bow = bow;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with " + bow + " using " + agility + " Agility");
    }
}
