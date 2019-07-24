package View ;
import Entities.*;
import javax.swing.*;
import java.awt.*;

//creating the panel with information that follows the user for the entire login session
@SuppressWarnings("serial")
public abstract class PanelView extends JPanel 
{
    protected JLabel label_avg;
    protected JLabel label_stuName;

    public PanelView(Student user) 
    {
        setSize(1000, 600);
        setLayout(null);
        label_avg = new JLabel("GPA: " + user.getAvg());
        label_avg.setBackground(Color.GREEN);
        label_avg.setFont(new Font("Arial", Font.BOLD, 35));
        label_avg.setBounds(95, 13, 397, 174);
        label_avg.setForeground(Color.white);
        add(label_avg);

        label_stuName = new JLabel(user.getFirstName() + " " + user.getLastName());
        label_stuName.setBounds(700, 13, 376, 174);
        label_stuName.setBackground(Color.GREEN);
        label_stuName.setFont(new Font("Arial", Font.BOLD, 35));
        label_stuName.setForeground(Color.white);
        add(label_stuName);
        setVisible(true);
    }
}