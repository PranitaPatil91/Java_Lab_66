// Calculator class demonstrating method overloading
class Calculator {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add two doubles
    double add(double a, double b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Main class
public class Main2_4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition of 2 integers: " + calc.add(2, 3));
        System.out.println("Addition of 2 doubles: " + calc.add(3.4, 4.4));
        System.out.println("Addition of 3 integers: " + calc.add(3, 4, 5));
    }
}
