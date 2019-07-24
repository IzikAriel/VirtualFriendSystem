package Model ;
import Entities.*;

public class CourseModel 
{
    private ComputerScience cs ;
    public String courseArr[];
    public int numOfCourse;
    
    public CourseModel()
    {  
        cs = new ComputerScience();
        courseArr = cs.getCourseArr();
    }
    
    //get the names of the courses
    public String[] getCourseArr(){return courseArr;}
    
    //get the object from the course array
    public Course getCoursesOfCsArray(int i){return cs.getCourses(i);}
    
    //get the entire array of courses objects
    public Course[] getCoursesOfCsArray(){return cs.getCourses();}
    
    //get a specific course by name
    public Course getCourseByName(String name)
    {
        Course co[]= getCoursesOfCsArray( );
        for(int j =0; j<40 ; j++)
        {
            if(name.equals(co[j].getName()) == true)  return co[j];
        }
        return null;
    }
}
