class Outer {

    class Inner {
        void show() {
            System.out.println("This is inner class.");
        }
    }

    void displayInner() {
        Inner inner = new Inner();   
        inner.show();
    }
}

interface MyInterface {
    void display();
}

public class Main2_5 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.displayInner();

        MyInterface obj = new MyInterface() {
            public void display() {
                System.out.println("This is anonymous class.");
            }
        };
        obj.display();
    }
}
