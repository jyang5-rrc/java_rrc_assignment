/**
 * This is a test class for GraduateApplicant class.
 * Module 7 Assignment
 * 
 * @author  Jiajia Yang
 * CreateDate     2022-12-11
 * Updated  2022-12-11
 * @version 1.0
 */
public class GraduateApplicantTests 
{
    public static void main(String[] args)
    {
        System.out.println("GraduateApplicant(String, String, String)");
        // Test #1 - Initialize the name.
        System.out.println("Test #1 - Initialize the name.");
        constructor_GraduateApplicant_name();
        
        // Test #2 - Initialize the college.
        System.out.println("Test #2 - Initialize the college.");
        constructor_GraduateApplicant_college();

        // Test #3 - Initialize the college of orgin.
        System.out.println("Test #3 - Initialize the college of origin.");
        constructor_GraduateApplicant_collegeOfOrigin();

        System.out.println("CollegeApplicant Members");
        System.out.println("setName(String) : void");
        // Test #1 - Update the state of name.
        System.out.println("Test #1 - Update the state of name.");
        setName_CollegeApplicant_name();

        System.out.println("setCollege(String) : void");
        // Test #1 - Update the state of college.
        System.out.println("Test #1 - Update the state of college.");
        setCollege_CollegeApplicant_college();

        System.out.println("setCollegeOfOrgin(String) : void");
        //Test #1 - Update the state of college of origin.
        System.out.println("Test #1 - Update the state of college of origin.");
        setCollegeOfOrigin_GraduateApplicant_collegeOfOrigin();

        System.out.println("isInside() : boolean");
        // Test #1 - Returns true when the college and the college of origin are the same.
        System.out.println("Test #1 - Returns true when the college and the college of origin are the same.");
        isInside_GraduateApplicant_true();

        // Test #2 - Returns false when the college and the college of origin are not the same.
        System.out.println("Test #2 - Returns false when the college and the college of origin are not the same.");
        isInside_GraduateApplicant_false();

        System.out.println("registerForProgram(String) : String");
        // Test #1 - Returns a String indicating the college of origin, college and program name.
        System.out.println("Test #1 - Returns a String indicating the college of origin, college and program name.");
        registerForProgram_GraduateApplicant_program();
        
        System.out.println("toString() : String");
        //Test #1 - Returns the correct String representation.
        System.out.println("Test #1 - Returns the correct String representation.");
        toString_GraduateApplicant_string();

    }


    /**
     * GraduateApplicant(String, String, String)
     * Test #1 - Initialize the name.
     * name = "Kenny", college = "BIT College", program = "BIT"
     * Expected: Kenny
     * Actual: Kenny
     */
    public static void constructor_GraduateApplicant_name()
    {
        GraduateApplicant applicant = new GraduateApplicant("Kenny", "BIT College", "BIT");
        String expected = "Kenny";
        String actual = applicant.getName();
        System.out.printf("Expected: %s\nActual: %s\n\n", expected, actual);

    }

    /**
     * Test #2 - Initialize the college.
     * name = "Kenny", college = "BIT College", program = "BIT"
     * Expected: BIT College
     * Actual: BIT College
     */
    public static void constructor_GraduateApplicant_college()
    {
        GraduateApplicant applicant = new GraduateApplicant("Kenny", "BIT College", "BIT");
        String expected = "BIT College";
        String actual = applicant.getCollege();
        System.out.printf("Expected: %s\nActual: %s\n\n", expected, actual);

    }
   
    /**
     * Test #3 - Initialize the college of orgin.
     * name = "Kenny", college = "BIT College", program = "BIT"
     * Expected: BIT
     * Actual: BIT
     */
    public static void constructor_GraduateApplicant_collegeOfOrigin()
    {
        GraduateApplicant applicant = new GraduateApplicant("Kenny", "BIT College", "BIT");
        String expected = "BIT";
        String actual = applicant.getCollegeOfOrigin();
        System.out.printf("Expected: %s\nActual: %s\n\n", expected, actual);

    }

    /**
     * setName(String) : void
     * Test #1 - Update the state of name.
     * name = "Sam"
     * Expected: Sam
     * Actual: Sam
     */
    public static void setName_CollegeApplicant_name()
    {
        GraduateApplicant applicant = new GraduateApplicant("Kenny", "BIT College", "BIT");
        String expectedName = "Sam";
        applicant.setName(expectedName);
        String expected = "Sam";
        String actual = applicant.getName();
        System.out.printf("Expected: %s\nActual: %s\n\n", expected, actual);

    }

    /**
     * setCollege(String) : void
     * Test #1 - Update the state of college.
     * college = "Red River College"
     * Expected: Red River College
     * Actual: Red River College
     */
    public static void setCollege_CollegeApplicant_college()
    {
        GraduateApplicant applicant = new GraduateApplicant("Kenny", "BIT College", "BIT");
        String expectedCollege = "Red River College";
        applicant.setCollege(expectedCollege);
        String expected = "Red River College";
        String actual = applicant.getCollege();
        System.out.printf("Expected: %s\nActual: %s\n\n", expected, actual);

    }

    /**
     * setCollegeOfOrgin(String) : void
     * Test #1 - Update the state of college of origin.
     * collegeOfOrigin = "Red River College"
     * Expected: Red River College
     * Actual: Red River College
     */
    public static void setCollegeOfOrigin_GraduateApplicant_collegeOfOrigin()
    {
        GraduateApplicant applicant = new GraduateApplicant("Kenny", "BIT College", "BIT");
        String expectedCollegeOfOrigin = "Red River College";
        applicant.setCollegeOfOrigin(expectedCollegeOfOrigin);
        String expected = "Red River College";
        String actual = applicant.getCollegeOfOrigin();
        System.out.printf("Expected: %s\nActual: %s\n\n", expected, actual);

    }

    /**
     * isInside() : boolean
     * Test #1 - Returns true when the college and the college of origin are the same.
     * college = "Red River College", collegeOfOrigin = "Red River College"
     * Expected: true
     * Actual: true
     */
    public static void isInside_GraduateApplicant_true()
    {
        GraduateApplicant applicant = new GraduateApplicant("Kenny", "Red River College", "Red River College");
        boolean expected = true;
        boolean actual = applicant.isInside();
        System.out.printf("Expected: %s\nActual: %s\n\n", expected, actual);

    }

    /**
     * Test #2 - Returns false when the college and the college of origin are not the same.
     * college = "Red River College", collegeOfOrigin = "BIT College"
     * Expected: false
     * Actual: false
     */
    public static void isInside_GraduateApplicant_false()
    {
        GraduateApplicant applicant = new GraduateApplicant("Kenny", "Red River College", "BIT College");
        boolean expected = false;
        boolean actual = applicant.isInside();
        System.out.printf("Expected: %s\nActual: %s\n\n", expected, actual);
    }                                

    /**
     * registerForProgram(String) : String
     * Test #1 - Returns a String indicating the college of origin, college and program name.
     * collegeOfOrigin = "Red River College", college = "Red River College", program = "Computer Science"
     * Expected: Red River College > Red River College - Computer Science
     * Actual: Red River College > Red River College - Computer Science
     */
    public static void registerForProgram_GraduateApplicant_program()
    {
        GraduateApplicant applicant = new GraduateApplicant("Kenny", "Red River College", "Red River College");
        String expectedProgram = "Computer Science";
        String expected = "Red River College > Red River College - Computer Science";
        String actual = applicant.registerForProgram(expectedProgram);
        System.out.printf("Expected: %s\nActual: %s\n\n", expected, actual);
    }

    /**
     * toString() : String
     * Test #1 - Returns the correct String representation.
     * name = "Kenny", college = "BIT College", program = "BIT"
     * Expected: Graduate Applicant: Kenny - BIT College [BIT]
     * Actual: Graduate Applicant: Kenny - BIT College [BIT]
     */
    public static void toString_GraduateApplicant_string()
    {
        GraduateApplicant applicant = new GraduateApplicant("Kenny", "BIT College", "BIT");
        String expected = "Graduate Applicant: Kenny - BIT College [BIT]";
        String actual = applicant.toString();
        System.out.printf("Expected: %s\nActual: %s\n\n", expected, actual);
    }


}
