package View ;
import Entities.*;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class StudentView extends PanelView
{
    public Choice stuInfo;
    private JLabel label1, background;
    public JTextArea textf;

    public StudentView(Student user)
    {
        super(user);
        initialization();
    }

    public Choice getStuInfo() {return stuInfo; }

    private void initialization()
    {
        stuInfo = new Choice();
        stuInfo.setBounds(400,200,200,30);
        stuInfo.setFont(new Font("Arial", Font.BOLD, 20));
        label1 = new JLabel("Choose Student");
        label1.setBounds(150,180,250,65);
        label1.setFont(new Font("Arial", Font.BOLD, 25));
        label1.setVisible(true);
        label1.setForeground(Color.white);
        background=new JLabel(new ImageIcon(Scoop.rec("notmainpanelbg.jpg")));
        background.setBounds(-100,-100,1200,700);
        add(label1);
        add(stuInfo);
        add(background);
    }

    //add new table for each chosen user from list
    public void addnewtable(Student stu)
    {
        textf = new JTextArea();
        textf.setEditable(false);
        textf.setText(textf.getText() + "First name: "  + stu.getFirstName() +"\n");
        textf.setText(textf.getText() + "Last name: " + stu.getLastName() +"\n");
        textf.setText(textf.getText() + "Age: " + stu.getAge() +"\n");
        textf.setText(textf.getText() + "City: " + stu.getAddress() +"\n");
        textf.setText(textf.getText()  + "Mail: " + stu.getEmail() +"\n");
        textf.setText(textf.getText() + "Phone number: " + stu.getPhone() +"\n");
        textf.setText(textf.getText() + "Study starting Year: " + stu.getStartYear() +"\n");
        textf.setText(textf.getText() + "Study ending year: " + stu.getEndYear() +"\n");
        textf.setText(textf.getText() + "Learning for degree " + stu.getDegree() +"\n");
        textf.setFont(new Font("Arial", Font.BOLD, 25));
        textf.setBounds(300,250,450,300);
        textf.setVisible(true);
        textf.getAutoscrolls();
        add(textf);
        add(background);
    }
}
