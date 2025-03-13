package PR13_2473021_JAVA;
/**
 *
 * @author Febrianus Leon
 * @version 22 December 2024
 */
public class A_EBankDirector {
    public A_EBankDirector(){
        A_EBank tabA = new A_EBank();
        tabA.setNama_bank("ABC");
        tabA.setNo_rek("123 1234 1234");
        tabA.Menabung(20000);
        System.out.println(tabA.toString());
        tabA.Mengambil(1000);
        System.out.println(tabA.toString());
        tabA.Menabung(50000);
        System.out.println(tabA.toString());
        
        A_EBank tabB = new A_EBank();
        tabB.setNama_bank("ABC");
        tabB.setNo_rek("123 1234 1235");
        tabB.Menabung(15000);
        System.out.println(tabB.toString());
        
        A_EBank tabC = new A_EBank();
        tabC.setNama_bank("BCD");
        tabB.setNo_rek("321 1234 1234");
        tabB.Menabung(5000);
        System.out.println(tabC.toString());
        
        tabA.tutupRekening();
        System.out.println(tabA.toString());
    }
    public static void main(String[] args) {
        new A_EBankDirector();
    }
}
