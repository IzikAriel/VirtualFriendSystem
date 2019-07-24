package Entities;
import java.io.*;


public class Scoop 
{
	//sorting the courses to categories
   public String whatField(int i)
    {
        if (i < 6) return " math";
        if (i < 23) return "computer";
        if (i < 26) return "English";
        return "General";
    }

   public static String toString(int i)
   {
       String s[]= ComputerScience.createCoursesNamesArr();
       return s[i];
   }

   //making a global path to the files
   public static String rec(String p)
    {
        String temp= "src//recours//" + p ;
        return  new File(temp).getAbsolutePath();
    }
}

