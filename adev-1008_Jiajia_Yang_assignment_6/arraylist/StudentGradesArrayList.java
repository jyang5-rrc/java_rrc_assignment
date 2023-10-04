import java.util.ArrayList;
import java.util.Scanner;
/**
 * Name:Jiajia Yang
 * Program:Business Information Technology
 * Course:ADEV-1008 Programming 1
 * Created:2022-11-25
 * Updated:2022-11-26
 */

/**
 * Moudle 6 This program demonstrates the use of an ArrayList to store student grades.
 * 
 * @author  Jiajia Yang
 * @version 1.0
 */
public class StudentGradesArrayList 
{
    public static void main(String[] args)
    {
        Scanner input;
        int[] grades;
        int numberOfStudents;

        //create an ArrayList to store that will store three StudentGrades objects.
        ArrayList<StudentGrades> studentGradesCollection = new ArrayList<StudentGrades>();

        //prompt the uesr for the number of students in the class.
        System.out.print("Enter the number of students in the course: ");
        input = new Scanner(System.in);
        numberOfStudents = input.nextInt();

        //Add three new StudentGrades objects to the ArrayList.The StudentGrades objects should be populated with random values from 0 to 100.
        for (int i = 0; i < 3; i++)
        {
            grades = new int[numberOfStudents];

            for(int j = 0; j < numberOfStudents; j++)
            {
                grades[j] = (int)(Math.random() * 101);//randomly generate grades from 0 to 100
            }

            studentGradesCollection.add(new StudentGrades(grades));
        
        }

        //Use the enhanced for loop to print each of the StudentGrades objects to the console.
        for (StudentGrades studentGrades : studentGradesCollection)
        {
            System.out.printf(studentGrades.toString());
        }

        //Print a line containing the following text:"LAST ELEMENT BEFORE REMOVE:".Print the value of the final element in the AarryList under the heading.
        System.out.println("\nLAST ELEMENT BEFORE REMOVE:");
        System.out.println(studentGradesCollection.get(studentGradesCollection.size() - 1));

        //Remove the final StudentGrades objects from the ArrayList.
        studentGradesCollection.remove(studentGradesCollection.size() - 1);

        //Print a line containing the following text:"LAST ELEMENT AFTER REMOVE:".Trim the ArrayList and print the value of the final element in the AarryList under the heading.
        System.out.println("\nLAST ELEMENT AFTER REMOVE:");
        studentGradesCollection.trimToSize();
        System.out.println(studentGradesCollection.get(studentGradesCollection.size() - 1));





    }
    
}
