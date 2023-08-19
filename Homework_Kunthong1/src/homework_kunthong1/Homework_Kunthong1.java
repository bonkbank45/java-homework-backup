package homework_kunthong1;

/**
 *
 * @author bonkBANK
 */
public class Homework_Kunthong1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KunThong k1 = new KunThong("Male", "Jack");
        KunThong k2 = new KunThong("Female", "Mia");
        KunThong k3 = new KunThong("Male", "Sebee");
        if (k1.canBreeding(k2)) {
            KunThong k4 = k1.breeding(k2);
            k4.speak();
        } else {
            System.out.println("Can't having child");
        }
    }
}
