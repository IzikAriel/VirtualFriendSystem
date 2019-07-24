package Entities;
import Entities.Scoop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ComputerScience extends Degree
{
    public int AVGToNxtDegree = 85;
    public int minCreditsToFinish;
    public  static  Course[] coursesOfCsArray;
    public long[] lecturesIDArray;
    public int numberOfStudent = 350;
    public Person headOfFaculty;
    public  static String  courseArr[]=new String[40];

    public ComputerScience()
    {
        createCourseArr();
        createCoursesNamesArr();
    }

    public double AVGofDegree() { return 1; }

    public int getAVGToNxtDegree() {    return AVGToNxtDegree; }

    public int getMinCreditsToFinish() { return minCreditsToFinish; }

    public long getLecturesIDArray() { return 1; }

    public int getNumberOfStudent() {  return numberOfStudent; }

    public Person getHeadOfFaculty() {  return headOfFaculty; }

    public Course getCourses(int i) { return coursesOfCsArray[i]; }

    public Course[] getCourses() {   return coursesOfCsArray; }

    //creating the course name list that the student has accomplished 
    public static String [] createCoursesNamesArr()
    {
        try {
        	
            for(int i =0 ; i< 40 ; i++)
            {
                courseArr[i]= coursesOfCsArray[i].getName();

            }
        }
        catch (Exception e){   }
        return courseArr ;
    }
    
    public String[] getCourseArr()  { return courseArr; }
    
    //creating the course list that the student has accomplished 
    private void createCourseArr() {
        coursesOfCsArray = new Course[40];
        int i = 0;
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(Scoop.rec("courseinfo.txt"))), "ISO8859_8"));
            for (i = 0; i < 40; i++)
            {
                coursesOfCsArray[i] = new Course(reader);
            }
        }
        catch (Exception e) {   }
    }
}