/**
 * This class represents a college applicant.
 * Module 7 Assignment
 * 
 * @author  Jiajia Yang
 * CreateDate     2022-12-08
 * Updated  2022-12-11
 * @version 2.0
 */

/**
  * CollegeApplicant class
  ------------------------
  * - name : String
  * - college : String
  * + CollegeApplicant()
  * + CollegeApplicant(name : String, college : String)
  * + getName() : String
  * + setName(name : String) : void
  * + getCollege() : String
  * + setCollege(college : String) : void
  * + registerForProgram(program : String) : String
  * + toString() : String
  */
 public abstract class CollegeApplicant
 {
    private String name;
    private String college;

    /**
     * Initializes an instance of the CollegeApplicant class.
     */
    public CollegeApplicant()
    {
      this("unknown", "unknown");  
    }

    /**
     * Initializes an instance of the CollegeApplicant class
     *  where the name and college are set to the specified values.
     * @param name The name of the college applicant.
     * @param college The name of the college.
     */
    public CollegeApplicant(String name, String college)
    {
        this.setName(name);
        this.setCollege(college);
    }

    /**
     * Returns the college applicant’s name.
     * 
     * @return the college applicant’s name.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Sets the college applicant’s name.
     * 
     * @param name The name of the college applicant.
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Returns the name of the college.
     * 
     * @return the name of the college.
     */
    public String getCollege()
    {
        return this.college;
    }

    /**
     * Sets the name of the college.
     * 
     * @param college The name of the college.
     */
    public void setCollege(String college)
    {
        this.college = college;
    }

    /**
     * Returns a String representing the registration of a program.
     * 
     * @param program The name of the program the college applicant is registering for.
     * @return The String representing the registration of a program.
     */
    public abstract String registerForProgram(String program);

    /**
     * Returns a String representation of the class.
     * {name} - {college}
     */
    public String toString()
    {
      String str = "%s - %s";  
      return String.format(str, this.getName(), this.getCollege());
    }


 }