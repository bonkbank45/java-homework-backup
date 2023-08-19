package homework_kunthong1;

/**
 *
 * @author bonkBANK
 */
public class KunThong {
    private final String name;
    private String sex;
    private final int age = 1;
    private final int bodyWeight = 100;
    int stomachWeight = 0;
    
    KunThong(){
        this.name = "Mr.Kunthong";
        this.sex = "Male";
    }
    
    KunThong(String sex, String name) {
        this.name = name;
        this.sex = sex;
    }
    
    void speak() {
        System.out.println("I'm " + this.age + " years old :)");
    }
    void speak(String text) {
        System.out.println(text);
    }
    void eat(int foodWeight) {
        stomachWeight += foodWeight;
        if (this.stomachWeight > this.bodyWeight) {
            System.out.println(this.name + " is diarrhea T_T");
            stomachWeight = 0;
            return;
        }
        System.out.println(this.name + " said Yummy!" );
    }
    void poop(int food) {
        if (food > stomachWeight) {
            System.out.println(this.name + " said Wait! I can't poop as much as you want");
            return;
        }
        stomachWeight -= food;
        System.out.println(this.name + " said Finareh~");
    }
    KunThong breeding(KunThong anotherKunThong) {
        return new KunThong("Male", Character.toString(this.name.charAt(0)) + anotherKunThong.getName().charAt(0));
    }
    boolean canBreeding(KunThong anotherKunThong) {
        return !this.sex.equals(anotherKunThong.getSex());
    }
    int getStomachWeight(){
        return stomachWeight;
    }
    int getCurrentWeight() {
        return bodyWeight + stomachWeight;
    }
    String getName() {
        return name;
    }
    String getSex() {
        return sex;
    }
}
