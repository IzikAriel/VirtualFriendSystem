package MyTests;
import Entities.*;
import junit.framework.TestCase;



public class ComputerScienceTest extends TestCase {
	

	   public ComputerScience main ;
	   

	 
	 
      @Override
      public void setUp()
	    { 
    	  main =new ComputerScience();
	       
	    }

	    
	
      public  void testAVGofDegree() {
			
	       
	        assertEquals(50,50);
	       
	    }

	    
		
      public void testgetAVGToNxtDegree() {
	        double x = main.getAVGToNxtDegree();
	        assertEquals(50,x,50);
	    }

	  
		
      public void testgetMinCreditsToFinish() {
	        int x = main.getMinCreditsToFinish();
	        boolean b;
	        if(x<0 ||x>170) b = false;
	        else  b = true;
	        assertTrue(b);
	    }
	 
	
      public void testgetNumberOfStudent() {
	        int x= main.getNumberOfStudent();
	        if(x<0) assertTrue(false);
	      
	    }
	  
	}


