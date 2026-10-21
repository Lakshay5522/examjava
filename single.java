class parent {
    void display() {
        System.out.println("Parent Class");
    }
}
class child extends parent {
    void print() {
        System.out.println("Child Class");
    }
}
class single {
    public static void main(String args[]) {
        child c1 = new child();
        c1.display();
        c1.print();
    }
}
