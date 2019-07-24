package Entities;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

//student entity with simple get and set
public class Student extends Person 
{
    private	int startStudyYear,temp;
    private	int endStudyYear;
    private String degree;
    private	int gradesArray[];
    private	int credits;
    int i = 0;
    ComputerScience cs ;
    
    public Student(BufferedReader s, Scanner scan)
    {
        super(s);
        cs = new ComputerScience();

        gradesArray= new int[40] ;
        try {
            startStudyYear = Integer.parseInt(s.readLine());
            endStudyYear = Integer.parseInt(s.readLine());
            degree = s.readLine();
            for (i=0;i<40;i++){
                temp = scan.nextInt();
                gradesArray[i] = temp;
            }
        }
        catch (Exception e){  }
    }
    public double getAvg()
    {
        int temp = 0 ;
        credits =0 ;
        for(int i = 0; i< 40; i++)
        {

            if(gradesArray[i] != 0)
            {
                temp +=  cs.getCourses(i).getCredits() * gradesArray[i];
                credits += cs.getCourses(i).getCredits();
            }
        }

        return temp/credits;
    }
    public ArrayList<Integer> FailedCourses()
    {
        ArrayList<Integer> failed= new ArrayList<>();
        for(int g : gradesArray  )
        {
            if (gradesArray[g] < 60)
                failed.add(g);
        }

        return failed ;
    }
    public  int getStartYear() {return startStudyYear ; }
    public  int getEndYear() { return endStudyYear ;   }
    public String getDegree() {return degree;    }
    public int CreditsLeft() { return cs.getMinCreditsToFinish() - credits ; }
    public   int[] getGrades(){return gradesArray ; }
    public   int getYesrsOfStudy(){  return endStudyYear - startStudyYear ;}
    public int getGrade(int i ){return gradesArray[i]; }
    public int getCredits()
    { return credits ; }
}