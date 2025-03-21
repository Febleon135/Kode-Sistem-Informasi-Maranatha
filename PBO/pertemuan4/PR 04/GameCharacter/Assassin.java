
/**
 * Pertemuan 4 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 20 Maret 2025
 */
// Subclass Assassin dari Character
public class Assassin extends Character {

    private int stealth;
    private String dagger;

    public Assassin(String name, int level, int health, int stealth, String dagger) {
        super(name, level, health);
        this.stealth = stealth;
        this.dagger = dagger;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with " + dagger + " using " + stealth + " Stealth");
    }
}
