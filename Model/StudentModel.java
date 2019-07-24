package Model ;
import Entities.*;
import java.util.ArrayList;

public class StudentModel
{
    public ArrayList<Student> stu;

    public StudentModel()  {  createStudent(); }

    //create an ArrayList of all students information
    private void createStudent() { stu = Data.getInstance().getStudents(); }

    //return a specific student name
    public Student returnStudent(String name) 
    {
        for (int i = 0; i < 4; i++)
        {
            if (stu.get(i).getFirstName().equals(name)) return stu.get(i);
        }
        
        return null;
    }
   
    public Student getStudent(int i) { return stu.get(i); }

    //return a string[][] object for all the students names
    public String[][] getStuNames() 
    {
        String[][] names = new String[7][2];
        for (int i = 0; i < 4; i++) {
            names[i] = new String[2];
            names[i][0] = stu.get(i).getFirstName();
            names[i][1] = stu.get(i).getLastName();
        }
        return names;
    }

    //return the last name of student by his private name
    public String getLastNameByName (String name)
    {
        for (int i = 0; i < 4; i++) {
            if (stu.get(i).getFirstName().equals(name))
                return stu.get(i).getLastName();

        }
        return null;
    }
}
