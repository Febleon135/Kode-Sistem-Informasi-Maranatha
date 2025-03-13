package PR13_2473021_JAVA;

/**
 *
 * @author Febrianus Leon
 * @version 22 December 2024
 */
import java.util.Scanner;

public class B_MaskapaiDirector {
    public static void main(String[] args) {
        B_Maskapai maskapai = new B_Maskapai("Garuda Indonesia", "200", false);
        Scanner sc = new Scanner(System.in);

        maskapai.tampilkanInfo();

        System.out.print("\nMemulai penerbangan? (y/n): ");
        String mulai = sc.nextLine();
        if (mulai.equalsIgnoreCase("y")) {
            maskapai.mulaiTerbang();
        }

        System.out.println("\nInformasi Pesawat setelah Penerbangan:");
        System.out.println(maskapai);

        System.out.print("\nMendaratkan pesawat? (y/n): ");
        String mendarat = sc.nextLine();
        if (mendarat.equalsIgnoreCase("y")) {
            maskapai.mendarat();
        }

        System.out.println("\nInformasi Pesawat setelah Mendarat:");
        System.out.println(maskapai);

        sc.close();
    }
}
