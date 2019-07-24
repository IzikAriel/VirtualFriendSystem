package Model ;
import Entities.*;

public class VirtualModel
{
    public ComputerScience cs;

    public VirtualModel(){ cs=new ComputerScience(); }
    
    //calculating and returning the virtual average for the student
    public double getAvg(int[] virtual)
    {
        float temp = 0,d;
        float credits = 0;

        for(int i = 0; i< 40; i++)
        {
            if(virtual[i] != 0)
            {
                temp +=  cs.getCourses(i).getCredits() * virtual[i];
                credits += cs.getCourses(i).getCredits();
            }
        }
        d = temp/credits;
        return d;
    }
}
