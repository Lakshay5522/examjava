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

package calculator;
public class Subtraction {
    private double a, b;
    public Subtraction(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double compute() {
        return a - b;
    }
}

package calculator;
public class Addition {
    private double a, b;
    public Addition(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double compute() {
        return a + b;
    }
}
