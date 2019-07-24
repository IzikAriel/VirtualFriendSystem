package MyTests;
import Model.LecturerModel;
import junit.framework.TestCase;

public class LecturerModelTest extends TestCase {

	
   public void testgetLecNames() {
        LecturerModel lec = new LecturerModel();
        String[][] str = lec.getLecNames();
        for(int i=0;i<7;i++){
           if( str[i][0].isEmpty())
               assertTrue(false);
           if( str[i][1].isEmpty())
               assertTrue(false);
        }
    }
	
	
	
	
}
