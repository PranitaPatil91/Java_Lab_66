import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        double average, percentage;
        char grade;
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();
            total += marks[i];
        }
        average = total / 5.0;
        percentage = (total / 500.0) * 100;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 75) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
