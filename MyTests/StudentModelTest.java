package MyTests;

import Entities.Student;
import Model.StudentModel;
import junit.framework.TestCase;

public class StudentModelTest extends TestCase {

	 public StudentModel stu ;
	
	 @Override
     public void setUp()
	    { 
		 stu = new StudentModel();
	       
	    }
	
   
     public void testreturnStudent() {
        Student st;
        st = stu.returnStudent("תומר");
        if(!(st.getFirstName().equals("תומר")) )
            assertTrue(false);
        if(!(st.getLastName().equals("אורמן")) )
            assertTrue(false);
        st = stu.returnStudent("דוד");
        if(!(st.getFirstName().equals("דוד")) )
            assertTrue(false);
        if(!(st.getLastName().equals("סיידון")) )
            assertTrue(false);
        st = stu.returnStudent("איציק");
        if(!(st.getFirstName().equals("איציק")) )
            assertTrue(false);
        if(!(st.getLastName().equals("אריאל")) )
            assertTrue(false);
    }

   
   public void getStudent() {
        Student student;
        for (int i = 0; i < 3; i++) {
           student =  stu.getStudent(i);
           if((student.getLastName().isEmpty()))
               assertTrue(false);
            if((student.getFirstName().isEmpty()))
                assertTrue(false);
            if((student.getDegree().isEmpty()))
                assertTrue(false);
        }
    }

   
  public void testgetStuNames() {
      
        String[][] str = stu.getStuNames();
        for(int i=0;i<3;i++){
            if( str[i][0].isEmpty())
                assertTrue(false);
            if( str[i][1].isEmpty())
                assertTrue(false);
        }

    }

    
 public void getLastNameByName() {
        String lastname;
        lastname = stu.getLastNameByName("תומר");
        if (!(lastname.equals("אורמן")))
            assertTrue(false);
        lastname = stu.getLastNameByName("דוד");
        if (!(lastname.equals("סיידון")))
            assertTrue(false);
        lastname = stu.getLastNameByName("איציק");
        if (!(lastname.equals("אריאל")))
            assertTrue(false);


    }
	
	
	
}
