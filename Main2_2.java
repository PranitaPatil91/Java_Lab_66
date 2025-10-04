interface Printable {
    void print();
}

interface Showable {
    void show(); 
}

class Student implements Printable, Showable {
    String name;
    int roll;
    int marks;

    Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public void print() {
        System.out.println("Printing Student Details...");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Marks: " + marks);
    }

    public void show() {
        System.out.println("Showing Student Information...");
        System.out.println("Student " + name + " has Roll No " + roll + " and scored " + marks + " marks.");
    }
}

public class Main2_2 {
    public static void main(String[] args) {
        Student student = new Student("Pranita", 101, 95);

        student.print();
        System.out.println();
        student.show();
    }
}
