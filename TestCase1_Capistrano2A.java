import java.util.Scanner;

public class TestCase1_Capistrano2A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();
        
        double total = 0;

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the average for student " + (i + 1) + ":");
            total += scanner.nextDouble();
        }
        
        double average = total / numStudents;
        String grade;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C"; // Capitalized C
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F"; // Added assignment
        }

        System.out.println("The average is: " + average);
        System.out.println("The grade is: " + grade);
        
        scanner.close(); // Close the scanner
    }
}
