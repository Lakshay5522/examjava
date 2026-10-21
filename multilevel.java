class c1 {
    void sq(int a) {
        System.out.println("Square is " + (a * a));
    }
}
class c2 extends c1 {
    void cb(int a) {
        System.out.println("Cube is " + (a * a * a));
    }
}
class c3 extends c2 {
    void display() {
        System.out.println("Child/Derived/SubClass");
    }
}
class multilevel {
    public static void main(String args[]) {
        c3 obj = new c3();
        obj.sq(5);
        obj.cb(5);
        obj.display();
    }
}
