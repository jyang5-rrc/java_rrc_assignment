/**
 * Name:Jiajia Yang
 * Program:Business Information Technology
 * Course:ADEV-1008 Programming 1
 * Created:2022-11-25
 * Updated:2022-11-26
 */

/**
 * Module6 This program encapsulates the student grades in a class.
 * 
 * @author  Jiajia Yang
 * @version 1.0
 */

 /*
  * StudentGrades
  - grades : int[]
  -----------------
  + StudentGrades(numberOfStudents : int)
  + StudentGrades(grades : int[])
  - copyArray(toCopy : int[]) : int[]
  + getGrades() : int[]
  + setGrades(grades : int[]) : void
  + getScoreGrade() : int[]
  + getHighestGrade() : int
  + getAverageGrade() : double
  + toString() : String
  */

/**
 * a class that encapsulates the student grades in a class
 */
public class StudentGrades
{
  // instance int array variables grades, The grades for each student.
  private int[] grades;
  
  /**
   * Initializes a new instance of the StudentGrades class with the specified number of students.
   * Each student is assigned a grade of 0.
   * 
   * @param numberOfStudents The njumber of students.
   */
  public StudentGrades(int numberOfStudents)
  {
    grades = new int[numberOfStudents];
    //Each student is assigned a grade of 0.
    for (int i = 0; i < grades.length; i++)
    {
      grades[i] = 0;
    }

  }

  /**
   *  Initializes a new instance of the StudentGrades class with the specified student grades.
   *  Progamming Requirement : Ensure that the state of the instance is set to a copy of the array passed 
   *  to this method to avoid having references to the array outside of the instance.
   * 
   * @param grades The grades for each student.
   */
  public StudentGrades(int[] grades)
  {
    this.grades = copyArray(grades);//invoke copyArray method

  }

  /**
   * Return a copy of the soecified array.
   * 
   * @param toCopy The array of percentage values to be copied.
   * @return A copy of the specified array.
   */
  private int[] copyArray(int[] toCopy)
  {
    int[] copy = new int[toCopy.length];
    for(int i = 0; i < toCopy.length; i++)
    {
      copy[i] = toCopy[i];
    }
    return copy;
  }

  /**
   * Return a copy of the grades array.
   * 
   * @return A copy of the grades array.
   */
  public int[] getGrades()
  {
    //return a copy of the grades array
    return copyArray(grades);
  }


  /**
   * Sets the grades.
   * Programming Requirement : Ensure that the state of the instance is set to a copy of the array passed 
   * to this method to avoid having references to the arry outside of the instance.
   * 
   * @param grades The grades for each student.
   */
  public void setGrades(int[] grades)
  {
    this.grades = copyArray(grades);
  }

  /**
   * Returns a new array containing the values of the grades attribute sorted in ascending order.
   * 
   * 
   * @return A new array containing the values of the grades attribute sorted in ascending order.
   */
  public int[] getSortedGrades()
  {
    int higherGrade;
    int[] sortedGrades = copyArray(grades);
    for(int i = 0; i < sortedGrades.length; i++)//Change the grades order until the first grade is the lowest one.
    {
      for(int j = i + 1; j < sortedGrades.length; j++)//compare one grade with the rest grades.
      {
        if(sortedGrades[i] > sortedGrades[j])//if the fixed i grade is higher than the following grades, change the order.
        {
          higherGrade = sortedGrades[i];
          sortedGrades[i] = sortedGrades[j];
          sortedGrades[j] = higherGrade;
        }
      }
    }
    return sortedGrades;

  } 

  /**
   * Return the value of the highest grade.
   * 
   * @return The value of the highest grade.
   */
  public int getHighestGrade()
  {
    int highestGrade = grades[0];
    for(int i = 1; i< grades.length; i++)
    {
      if(this.grades[i] > highestGrade)
      {
        highestGrade = grades[i];
      }
    }
    return highestGrade;
  }

  /**
   * Return the average grade.
   * Formula: (grades[0]+grades[1]+...grades[n])/number of elements in array
   * 
   * @return The average grade.
   */
  public double getAverageGrade()
  {
    int sum = 0;
    int numberOfGrades = grades.length;
    double averageGrade;
    for(int i = 0; i < numberOfGrades; i++)
    {
      sum += grades[i];
    }
    averageGrade = (double)sum / (double)numberOfGrades;
    return averageGrade;
  }

  /**
   * Returns the String representation of the class.
   * 
   * @return The String representation of the class.
   */
  public String toString()
  {
    String format = "";
    int index = 0;
    String format1 = String.format("\n====================\nStudent        Grade\n====================\n");
    String str = "%d                 %d\n";
    for(int i = 0; i < grades.length; i++)
    {
      index++;
      format = format + String.format(str, index, grades[i]);
    }
    return format1 + format;
  }


}