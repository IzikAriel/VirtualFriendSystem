package Model ;
import Entities.*;

import java.util.ArrayList;

public class OpenModel  {

   public String pass[];
   public ArrayList<Student> stu;

   public OpenModel()
   {
      initialization();
   }

   //getting the list of students information including password
   public void initialization()
   {
      pass=  Data.getInstance().getPass();
      stu = Data.getInstance().getStudents();
   }
}