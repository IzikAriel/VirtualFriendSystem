package View ;
import Entities.*;
import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

@SuppressWarnings("serial")
public class VirtualView extends PanelView
{

    public JLabel text1,text2, newAVG,background;
    public  JTextField intPane;
    public JButton okBtn;
    public Choice courses;
    public String temp;
    public Scoop s = new Scoop();
    public DecimalFormat df2 = new DecimalFormat("###.###");
    public Student user;
    
    public VirtualView(Student user)
    {
        super(user);
        this.user= user;
        initialization();
    }

    //creating all the messages, errors, button etc. for the virtual panel
    private  void initialization()
    {
        setSize(1000, 600);
        setLayout(null);
        setVisible(true);
        background=new JLabel(new ImageIcon(Scoop.rec("notmainpanelbg.jpg")));
        background.setBounds(-100,-100,1200,700);

        text1 = new JLabel();
        text2 = new JLabel();
        newAVG = new JLabel();
        intPane = new JTextField();
        okBtn = new JButton();

        courses = new Choice();
        courses.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        courses.setFont(new Font("Arial", Font.PLAIN, 18));
        courses.setSize(400, 700);
        courses.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
        for(int i=1 ; i<20;i++)
        {
            temp = Scoop.toString(i);
            courses.add(temp);
            add(courses);
        }
        
        newAVG.setText("Please choose the course score you want to improve");
        newAVG.setFont(new Font("Arial", Font.PLAIN, 25));
        newAVG.setBounds(200, 188, 600, 78);
        newAVG.setForeground(Color.white);
        add(newAVG);
        courses.setBounds(400, 266, 200, 50);

        intPane.setFont(new Font("Tahoma", Font.PLAIN, 28));
        intPane.setBounds(465, 335, 70, 50);
        intPane.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        add(intPane);

        okBtn.setFont(new Font("Tahoma", Font.PLAIN, 8));
        okBtn.setBounds(750, 335, 188, 66);
        okBtn.setFont(new Font("Arial", Font.BOLD, 25));
        okBtn.setText("Go!");
        add(okBtn);

        text1.setFont(new Font("Arial", Font.BOLD, 22));
        text1.setBounds(440, 400, 600, 67);
        text1.setText("");
        text1.setForeground(Color.red);
        text1.setVisible(false);
        add(text1);

        text2.setFont(new Font("Arial", Font.BOLD, 23));
        text2.setBounds(350, 400, 600, 67);
        text2.setText("");
        text2.setForeground(Color.white);
        text2.setVisible(false);
        add(text2);

        setVisible(true);

        add(background);

    }

}