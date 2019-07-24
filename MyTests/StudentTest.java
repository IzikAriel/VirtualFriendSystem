package MyTests;
import java.util.ArrayList;
import Entities.*;
import junit.framework.TestCase;

public class StudentTest extends TestCase {
	
	 public Data data ;
	 @Override
     public void setUp()
	    { 
		 data = Data.getInstance();
	       
	    }
	

   
   public void testgetAvg() {
        ArrayList<Student> s = data.getStudents();
        for (int i = 0; i < 4; i++) {
            if (100 < s.get(i).getAvg() || 0 > s.get(i).getAvg())
                assertTrue(false);
        }
    }

    
     public void testgetStartYear() {
        ArrayList<Student> s = data.getStudents();
        for (int i = 0; i < 4; i++) {
            if (2020 < s.get(i).getStartYear() || 1990 > s.get(i).getStartYear())
                assertTrue(false);
        }
    }

    
     public void testgetEndYear() {
        ArrayList<Student> s = data.getStudents();
        for (int i = 0; i < 4; i++) {
            if (2030 < s.get(i).getEndYear() || 1990 > s.get(i).getEndYear())
                assertTrue(false);
        }
    }

    
     public void testgetDegree() {
        ArrayList<Student> s = data.getStudents();
        String str;
        for (int i = 0; i < 4; i++) {
            str = s.get(i).getDegree();
            if (!(str.equals("מדעי המחשב")))
                assertTrue(false);
        }
    }

    
     public void creditsLeft() {
        ArrayList<Student> s = data.getStudents();
        for (int i = 0; i < 4; i++) {
            if (200 < s.get(i).CreditsLeft() || 0 > s.get(i).CreditsLeft())
                assertTrue(false);
        }
    }

   
   public void testgetGrades() {
        ArrayList<Student> s = data.getStudents();
        int y;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 40; j++) {
                y = s.get(i).getGrade(i);
                if (100 < y || 0 > y)
                    assertTrue(false);
            }

        }
    }

    
    public void testgetYesrsOfStudy() {
        ArrayList<Student> s = data.getStudents();
        for (int i = 0; i < 4; i++) {
            if (100 < s.get(i).getAvg() || 0 > s.get(i).getAvg())
                assertTrue(false);
        }
    }

    
    public void testgetGrade() {
        ArrayList<Student> s = data.getStudents();
        for (int i = 0; i < 4; i++) {
            if (100 < s.get(i).getAvg() || 0 > s.get(i).getAvg())
                assertTrue(false);
        }
    }

   
   public void testgetCredits() {
        ArrayList<Student> s = data.getStudents();
        for (int i = 0; i < 4; i++) {
            if (0 > s.get(i).getYesrsOfStudy() || s.get(i).getYesrsOfStudy() > 10)
                assertTrue(false);

        }
    }
}
