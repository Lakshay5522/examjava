class A {
    void print() {
        System.out.println("Class A print method");
    }
}
class B extends A {
    @Override
    void print() {
        System.out.println("Class B print method");
    }
}
class overriding {
    public static void main(String args[]) {
        B b1 = new B();
        b1.print();
    }
}
