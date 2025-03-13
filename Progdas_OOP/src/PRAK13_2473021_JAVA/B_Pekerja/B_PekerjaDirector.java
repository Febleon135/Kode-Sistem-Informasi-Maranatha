package B_Pekerja;

/**
 *
 * @author Febrianus Leona Putra - 2473021
 * @version 17 December 2024
 */
public class B_PekerjaDirector {
    public static void main(String[] args) {
        B_Pekerja pekerja1 = new B_Pekerja("Alice", "Manager", 50000);
        System.out.println("Informasi Pekerja");
        pekerja1.tampilkanInfo();
        
        pekerja1.setPosisi("Supervisor");
        pekerja1.setGaji(55000);
        
        System.out.println("\nInformasi Pekerja setelah perubahan");
        pekerja1.tampilkanInfo();
        pekerja1.naikkanGaji(10);
        
        System.out.println("\nInformasi Pekerja setelah kenaikan gaji:");
        pekerja1.tampilkanInfo();
    }
}
