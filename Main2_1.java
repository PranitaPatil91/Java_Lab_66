abstract class Shape {
    abstract void calculateArea();

    void display() {
        System.out.println("Displaying shape area...");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class Main2_1 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.display();
        circle.calculateArea();

        Shape rectangle = new Rectangle(4, 5);
        rectangle.display();
        rectangle.calculateArea();
    }
}
