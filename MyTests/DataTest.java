package MyTests;
import java.util.ArrayList;

import Entities.*;
import junit.framework.TestCase;

public class DataTest extends TestCase {

	

	    
  public void testgetInstance() {
        Data first = Data.getInstance();
        Data sec = Data.getInstance();
        assertEquals(first,sec);

    }

    
   public void testetLec(){
        Data main = Data.getInstance();
        int r;
        ArrayList<Lecturer> lec = main.getLac();

        for(int i=0;i< 4;i++){
            r = lec.get(i).getRate();
            if(r>10 || r<0) assertTrue(false);
        }
    }

    
     public void testgetStudents() {
        Data main = Data.getInstance();
        int x;
        ArrayList<Student> stu = main.getStudents();
        for(int i= 0;i<4;i++){
            for(int j = 0;j<40;j++){
               x= stu.get(i).getGrade(i);
                if (x<0 ||x>100) assertTrue(false);
            }
            x = stu.get(i).getCredits();
            if (x<0 ||x>200) assertTrue(false);
            x = (int)stu.get(i).getAvg();
            if (x<0 ||x>100) assertTrue(false);
            x = stu.get(i).getEndYear();
            if (x<1900 ||x>2400) assertTrue(false);
            x = stu.get(i).getStartYear();
            if (x<1900 ||x>2400) assertTrue(false);
            x = stu.get(i).getYesrsOfStudy();
            if (x<0 ||x>20) assertTrue(false);
        }
    }

}
