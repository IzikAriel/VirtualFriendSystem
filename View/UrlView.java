package View ;
import Entities.*;

import java.awt.Font;

import javax.swing.*;

@SuppressWarnings("serial")
public class UrlView extends PanelView{

    private JLabel background;
    public JButton btn1,btn2,btn3,btn4,btn5,btn6;

    public UrlView(Student user)
    {
        super(user);
        initialization();
    }
    
    //creating the buttons for the URL panel
    private void initialization()
    {
        background=new JLabel(new ImageIcon(Scoop.rec("notmainpanelbg.jpg")));
        background.setBounds(-100,-100,1200,700);
        btn1 = new JButton("Year One");
        btn1.setBounds(655, 300, 150, 46);
        btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(btn1);

        btn2 = new JButton("Core Courses");
        btn2.setBounds(435, 412, 150, 46);
        btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(btn2);

        btn3 = new JButton("Year Two");
        btn3.setBounds(435, 300, 150, 46);
        btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(btn3);

        btn4 = new JButton("Year Three");
        btn4.setBounds(215, 300, 150, 46);
        btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(btn4);

        btn5 = new JButton("General Courses");
        btn5.setBounds(215, 412, 150, 46);
        btn5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(btn5);

        btn6 = new JButton("Choosing Courses");
        btn6.setBounds(655, 409, 150, 46);
        btn6.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(btn6);

        setLayout(null);
        setVisible(true);
        add(background);

    }
}
