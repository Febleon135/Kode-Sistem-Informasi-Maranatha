
/**
 * Pertemuan 5 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 27 Maret 2025
 */
// Wired.java
public class Wired extends Device {

    private String type;
    private int bandwidth;
    private int speed;

    public Wired(String type, int bandwidth, int speed) {
        this.type = type;
        this.bandwidth = bandwidth;
        this.speed = speed;
    }

    @Override
    public void call() {
        System.out.println("Calling via Wired (" + type + ") with speed: " + speed + " Mbps.");
    }

    @Override
    public void endCall() {
        System.out.println("Ending call via Wired.");
    }
}
