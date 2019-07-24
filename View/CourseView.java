package View ;
import Entities.*;

import javax.swing.*;


import java.awt.*;

@SuppressWarnings("serial")
public class CourseView extends PanelView 
{
    public Choice stuInfo1, stuInfo2, stuInfo3;
    public JTextArea textf;
    public String temp;
    public Scoop s;
    public JLabel background;
    public JRadioButton jrb1,jrb2,jrb3;
    public ButtonGroup bg;

    public CourseView(Student user)
    {
        super(user);
        initialization();
        beginRadioButtons();
    }
    
    public void initialization()
    {
    InitializationChoise();
    background = new JLabel(new ImageIcon(Scoop.rec("notmainpanelbg.jpg")));
    background.setBounds(-100, -100, 1200, 700);
    }
    
    public void beginRadioButtons()
    {
        jrb1=new JRadioButton("Science");
        jrb1.setSelected(true);
        jrb1.setBounds(860, 300, 100, 15);
        jrb1.setFont(new Font("Arial", Font.BOLD, 13));
        jrb2=new JRadioButton("Computers");
        jrb2.setSelected(false);
        jrb2.setBounds(860, 350, 100, 15);
        jrb2.setFont(new Font("Arial", Font.BOLD, 13));
        jrb3=new JRadioButton("General");
        jrb3.setSelected(false);
        jrb3.setBounds(860, 400, 100, 15);
        jrb3.setFont(new Font("Arial", Font.BOLD, 13));
        bg=new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        bg.add(jrb3);
        add(jrb1);
        add(jrb2);
        add(jrb3);
        add(background);
    }

    //creating all choices of the courses from another categories
    public void InitializationChoise() {

        stuInfo1 = new Choice();
        stuInfo1.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        stuInfo1.setBounds(600, 300, 250, 30);
        stuInfo1.setFont(new Font("Arial", Font.BOLD, 16));
        stuInfo1.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);


        for (int i = 0; i < 22; i++) {

            stuInfo1.add(Scoop.toString(i));
        }

        stuInfo2 = new Choice();
        stuInfo2.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        stuInfo2.setBounds(600, 350, 250, 30);
        stuInfo2.setFont(new Font("Arial", Font.BOLD, 16));
        stuInfo2.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        stuInfo2.setEnabled(false);


        for (int i = 22; i < 31; i++) {
            stuInfo2.add(Scoop.toString(i));
        }

        stuInfo3 = new Choice();
        stuInfo3.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        stuInfo3.setBounds(600, 400, 250, 30);
        stuInfo3.setFont(new Font("Arial", Font.BOLD, 16));
        stuInfo3.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        stuInfo3.setEnabled(false);


        for (int i = 31; i < 36; i++) {
            stuInfo3.add(Scoop.toString(i));
        }
        add(stuInfo1);
        add(stuInfo2);
        add(stuInfo3);
    }

    //new table with specific detail for each choice
    public void addNewtable(Course co) 
    {
       if (textf != null)
           remove(textf);
        textf = new JTextArea();
        textf.setText(textf.getText() + "Course Name: " + co.getName() + "\n");
        textf.setText(textf.getText() + "Credits: " + co.getCredits() + "\n");
        textf.setText(textf.getText() + "Course demand: " + co.getDemandLevel() + "\n");
        textf.setText(textf.getText() + "Course avarage: " + co.getAVG() + "\n");
        textf.setText(textf.getText() + "Course difficulty: " + co.getDifficultyLevel() + "\n");

        if (co.getIsIncludeProject())
            textf.setText(textf.getText() + "This Course include Project" + "\n");
        else textf.setText(textf.getText() + "This Course not include Project" + "\n");

        textf.setBounds(150, 250, 400, 240);
        textf.setFont(new Font("Arial", Font.BOLD, 20));
        textf.setVisible(true);
        textf.setEditable(false);
        add(textf);
        setVisible(true);

    }
}