
/**
 * Pertemuan 1 [PRAKTIKUM]
 *
 * @author 2473021-Febrianus Leona Putra
 * @version 21 Februari 2025
 */
public class MotorDirector {

    public static void main(String[] args) {
        Motor newMotor = new Motor();
        newMotor.setMerk("Honda");
        newMotor.setTipe("CBR 250");
        System.out.println(newMotor.toString());
        newMotor.naikkanGigi();
        System.out.println(newMotor.toString());
        newMotor.tambahKecepatan();
        System.out.println(newMotor.toString());
        newMotor.rem();
        System.out.println(newMotor.toString());
        newMotor.turunkanGigi();
        System.out.println(newMotor.toString());
    }
}
