/**
 * This class represents an undergraduate applicant to a college.
 * Module 7 Assignment
 * 
 * @author  Jiajia Yang
 * Date     2022-12-08
 * @version 1.0
 */
 
/**
 * UndergraduateApplicant class
 * ----------------------------
 * - standardAptitudeTestScore : double
 * - gradePointAverage : double
 * + UndergraduateApplicant(name : String, college : String, standardAptitudeTestScore : double, gradePointAverage : double)
 * + getStandardAptitudeTestScore() : double
 * + setStandardAptitudeTestScore(score : double) : void
 * + getGradePointAverage() : double
 * + setGradePointAverage(gradePointAverage : double) : void
 * + registerForProgram(program : String) : String
 * + toString() : String
 */

public class UndergraduateApplicant extends CollegeApplicant
{
    //The score achieved on the standard aptitude test. Allowable values: 0.0 - 500.0 inclusive. If this field is set outside the allowable range, set the state to 0 (zero).
    private double standardAptitudeTestScore;
    //The applicants grade point average. Allowable values: 0.00 - 4.50 inclusive. If this field is set outside the allowable range, set the state to 0 (zero).
    private double gradePointAverage;

    /**
     * Initializes an instance of the UndergraduateApplicant class
     *  with a specified name, college, standard aptitude test score, and grade point average.
     * 
     * @param name The name of the college applicant.
     * @param college The name of the college.
     * @param standardAptitudeTestScore The score achieved on the standard aptitude test.
     * @param gradePointAverage The applicants grade point average.
     */
    public UndergraduateApplicant(String name, String college, double standardAptitudeTestScore, double gradePointAverage)
    {
        super(name, college);
        this.setStandardAptitudeTestScore(standardAptitudeTestScore);
        this.setGradePointAverage(gradePointAverage);
    }

    /**
     * Returns the standard aptitude test score.
     * 
     * @return The standard aptitude test score.
     */
    public double getStandardAptitudeTestScore()
    {
        return this.standardAptitudeTestScore;
    }

    /**
     * Sets the standard aptitude test score.
     * 
     * @param standardAptitudeTestScore The score achieved on the standard aptitude test.
     */
    public void setStandardAptitudeTestScore(double standardAptitudeTestScore)
    {
        this.standardAptitudeTestScore = getAllowableStandardAptitudeTestScore(standardAptitudeTestScore);
    }

    /**
     * Returns the grade point average.
     * 
     * @return The grade point average.
     */
    public double getGradePointAverage()
    {
        return this.gradePointAverage;
    }

    /**
     * Sets the grade point average.
     * 
     * @param gradePointAverage The applicants grade point average.
     */
    public void setGradePointAverage(double gradePointAverage)
    {
        this.gradePointAverage = getAllowableGradePointAverage(gradePointAverage);
    }

    /**
     *  Returns a String representing the registration of a program.
     * college name - program name [aptitude test score]
     * 
     * @param program The name of the program the college applicant is registering for.
     * @return The string indicating the program the applicant registered for.
     */
    @Override
    public String registerForProgram(String program)
    {
        String template = "%s - %s [%f]\n";
        return String.format(template, this.getCollege(), program, this.getStandardAptitudeTestScore());
    }

    /**
     * Returns a String representation of the class.
     * Undergraduate Applicant ** {name} - {college}, SAT: {standardAptitudeTest}, GPA: {gradePointAverage}
     * 
     * @return The String representation of the class.
     */
    @Override
    public String toString()
    {
        String template = "Undergraduate Applicant ** %s, SAT: %f, GPA: %f\n";
        return String.format(template, super.toString(), this.getStandardAptitudeTestScore(), this.getGradePointAverage());
    }

    /**
     * Returns the allowable value of standard aptitude test score. 
     * 
     * @param standardAptitudeTestScore The score achieved on the standard aptitude test.
     * @return The allowable value of standard aptitude test score.
     */
    private double getAllowableStandardAptitudeTestScore(double standardAptitudeTestScore)
    {
        if (standardAptitudeTestScore >= 0.0 && standardAptitudeTestScore <= 500.0)
        {
            return standardAptitudeTestScore;
        }
        else
        {
            return 0.0;
        }
    }

    /**
     * Returns the allowable value of grade point average. 
     * 
     * @param gradePointAverage The applicants grade point average.
     * @return The allowable value of grade point average.
     */
    private double getAllowableGradePointAverage(double gradePointAverage)
    {
        if (gradePointAverage >= 0.0 && gradePointAverage <= 4.5)
        {
            return gradePointAverage;
        }
        else
        {
            return 0.0;
        }
    }

}