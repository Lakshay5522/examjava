class A {
    int a, b;
    A() {
        System.out.println("Default Constructor");
    }
    A(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Parameterized Constructor");
        System.out.println("Addition is " + (a + b));
    }
}
class Constructor {
    public static void main(String args[]) {
        A a1 = new A();
        A a2 = new A(4, 5);
    }
}
