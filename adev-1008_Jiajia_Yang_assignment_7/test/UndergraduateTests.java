/**
 * This is a test class for UndergraduateApplicant class.
 * Module 7 Assignment
 * 
 * @author  Jiajia Yang
 * CreateDate     2022-12-11
 * Updated  2022-12-11
 * @version 1.0
 */
public class UndergraduateTests 
{
    public static void main(String[] args)
    {
        System.out.println("UndergraduateApplicant(String, String, String)");
        // Test #1 - Initialize the name.
        System.out.println("Test #1 - Initialize the name.");
        constructor_UndergraduateApplicant_name();
        
        // Test #2 - Initialize the college.
        System.out.println("Test #2 - Initialize the college.");
        constructor_UndergraduateApplicant_college();
        
        // Test #3 - Initialize the mark achieved on the standard aptitude test below the allowable range.
        System.out.println("Test #3 - Initialize the mark achieved on the standard aptitude test below the allowable range.");
        constructor_UndergraduateApplicant_markBelowRange();
        
        // Test #4 - Initialize the mark achieved on the standard aptitude test above the allowable range.
        System.out.println("Test #4 - Initialize the mark achieved on the standard aptitude test above the allowable range.");
        constructor_UndergraduateApplicant_markAboveRange();

        // Test #5 - Initialize the mark achieved on the standard aptitude test at the edge of the allowable range.
        System.out.println("Test #5 - Initialize the mark achieved on the standard aptitude test at the edge of the allowable range.");
        constructor_UndergraduateApplicant_markAtEdgeOfRange();

        //Test #6 - Initialize the mark achieved on the standard aptitude test.
        System.out.println("Test #6 - Initialize the mark achieved on the standard aptitude test.");
        constructor_UndergraduateApplicant_mark();

        // Test #7 - Initialize the applicants grade point average below the allowable range.
        System.out.println("Test #7 - Initialize the applicants grade point average below the allowable range.");
        constructor_UndergraduateApplicant_gpaBelowRange();

        // Test #8 - Initialize the applicants grade point average above the allowable range.
        System.out.println("Test #8 - Initialize the applicants grade point average above the allowable range.");
        constructor_UndergraduateApplicant_gpaAboveRange();

        // Test #9 - Initialize the applicants grade point average at the edge of the  allowable range.
        System.out.println("Test #9 - Initialize the applicants grade point average at the edge of the  allowable range.");
        constructor_UndergraduateApplicant_gpaAtEdgeOfRange();

        // Test #10 - Initialize the applicants grade point average.
        System.out.println("Test #10 - Initialize the applicants grade point average.");
        constructor_UndergraduateApplicant_gpa();

        System.out.println("setStandardAptitudeTestScore(double) : void");
        // Test #1 - Update the mark achieved on the standard aptitude test below the allowable range.
        System.out.println("Test #1 - Update the mark achieved on the standard aptitude test below the allowable range.");
        setStandardAptitudeTestScore_belowRange();

        // Test #2 - Update the mark achieved on the standard aptitude test above the allowable range.
        System.out.println("Test #2 - Update the mark achieved on the standard aptitude test above the allowable range.");
        setStandardAptitudeTestScore_aboveRange();

        // Test #3 - Update the mark achieved on the standard aptitude test at the edge of the allowable range.
        System.out.println("Test #3 - Update the mark achieved on the standard aptitude test at the edge of the allowable range.");
        setStandardAptitudeTestScore_atEdgeOfRange();

        // Test #4 - Update the mark achieved on the standard aptitude test.
        System.out.println("Test #4 - Update the mark achieved on the standard aptitude test.");
        setStandardAptitudeTestScore();

        System.out.println("setGradePointAverage(double) : void");
        // Test #1 - Update the applicants grade point average below the allowable range.
        System.out.println("Test #1 - Update the applicants grade point average below the allowable range.");
        setGradePointAverage_belowRange();

        // Test #2 - Update the applicants grade point average above the allowable range.
        System.out.println("Test #2 - Update the applicants grade point average above the allowable range.");
        setGradePointAverage_aboveRange();

        // Test #3 - Update the applicants grade point average at the edge of the allowable range.
        System.out.println("Test #3 - Update the applicants grade point average at the edge of the allowable range.");
        setGradePointAverage_atEdgeOfRange();

        // Test #4 - Update the applicants grade point average.
        System.out.println("Test #4 - Update the applicants grade point average.");
        setGradePointAverage();

        System.out.println("registerForProgram(String) : String");
        // Test #1 - Returns a String indicating the college, program name, and aptitude test score.
        System.out.println("Test #1 - Returns a String indicating the college, program name, and aptitude test score.");
        registerForProgram();

        System.out.println("toString() : String");
        // Test #1 - Returns the correct String representation.
        System.out.println("Test #1 - Returns the correct String representation.");
        toStringTest();

    }

    /**
     * UndergraduateApplicant(String, String, double, double)
     * Test #1 - Initialize the name.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = 465.3, gradePointAverage = 4.22
     * Expected: Kenny
     * Actual: Kenny
     */
    public static void constructor_UndergraduateApplicant_name()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 465.3, 4.22);
        String expected = "Kenny";
        String actual = applicant.getName();
        System.out.printf("Expected: %s\nActual: %s\n\n", expected, actual);
    }

    /**
     * UndergraduateApplicant(String, String, double, double)
     * Test #2 - Initialize the college.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = 465.3, gradePointAverage = 4.22
     * Expected: BIT College
     * Actual: BIT College
     */
    public static void constructor_UndergraduateApplicant_college()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 465.3, 4.22);
        String expected = "BIT College";
        String actual = applicant.getCollege();
        System.out.printf("Expected: %s\nActual: %s\n\n", expected, actual);
    }

    /**
     * UndergraduateApplicant(String, String, double, double)
     * Test #3 - Initialize the mark achieved on the standard aptitude test below the allowable range.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = -1.0, gradePointAverage = 4.22
     * Expected: 0.0
     * Actual: 0.0
     */
    public static void constructor_UndergraduateApplicant_markBelowRange()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", -1.0, 4.22);
        double expected = 0.0;
        double actual = applicant.getStandardAptitudeTestScore();
        System.out.printf("Expected: %f\nActual: %f\n\n", expected, actual);
    }

    /**
     * UndergraduateApplicant(String, String, double, double)
     * Test #4 - Initialize the mark achieved on the standard aptitude test above the allowable range.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = 1000.0, gradePointAverage = 4.22
     * Expected: 0.0
     * Actual: 0.0
     */
    public static void constructor_UndergraduateApplicant_markAboveRange()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 1000.0, 4.22);
        double expected = 0.0;
        double actual = applicant.getStandardAptitudeTestScore();
        System.out.printf("Expected: %f\nActual: %f\n\n", expected, actual);
    }

    /**
     * UndergraduateApplicant(String, String, double, double)
     * Test #5 - Initialize the mark achieved on the standard aptitude test at the edge of the allowable range.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = 500, gradePointAverage = 4.22
     * Expected: 500.0
     * Actual: 500.0
     */
    public static void constructor_UndergraduateApplicant_markAtEdgeOfRange()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 0.0, 4.22);
        double expected = 0.0;
        double actual = applicant.getStandardAptitudeTestScore();
        System.out.printf("Expected: %f\nActual: %f\n\n", expected, actual);
    }

    /**
     * UndergraduateApplicant(String, String, double, double)
     * Test #6 - Initialize the mark achieved on the standard aptitude test.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = 465.3, gradePointAverage = 4.22
     * Expected: 465.3
     * Actual: 465.3
     */
    public static void constructor_UndergraduateApplicant_mark()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 465.3, 4.22);
        double expected = 465.3;
        double actual = applicant.getStandardAptitudeTestScore();
        System.out.printf("Expected: %f\nActual: %f\n\n", expected, actual);
    }

    /**
     * UndergraduateApplicant(String, String, double, double)
     * Test #7 - Initialize the grade point average below the allowable range.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = 465.3, gradePointAverage = -1.0
     * Expected: 0.0
     * Actual: 0.0
     */
    public static void constructor_UndergraduateApplicant_gpaBelowRange()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 465.3, -1.0);
        double expected = 0.0;
        double actual = applicant.getGradePointAverage();
        System.out.printf("Expected: %f\nActual: %f\n\n", expected, actual);
    }

    /**
     * UndergraduateApplicant(String, String, double, double)
     * Test #8 - Initialize the grade point average above the allowable range.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = 465.3, gradePointAverage = 5.0
     * Expected: 0.0
     * Actual: 0.0
     */
    public static void constructor_UndergraduateApplicant_gpaAboveRange()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 465.3, 5.0);
        double expected = 0.0;
        double actual = applicant.getGradePointAverage();
        System.out.printf("Expected: %f\nActual: %f\n\n", expected, actual);
    }

    /**
     * UndergraduateApplicant(String, String, double, double)
     * Test #9 - Initialize the grade point average at the edge of the allowable range.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = 465.3, gradePointAverage = 4.5
     * Expected: 4.5
     * Actual: 4.5
     */
    public static void constructor_UndergraduateApplicant_gpaAtEdgeOfRange()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 465.3, 4.5);
        double expected = 4.5;
        double actual = applicant.getGradePointAverage();
        System.out.printf("Expected: %f\nActual: %f\n\n", expected, actual);
    }

    /**
     * UndergraduateApplicant(String, String, double, double)
     * Test #10 - Initialize the grade point average.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = 465.3, gradePointAverage = 4.22
     * Expected: 4.22
     * Actual: 4.22
     */
    public static void constructor_UndergraduateApplicant_gpa()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 465.3, 4.22);
        double expected = 4.22;
        double actual = applicant.getGradePointAverage();
        System.out.printf("Expected: %f\nActual: %f\n\n", expected, actual);
    }

    /**
     * setStandardAptitudeTestScore(double) : void
     * Test #1 - Update the mark achieved on the standard aptitude test below the allowable range.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = -1.0, gradePointAverage = 4.22
     * Expected: 0.0
     * Actual: 0.0
     */
    public static void setStandardAptitudeTestScore_belowRange()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 465.3, 4.22);
        applicant.setStandardAptitudeTestScore(-1.0);
        double expected = 0.0;
        double actual = applicant.getStandardAptitudeTestScore();
        System.out.printf("Expected: %f\nActual: %f\n\n", expected, actual);
    }

    /**
     * setStandardAptitudeTestScore(double) : void
     * Test #2 - Update the mark achieved on the standard aptitude test above the allowable range.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = 1000.0, gradePointAverage = 4.22
     * Expected: 0.0
     * Actual: 0.0
     */
    public static void setStandardAptitudeTestScore_aboveRange()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 465.3, 4.22);
        applicant.setStandardAptitudeTestScore(1000.0);
        double expected = 0.0;
        double actual = applicant.getStandardAptitudeTestScore();
        System.out.printf("Expected: %f\nActual: %f\n\n", expected, actual);
    }

    /**
     * setStandardAptitudeTestScore(double) : void
     * Test #3 - Update the mark achieved on the standard aptitude test at the edge of the allowable range.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = 500.0, gradePointAverage = 4.22
     * Expected: 500.0
     * Actual: 500.0
     */
    public static void setStandardAptitudeTestScore_atEdgeOfRange()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 465.3, 4.22);
        applicant.setStandardAptitudeTestScore(500.0);
        double expected = 500.0;
        double actual = applicant.getStandardAptitudeTestScore();
        System.out.printf("Expected: %f\nActual: %f\n\n", expected, actual);
    }

    /**
     * setStandardAptitudeTestScore(double) : void
     * Test #4 - Update the mark achieved on the standard aptitude test.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = 465.3, gradePointAverage = 4.22
     * Expected: 465.3
     * Actual: 465.3
     */
    public static void setStandardAptitudeTestScore()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 465.3, 4.22);
        applicant.setStandardAptitudeTestScore(465.3);
        double expected = 465.3;
        double actual = applicant.getStandardAptitudeTestScore();
        System.out.printf("Expected: %f\nActual: %f\n\n", expected, actual);
    }

    /**
     * setGradePointAverage(double) : void
     * Test #1 - Update the grade point average below the allowable range.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = 465.3, gradePointAverage = -1.0
     * Expected: 0.0
     * Actual: 0.0
     */
    public static void setGradePointAverage_belowRange()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 465.3, 4.22);
        applicant.setGradePointAverage(-1.0);
        double expected = 0.0;
        double actual = applicant.getGradePointAverage();
        System.out.printf("Expected: %f\nActual: %f\n\n", expected, actual);
    }

    /**
     * setGradePointAverage(double) : void
     * Test #2 - Update the grade point average above the allowable range.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = 465.3, gradePointAverage = 5.0
     * Expected: 0.0
     * Actual: 0.0
     */
    public static void setGradePointAverage_aboveRange()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 465.3, 4.22);
        applicant.setGradePointAverage(5.0);
        double expected = 0.0;
        double actual = applicant.getGradePointAverage();
        System.out.printf("Expected: %f\nActual: %f\n\n", expected, actual);
    }

    /**
     * setGradePointAverage(double) : void
     * Test #3 - Update the grade point average at the edge of the allowable range.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = 465.3, gradePointAverage = 4.5
     * Expected: 4.5
     * Actual: 4.5
     */
    public static void setGradePointAverage_atEdgeOfRange()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 465.3, 4.22);
        applicant.setGradePointAverage(4.5);
        double expected = 4.5;
        double actual = applicant.getGradePointAverage();
        System.out.printf("Expected: %f\nActual: %f\n\n", expected, actual);
    }

    /**
     * setGradePointAverage(double) : void
     * Test #4 - Update the grade point average.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = 465.3, gradePointAverage = 4.22
     * Expected: 4.22
     * Actual: 4.22
     */
    public static void setGradePointAverage()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 465.3, 4.22);
        applicant.setGradePointAverage(4.22);
        double expected = 4.22;
        double actual = applicant.getGradePointAverage();
        System.out.printf("Expected: %f\nActual: %f\n\n", expected, actual);
    }

    /**
     * registerForProgram(String) : String
     * Test #1 - Returns a String indicating the college, program name, and aptitude test score
     * college = "BIT College", standardApptitudeTestScore = 465.3, program = "Computer Science"
     * Expected: BIT College - Computer Science [465.3]
     * Actual: BIT College - Computer Science [465.3]
     */
    public static void registerForProgram()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 465.3, 4.22);
        String expected = "BIT College - Computer Science [465.3]";
        String actual = applicant.registerForProgram("Computer Science");
        System.out.printf("Expected: %s\nActual: %s\n\n", expected, actual);
    }

    /**
     * toString() : String
     * Test #1 - Returns the correct String representation.
     * name = "Kenny", college = "BIT College", standardApptitudeTestScore = 465.3, gradePointAverage = 4.22
     * Expected: Undergraduate Applicant ** Kenny - BIT College, SAT: 465.3, GPA: 4.22
     * Actual: Undergraduate Applicant ** Kenny - BIT College, SAT: 465.3, GPA: 4.22
     */
    public static void toStringTest()
    {
        UndergraduateApplicant applicant = new UndergraduateApplicant("Kenny", "BIT College", 465.3, 4.22);
        String expected = "Undergraduate Applicant ** Kenny - BIT College, SAT: 465.3, GPA: 4.22";
        String actual = applicant.toString();
        System.out.printf("Expected: %s\nActual: %s\n\n", expected, actual);
    }


}