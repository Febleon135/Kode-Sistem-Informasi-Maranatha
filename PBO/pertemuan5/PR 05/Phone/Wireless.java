
/**
 * Pertemuan 5 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 27 Maret 2025
 */
public class Wireless extends Device {

    private String standard;
    private int bandwidth;
    private int speed;

    public Wireless(String standard, int bandwidth, int speed) {
        this.standard = standard;
        this.bandwidth = bandwidth;
        this.speed = speed;
    }

    @Override
    public void call() {
        System.out.println("Calling via Wireless (" + standard + ") with bandwidth: " + bandwidth + " MHz.");
    }

    @Override
    public void endCall() {
        System.out.println("Ending call via Wireless.");
    }
}
