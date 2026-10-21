class A {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
class overload {
    public static void main(String args[]) {
        A a1 = new A();
        System.out.println(a1.add(5, 5));
        System.out.println(a1.add(5, 5, 5));
    }
}
