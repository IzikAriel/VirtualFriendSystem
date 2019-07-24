package View ;
import Entities.*;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class MainView extends PanelView {

    public JLabel background,mainicon;
    public ImageIcon bgImg;
    public Popup popup;
    public JButton virtualBtn,gradeBtn,courseBtn,urlBtn,lecturerBtn,StuBtn,logOutBtn,myDetailsBtn,aboutBtn,CoursesFailedBtn;

    public MainView(Student user)
    {
        super(user);
        initialization();
    }

    //creating all the buttons in the main menu
    private void initialization()
    {
         mainicon = new JLabel(new ImageIcon(Scoop.rec("mainsupport.png")));
         mainicon.setBounds(400, 100, 200, 200);
         add(mainicon);
         setBackground(Color.orange);
         bgImg=new ImageIcon(Scoop.rec("mainpanelbg_1.jpg"));
         background=new JLabel(bgImg);
         background.setBounds(-110,0,1200,700);



         virtualBtn = new JButton("Virtual GPA");
         virtualBtn.setBounds(770, 300, 121, 46);
         virtualBtn.setIcon(new ImageIcon(Scoop.rec("buttonbg.jpg")));
         virtualBtn.setHorizontalTextPosition(JButton.CENTER);
         add(virtualBtn);


         gradeBtn = new JButton("Your Scores");
         gradeBtn.setBounds(550, 412, 121, 46);
         gradeBtn.setIcon(new ImageIcon(Scoop.rec("buttonbg.jpg")));
         gradeBtn.setHorizontalTextPosition(JButton.CENTER);
         add(gradeBtn);


         courseBtn = new JButton("Courses Info");
         courseBtn.setBounds(550, 300, 121, 46);
         courseBtn.setIcon(new ImageIcon(Scoop.rec("buttonbg.jpg")));
         courseBtn.setHorizontalTextPosition(JButton.CENTER);
         add(courseBtn);

         urlBtn = new JButton("Materials");
         urlBtn.setBounds(330, 300, 121, 46);
         urlBtn.setIcon(new ImageIcon(Scoop.rec("buttonbg.jpg")));
         urlBtn.setHorizontalTextPosition(JButton.CENTER);
         add(urlBtn);

         lecturerBtn = new JButton("Lecturers");
         lecturerBtn.setBounds(110, 300, 121, 46);
         lecturerBtn.setIcon(new ImageIcon(Scoop.rec("buttonbg.jpg")));
         lecturerBtn.setHorizontalTextPosition(JButton.CENTER);
         add(lecturerBtn);

         StuBtn = new JButton("Users List");
         StuBtn.setFont(new Font("Arial", Font.BOLD, 12));
         StuBtn.setBounds(325, 412, 127, 40);
         StuBtn.setIcon(new ImageIcon(Scoop.rec("buttonbg.jpg")));
         StuBtn.setHorizontalTextPosition(JButton.CENTER);
         add(StuBtn);

         logOutBtn = new JButton("Logout");
         logOutBtn.setBounds(850, 500, 90, 33);
         logOutBtn.setBackground(Color.red);
         logOutBtn.setForeground(Color.white);
         add(logOutBtn);

         myDetailsBtn = new JButton("My Details");
         myDetailsBtn.setBounds(770, 412, 121, 46);
         myDetailsBtn.setIcon(new ImageIcon(Scoop.rec("buttonbg.jpg")));
         myDetailsBtn.setHorizontalTextPosition(JButton.CENTER);
         add(myDetailsBtn);

         aboutBtn = new JButton("About");
         aboutBtn.setBounds(40, 500, 90, 33);
         aboutBtn.setIcon(new ImageIcon(Scoop.rec("buttonbg_2.png")));
         aboutBtn.setHorizontalTextPosition(JButton.CENTER);
         add(aboutBtn);

         CoursesFailedBtn = new JButton("Failed Courses");
         CoursesFailedBtn.setBounds(110, 412, 121, 46);
         CoursesFailedBtn.setIcon(new ImageIcon(Scoop.rec("buttonbg.jpg")));
         CoursesFailedBtn.setHorizontalTextPosition(JButton.CENTER);
         add(CoursesFailedBtn);

         setLayout(null);
         setVisible(true);
         add(background);


    }
    
    //removing the main menu panel when accessing to another one
    public void remove() { remove(this); }
}
