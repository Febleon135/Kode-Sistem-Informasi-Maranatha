
/**
 * Pertemuan 5 [PR]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 27 Maret 2025
 */
public class PhoneDirector {

    public static void main(String[] args) {
        // SimCard
        Device simCard = new SimCard("4G LTE", 20, 100);
        simCard.powerOn();
        simCard.call();
        simCard.endCall();
        simCard.powerOff();

        System.out.println();

        // Wireless 
        Device wireless = new Wireless("Wi-Fi 6", 80, 300);
        wireless.powerOn();
        wireless.call();
        wireless.endCall();
        wireless.powerOff();

        System.out.println();

        // Wired 
        Device wired = new Wired("Fiber Optic", 100, 1000);
        wired.powerOn();
        wired.call();
        wired.endCall();
        wired.powerOff();
    }
}
