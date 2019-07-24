package MyTests;

import java.util.ArrayList;

import Entities.*;

import junit.framework.TestCase;

public class LecturerTest extends TestCase {

	   public Data d ;
	
	 @Override
     public void setUp()
	    { 
		 d = Data.getInstance();
	       
	    }

	   
   public void testgetFirstName() {
        ArrayList<Student> x = d.getStudents();
        for(int i =0;i<4;i++){
            String temp = x.get(i).getFirstName();
            assertFalse(temp.isEmpty());

        }
    }

  
   public void getLastName() {
        ArrayList<Student> x = d.getStudents();
        for(int i =0;i<4;i++){
            String temp = x.get(i).getLastName();
            assertFalse(temp.isEmpty());

        }
    }


   
   public void getAge() {
        ArrayList<Student> x = d.getStudents();
        for(int i =0;i<4;i++){
            double temp = x.get(i).getAvg();
            if(temp >100 || temp< 0 )assertFalse(true);

        }

    }

  
   public void getID() {
        ArrayList<Student> x = d.getStudents();
        for(int i =0;i<4;i++){
            String temp = x.get(i).getID();
            assertFalse(temp.isEmpty());

        }
    }

    
  public void getAddress() {
        ArrayList<Student> x = d.getStudents();
        for(int i =0;i<4;i++){
            String temp = x.get(i).getAddress();
            assertFalse(temp.isEmpty());

        }

    }

    
     public void getEmail() {
        ArrayList<Student> x = d.getStudents();
        for(int i =0;i<4;i++){
            String temp = x.get(i).getEmail();
            assertFalse(temp.isEmpty());

        }
    }

   
   public void getPhone() {
        ArrayList<Student> x = d.getStudents();
        for(int i =0;i<4;i++){
            String temp = x.get(i).getPhone();
            assertFalse(temp.isEmpty());

        }
    }
}
