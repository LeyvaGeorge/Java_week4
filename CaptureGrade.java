/*
    Name Jorge Leyva
    Class CSC 320-1
    This program captures 10 grade points from the user, validates the input to ensure it's between 0 and 100, 
    and calculates the average, maximum, and minimum grades. It uses a Scanner object to read user input and 
    includes error handling for invalid grade entries.
 */
import java.util.Scanner;

public class CaptureGrade {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scnr = new Scanner(System.in);
        
        // Initialize variables to store the number of assignments, maximum grade, minimum grade, total grade, and current grade
        int assignments = 10;
        float maxGrade = 0.0f;
        float minGrade = 100.0f;
        float totalGrade = 0.0f;
        float grade = 0.0f;

        // Loop to capture grades for each assignment
        for (int i = 0; i < assignments; i++) {
            // Validate the grade input to ensure it's between 0 and 100
            do {
                System.out.println("Enter "+ (i + 1) +" grade point (0-100):");
                grade = scnr.nextFloat();
                // Check if the entered grade is valid
                if (grade < 0.0f || grade > 100.0f) {
                    System.out.println("Invalid grade. Please enter a value between 0 and 100.");
                }
            } while (grade < 0.0f || grade > 100.0f);
            // Update maxGrade, minGrade, and totalGrade based on the entered grade
            if (grade > maxGrade) {
                maxGrade = grade;
            }
            if (grade < minGrade) {
                minGrade = grade;
            }
            totalGrade += grade;
        }
        // Calculate and display the average, maximum, and minimum grades
        System.out.println("Average grade: " + (totalGrade / assignments));
        System.out.println("Maximum grade: " + maxGrade);
        System.out.println("Minimum grade: " + minGrade);
        // Close the Scanner object to prevent resource leaks
        scnr.close();
    }
}