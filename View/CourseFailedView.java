package View;

import Entities.*;
@SuppressWarnings("serial")
public class CourseFailedView extends GradeView 
{
    public CourseFailedView(Student user)
    {
        super(user);
        super.title.setText("Failed Courses");
        super.title.setBounds(360, -80, 300, 240);
    }
    
    //setting the failed courses panel by courses grade that below 60
    @Override    
    public void update(Course co[])
    {
        for (int i = 0; i < 20; i++) 
        {
            if (stu.getGrade(i) < 60 && stu.getGrade(i)!=0 )
                grades1.setText(grades1.getText() + co[i].getName() + "  :  " + stu.getGrade(i) + " \n ");
        }
        
        for (int i = 20; i < 40; i++)
        {
            if (stu.getGrade(i) < 60 && stu.getGrade(i)!=0 )
                grades2.setText(grades2.getText() + co[i].getName() + "  :  " + stu.getGrade(i) + " \n ");
        }
        add(background);
        setVisible(true);
    }
}
