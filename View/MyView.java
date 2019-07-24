package View;
import javax.swing.*;
import Entities.*;
import java.awt.*;

@SuppressWarnings("serial")
public class MyView extends JFrame
{
    public Student user;
    public OpenView openPanel ;
    public LecturerView lecPanel;
    public UrlView urlPanel;
    public StudentView stuPanel;
    public AboutView aboutPanel;
    public MainView mainPanel;
    public CourseView coursePanel;
    public GradeView gradePanel;
    public VirtualView virtualPanel;
    public CourseFailedView FailsPanel;
    public MyDetailsView myDetailsPanel;
    public JButton prev;

    public MyView ()
    {
        super();
        initialization();
    }
   
    //creating the main frame for the system
    public void initialization()
    {
         setSize(1000, 600);
         setTitle("Virtual Friend");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         prev = new JButton();
         prev.setFont(new Font("Arial", Font.BOLD, 19));
         prev.setText("Back");
         prev.setForeground(Color.WHITE);
         prev.setBackground(Color.darkGray);
         prev.setBounds(880, 20, 90, 50);
         setBackground(Color.pink);

         setResizable(false);
         setVisible(true);
     }
}