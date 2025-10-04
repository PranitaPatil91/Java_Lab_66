package test;
import college.students.Student;

class MyStudent extends Student {
    void accessProtected() {
        System.out.println("Protected Marks: " + marks);
    }
}

public class Test {
    public static void main(String[] args) {
        MyStudent s = new MyStudent();
        System.out.println("Public Name: " + s.name);
        s.accessProtected();
    }
}
