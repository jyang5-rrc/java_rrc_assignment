/**
 * This class represents a graduate applicant to a college.
 * Module 7 Assignment
 * 
 * @author  Jiajia Yang
 * CreateDate     2022-12-08
 * Updated  2022-12-11
 * @version 2.0
 */

/**
 * GraduateApplicant class
 ------------------------
 * - collegeOfOrigin: String
 * + GraduateApplicant(name : String, collegeOfOrigin : String)
 * + getCollegeOfOrigin() : String
 * + setCollegeOfOrigin(collegeOfOrigin : String) : void
 * + isInside() : boolean
 * + registerForProgram(program : String) : String
 * + toString() : String
 */

public class GraduateApplicant extends CollegeApplicant
{
    private String collegeOfOrigin;//The name of the college where the graduate applicant received their degree.

    /**
     * Initializes an instance of the GraduateApplicant class
     *  with a specified name, college name, and college of origin.
     * 
     * @param name The name of the graduate applicant.
     * @param college The name of the college.
     * @param collegeOfOrigin The name of the college where the graduate applicant received their degree.
     */
    public GraduateApplicant(String name, String college, String collegeOfOrigin)
    {
        super(name, college);
        this.setCollegeOfOrigin(collegeOfOrigin);
    }

    /**
     * Returns the college of origin.
     * 
     * @return Returns the college of origin.
     */
    public String getCollegeOfOrigin()
    {
        return this.collegeOfOrigin;
    }

    /**
     * Sets the college of origin.
     * 
     * @param collegeOfOrigin The name of the college where the graduate applicant received their degree.
     */
    public void setCollegeOfOrigin(String collegeOfOrigin)
    {
        this.collegeOfOrigin = collegeOfOrigin;
    }

    /**
     * Returns true when the college name and the college
     * of origin are the same (case should not be a factor); otherwise false.
     * 
     * @return true if the graduate applicant is an inside applicant.
     */
    public boolean isInside()
    {
        return this.getCollege().equalsIgnoreCase(this.getCollegeOfOrigin());
    }

    /**
     * Returns a String representing the registration of a program.
     * {college of origin} > college name - program name
     * 
     * @param program The name of the program the college applicant is registering for.
     * @return The String representing the registration of a program.
     */
    @Override
    public String registerForProgram(String program)
    {
        String template = "%s > %s - %s\n";
        //? return String.format(template, this.getCollegeOfOrigin(), this.isInside() ? true : this.getCollege(), program);
        return String.format(template, this.getCollegeOfOrigin(), this.getCollege(), program);
    }

    /**
     * Returns a String representation of the class.
     * Graduate Applicant: {name} - {college} [college of origin]
     * 
     * @return The string representation of the class.
     */
    @Override
    public String toString()
    {
        String template = "Graduate Applicant: %s [%s]\n";
        return String.format(template, super.toString(), this.getCollegeOfOrigin());
    }



}
