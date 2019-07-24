package MyTests;
import Entities.*;
import junit.framework.TestCase;



public class CourseTest extends TestCase {

	public ComputerScience cs;
	public Course main ;
	    
	    
	    @Override
	      public void setUp()
		    { 
	    	cs = new ComputerScience();
	    	main = cs.getCourses(0);
		       
		    }


	    
	    public void testgetCredits() {

	        for(int i =0;i<40;i++){
	            main = cs.getCourses(i);
	            int x = main.getCredits();
	            if (x<0 || x>20) assertTrue(false);

	        }

	    }

	
	    public void testgetDemandLevel() {
	        for(int i =0;i<40;i++){
	            main = cs.getCourses(i);
	            int x = main.getDemandLevel();
	            if (x<0 || x>10) assertTrue(false);

	        }
	    }

	    
	     public void testgetDifficultyLevel() {
	        for(int i =0;i<40;i++){
	            main = cs.getCourses(i);
	            int x = main.getDifficultyLevel();
	            if (x<0 || x>10) assertTrue(false);

	        }
	    }

	   
	     public void testgetAVG() {
	        for(int i =0;i<40;i++){
	            main = cs.getCourses(i);
	            int x = main.getAVG();
	            if (x<0 || x>100) assertTrue(false);

	        }
	    }

	}
	
	
	

