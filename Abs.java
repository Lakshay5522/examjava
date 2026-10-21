abstract class Calc {
    public abstract int sqr(int n1);
    public abstract int cube(int n1);
    public void display() {
        System.out.println("Hello SYCS");
    }
}
class Abs extends Calc {
    public int sqr(int n1) {
        return n1 * n1;
    }
    public int cube(int n1) {
        return n1 * n1 * n1;
    }
    public static void main(String args[]) {
        Abs a1 = new Abs();
        System.out.println("Square is: " + a1.sqr(5));
        System.out.println("Cube is: " + a1.cube(5));
        a1.display();
    }
}
