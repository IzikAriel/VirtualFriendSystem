package MyTests;


import Entities.*;
import Model.VirtualModel;
import junit.framework.TestCase;

public class VirtualModelTest extends TestCase {
	

	
	 public VirtualModel v ; 
	 @Override
     public void setUp()
	    { 
		 v = new VirtualModel();
	       
	    }
	    
	     public void testgetAvg() {
	        int[] grades ;
	        int oldavg,newavg;
	        Student stu = (Data.getInstance().getStudents().get(0));
	        grades = stu.getGrades();
	        oldavg = (int)stu.getAvg();
	        newavg = (int)v.getAvg(grades);
	        if(newavg > 100 || newavg<0) assertTrue(false);
	        if(oldavg != newavg ) assertTrue(false);

}
}

