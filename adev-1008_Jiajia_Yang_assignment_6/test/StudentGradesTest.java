import java.util.Arrays;
/**
 * Name:Jiajia Yang
 * Program:Business Information Technology
 * Course:ADEV-1008 Programming 1
 * Created:2022-11-25
 * Updated:2022-11-26
 */

 /**
 * Module6 This program tests the StudentGrades class.
 * 
 * @author  Jiajia Yang
 * @version 1.0
 */

public class StudentGradesTest 
{
    public static void main(String[] args)
    {
        System.out.println("StudentGrades(int)");
        System.out.println("Test #1 - Initialize grades array without data.");
        constructor1_StudentGrades_initialize();
        
        System.out.println("StudentGrades(int[])");
        System.out.println("Test #2 - Initialize grades array with data.");
        constructor2_StudentGrades_initialize();

        System.out.println("setGrades(int[]) : void");
        System.out.println("Test #3 - Updates the state of the grades.");
        setGrates_grades_update();

        System.out.println("getSortedGrades() : int[]");
        System.out.println("Test #4 - Returns a copy of the grades array sorted in ascending order.");
        getSortedGrades_grades_sorted();
                            
        System.out.println("getSortedGrades() : int[]");
        System.out.println("Test #4 - Returns a copy of the grades array sorted in ascending order.");
        getHighestGrade_highestGrade();

        System.out.println("getAverageGrade() : double");
        System.out.println("Test #6 - Returns the correct average of all the grades.");
        getAverageGrade_averageGrade();

        System.out.println("toString() : String");
        System.out.println("Test #7 - Returns a string representation of the grades.");
        toString_stringRepresentation();

    }

    /**
     * constructor1 - StudentGrades(int)\
     * Test #1 - Initialize grades array without data.
     * Expected: [0,0,0,0,0]
     * Actual: [0,0,0,0,0]
     */
    public static void constructor1_StudentGrades_initialize()
    {
        //Set test data
        int numberOfStudent = 5;

        // Act
        StudentGrades test1 = new StudentGrades(numberOfStudent);

        // Confirm
        int[] expected = new int[numberOfStudent];
        int[] actual = test1.getGrades();
        System.out.printf("Expected: %s\nActual: %s\n\n", 
                            Arrays.toString(expected), Arrays.toString(actual));

    }

    /**
     * constructor2 - StudentGrades(int[])
     * Test #2 - Initialize grades array with data.
     * Expected: [68,90,99,85,76]
     * Actual: [68,90,99,85,76]
     */
    public static void constructor2_StudentGrades_initialize()
    {
        // Set test data
        int[] grades = {68,90,99,85,76};

        // Act
        StudentGrades test = new StudentGrades(grades);

        // Confirm
        int[] actual = test.getGrades();
        System.out.printf("Expected: %s\nActual: %s\n\n", 
                            Arrays.toString(grades), Arrays.toString(actual));
    }

    /**
     * setGrades(int[]) : void
     * Test #3 - Updates the state of the grades.
     * Expected: [88,70,69,85,96]
     * Actual: [88,70,69,85,96]
     */
    public static void setGrates_grades_update()
    {
        // Set test data
        int[] grades = {88,70,69,85,96};

        // Act
        StudentGrades test = new StudentGrades(5);
        test.setGrades(grades);

        // Confirm
        int[] actual = test.getGrades();
        System.out.printf("Expected: %s\nActual: %s\n\n", 
                            Arrays.toString(grades), Arrays.toString(actual));
    }

    /**
     * getSortedGrades() : int[]
     * Test #4 - Returns a copy of the grades array sorted in ascending order.
     * Expected: [69,70,85,88,96]
     * Actual: [69,70,85,88,96]
     */
    public static void getSortedGrades_grades_sorted()
    {
        // Set test data
        int[] grades = {88,70,69,85,96};

        // Act
        StudentGrades test = new StudentGrades(grades);

        // Confirm
        int[] actual = test.getSortedGrades();
        int[] expected = {69,70,85,88,96};
        System.out.printf("Expected: %s\nActual: %s\n\n", 
                            Arrays.toString(expected), Arrays.toString(actual));
    }

    /**
     * getHighestGrade() : int
     * Test #5 - Returns the correct highest grade value.
     * Expected: 96
     * Actual: 96
     */
    public static void getHighestGrade_highestGrade()
    {
        // Set test data
        int[] grades = {88,70,69,85,96};

        // Act
        StudentGrades test = new StudentGrades(grades);

        // Confirm
        int actual = test.getHighestGrade();
        int expected = 96;
        System.out.printf("Expected: %d\nActual: %d\n\n", 
                            expected, actual);
    }

    /**
     * getAverageGrade() : double
     * Test #6 - Returns the correct average of all the grades.
     * Expected: 81.6
     * Actual: 81.6
     */
    public static void getAverageGrade_averageGrade()
    {
        // Set test data
        int[] grades = {88,70,69,85,96};

        // Act
        StudentGrades test = new StudentGrades(grades);

        // Confirm
        double actual = test.getAverageGrade();
        double expected = 81.6;
        System.out.printf("Expected: %f\nActual: %f\n\n", 
                            expected, actual);
    }

    /**
     * toString() : String
     * Test #7 - Returns the correct String representation.
     * Initialgrades: [88,70,69,85,96]
     * Expected: 
     * ====================
     * Student        Grade
     * ====================
     * 1                 88
     * 2                 70
     * 3                 69
     * 4                 85
     * 5                 96
     */
    public static void toString_stringRepresentation()
    {
        // Set test data
        int[] grades = {88,70,69,85,96};

        // Act
        StudentGrades test = new StudentGrades(grades);

        // Confirm
        String actual = test.toString();
        String expected = "====================\nStudent        Grade\n====================\n1                 88\n2                 70\n3                 69\n4                 85\n5                 96";
        System.out.printf("Expected:\n%s\n\nActual:\n%s\n\n", 
                            expected, actual);
    }
}
        