package MyTests;

import junit.framework.TestCase;
import Entities.Course;
import Model.CourseModel;

public class CourseModelTest extends TestCase {
	
	
	 public CourseModel cm = new CourseModel();

	 
	 
	 @Override
     public void setUp()
	    { 
		 cm = new CourseModel();
	       
	    }

   
	 public void testgetCourseArr() {
        String[] car = cm.getCourseArr();
        for(int i=0;i<40;i++){
       
        	 if(car[0].isEmpty()) assertTrue(false);
        }
      
    }

    
    
    
	 public void testgetCourseByname() {
        
        Course temp;
        temp = cm.getCourseByName("בדידה");
        if(!(temp.getName().equals("בדידה")))
            assertTrue(false);

        temp = cm.getCourseByName("אינפיניטסימלי 2");
        if(!(temp.getName().equals("אינפיניטסימלי 2")))
            assertTrue(false);

        temp = cm.getCourseByName("אנגלית א");
        if(!(temp.getName().equals("אנגלית א")))
            assertTrue(false);

        temp = cm.getCourseByName("אוטומטים");
        if(!(temp.getName().equals("אוטומטים")))
            assertTrue(false);

        temp = cm.getCourseByName("אנגלית ד");
        if(!(temp.getName().equals("אנגלית ד")))
            assertTrue(false);

        temp = cm.getCourseByName("קורס לא קיים");
        if(temp != null)
            assertTrue(false);
        temp = cm.getCourseByName("שגיאה");
        if(temp != null)
            assertTrue(false);

    }
    
    
  
}


