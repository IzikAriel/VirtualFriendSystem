package View ;
import Entities.*;
import javax.swing.*;
import java.awt.*;


@SuppressWarnings("serial")
public class GradeView extends PanelView
{
    protected JTextArea grades1;
    protected JTextArea grades2;
    protected JLabel background, title;
    protected Student stu ;

    public GradeView(Student user)
    {
        super(user);
        stu =user;
        title = new JLabel("My Grades");
        title.setBounds(390, -80, 300, 240);
        title.setFont(new Font("Tahoma", Font.PLAIN, 40));
        title.setForeground(Color.WHITE);
        add(title);
        initialization();
    }

    public void initialization()
    {
        setSize(1000, 600);
        setLayout(null);
        setVisible(true);
        setBackground(Color.pink);
        background=new JLabel(new ImageIcon(Scoop.rec("notmainpanelbg.jpg")));
        background.setBounds(-100,-100,1200,700);


        grades1 = new JTextArea();
        grades1.setText("");
        grades1.setFont(new Font("Arial", Font.BOLD, 18));
        grades1.setBounds(120, 150, 350, 400);
        grades1.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        grades1.setEditable(false);
        grades2 = new JTextArea();
        grades2.setText("");
        grades2.setFont(new Font("Arial", Font.BOLD, 18));
        grades2.setBounds(500, 150, 350, 400);
        grades2.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        grades2.setEditable(false);

        add(grades1);
        add(grades2);

    }

    //setting the grades to the 2 tables for each course
    public void update(Course[] co)
    {

        for (int i = 0; i < 20; i++) {


            if (stu.getGrade(i) != 0)
                grades1.setText(grades1.getText() + co[i].getName() + "  :  " + stu.getGrade(i) + " \n ");

        }
        for (int i = 20; i < 40; i++) {

            if (stu.getGrade(i) != 0)
                grades2.setText(grades2.getText() + co[i].getName() + "  :  " + stu.getGrade(i) + " \n ");

        }
        add(background);
        setVisible(true);
    }
}