/**
 * Practical 3 - Calculator: addition and subtraction in ONE file.
 *
 * Combines the former Addition.java, Subtraction.java and Main.java
 * (which lived in the "calculator" package) into a single self-contained class.
 */
public class CAddSub {

    private double a, b;

    public CAddSub(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        return a + b;
    }

    public double subtract() {
        return a - b;
    }

    public static void main(String[] args) {
        CAddSub calc = new CAddSub(10, 5);
        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
    }
}
