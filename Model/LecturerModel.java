package Model ;
import Entities.*;

import java.util.ArrayList;

public class LecturerModel
{
    public ArrayList<Lecturer> lec;

    //setting all the lecturers objects to an ArrayList object
    public LecturerModel() { lec = Data.getInstance().getLac(); }
    
    //getting all the lecturers names
    public String[][] getLecNames()
    {
        String[][] names= new String[7][2];
        for(int i=0;i<7;i++) 
        {
            names[i] = new String[2];
            names[i][0] = lec.get(i).getFirstName();
            names[i][1] = lec.get(i).getLastName();
        }
        return names;
    }

    //making the first name string and the last name string into one string
    public String[] bulidLecName()
    {
    String lecNames [][]= getLecNames();
    String temp []= new String[7];
        for (int i = 0; i < 7; i++) 
        {
            temp[i] = lecNames[i][0] + " " + lecNames[i][1];
        }
            return temp;
    }

    //returning specific lecturer
    public Lecturer getLec(int i){  return lec.get(i); }
}
