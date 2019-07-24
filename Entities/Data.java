package Entities;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Data {

    static private Data db;
    private Data() {}

    //singleton design pattern
    public static Data getInstance()
    {
        if (db == null) { db = new Data(); }
        return db;
    }

    //building and returning the student list from the students file
    public ArrayList<Student> getStudents() 
    {
        ArrayList<Student> stu = new ArrayList<Student>();
        try {

            BufferedReader dbStudent = new BufferedReader(new InputStreamReader(new FileInputStream(new File(Scoop.rec("studentInfo.txt"))), "ISO8859_8"));
            File f = new File(Scoop.rec("stugrade.txt"));
            Scanner scan = new Scanner(f);
            for (int i = 0; i < 4; i++) {
                stu.add(new Student(dbStudent, scan));
            }
            dbStudent.close();
            scan.close();
        } catch (Exception e) {
        }
        return stu;
    }

    //building and returning the password list from the passwords file
    public String[] getPass() {
       String[] pass = new String[5];
        try {
            int i = 0;
            @SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(Scoop.rec("passwords.txt")), "ISO8859_8"));
            if (reader.ready())

                while (reader.ready()) {
                    pass[i] = reader.readLine();
                    i++;
                }
        } catch (Exception e) {
        }
        return  pass;
    }
    
    //building and returning the lecturer list from the lecturers file
    public ArrayList<Lecturer> getLac()
    {
        ArrayList<Lecturer> lec = new ArrayList<Lecturer>();
        try {
            BufferedReader dbLectuer = new BufferedReader(new InputStreamReader(new FileInputStream(new File(Scoop.rec("lecturerInfo.txt"))), "ISO8859_8"));
            for (int i = 0; i < 7; i++)
            {
                lec.add(new Lecturer(dbLectuer));
            }
        } catch (Exception e) { }
       return lec ;
    }
}