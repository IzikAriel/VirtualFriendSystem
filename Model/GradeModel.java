package Model ;
import Entities.*;

public class GradeModel
{
    private ComputerScience cs ;
    public String courseArr[];

    public GradeModel()
     {
         courseArr = new String[40];
         cs = new ComputerScience();
     }
    public Course[] getCoursesOfCsArray(){return cs.getCourses();}
}
