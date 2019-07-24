package Entities;
import java.io.BufferedReader;


public class Lecturer extends Person
{
    private int[] course_Flag_Array;
    private String review;
    private int rate;
    private String temp;
    private String title;

    //building and returning a lecturer object
    public Lecturer(BufferedReader s) {
        super(s);
        course_Flag_Array = new int[40];
        try {
            review = s.readLine();
            temp = s.readLine();
            rate =  Integer.parseInt(temp);
            title = s.readLine();
        }
        catch (Exception e){}
    }
    
    public String getReview(){  return review;  }
    public int getRate(){   return rate;  }
    public String getTitle(){ return title;  }
    
    //array of flags for courses which points which courses the specific lecturer is teaching
    public int[] getCourse_Flag_Array(){  return course_Flag_Array;  }
}
