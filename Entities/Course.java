package Entities;
import java.io.BufferedReader;

public class Course {

    private String name ,info;
    private int credits,demandLevel, difficultyLevel,AVG,temp;
    private Boolean isIncludeProject;

    public String getName (){ return name;}
    public   String getInfo(){return info;}
    public  int getCredits (){return credits;}
    public  int getDemandLevel (){return  demandLevel;}
    public   int getDifficultyLevel(){ return difficultyLevel;}
    public   int getAVG(){return AVG;}
    public   Boolean getIsIncludeProject(){return isIncludeProject;}

    //setting all the course data from the files
    public Course(BufferedReader reader)
    {
        try {
            name = reader.readLine();
            AVG = Integer.parseInt(reader.readLine());
            credits = Integer.parseInt(reader.readLine());
            difficultyLevel = Integer.parseInt(reader.readLine());
            demandLevel = Integer.parseInt(reader.readLine());
            temp = Integer.parseInt(reader.readLine());
            if (temp == 1) isIncludeProject = true;
            else isIncludeProject = false;
            info = reader.readLine();
        }
        catch (Exception e){}
    }

}
