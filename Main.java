import calculator.Addition;
import calculator.Subtraction;
public class Main {
    public static void main(String[] args) {
        Addition add = new Addition(10, 5);
        System.out.println("Addition: " + add.compute());
        Subtraction sub = new Subtraction(10, 5);
        System.out.println("Subtraction: " + sub.compute());
    }
}
