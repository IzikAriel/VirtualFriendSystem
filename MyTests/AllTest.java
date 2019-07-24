package MyTests;
import java.io.IOException;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class AllTest {
	
	  public static void main(String[] args) throws IOException
	    {
		  RunTests();
	    }
	  
	  private static void RunTests()
	  {
		  new TestRunner().doRun(new TestSuite(ComputerScienceTest.class ,CourseTest.class,DataTest.class,CourseModelTest.class,LecturerModelTest.class, LecturerTest.class,StudentModelTest.class,
				  StudentTest.class,VirtualModelTest.class ));
	  }
}
