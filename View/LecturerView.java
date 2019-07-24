package View ;
import Entities.*;
import javax.swing.*;
import java.awt.*;


    @SuppressWarnings("serial")
	public class LecturerView extends PanelView {

       public Choice lecInfo;
       public String temp;
       private JLabel label1,background;
       public JTextArea textf;

       public LecturerView(Student user) 
       {
            super(user);
            initialization();
       }

       private void initialization()
        {
            lecInfo = new Choice();
            lecInfo.setBounds(400,200,200,30);
            lecInfo.setFont(new Font("Arial", Font.BOLD, 15));
            lecInfo.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
            label1 = new JLabel("Choose Lecturer");
            label1.setBounds(200,175,200,65);
            label1.setFont(new Font("Arial", Font.BOLD, 22));
            label1.setForeground(Color.white);
            label1.setVisible(true);
            background=new JLabel(new ImageIcon(Scoop.rec("notmainpanelbg.jpg")));
            background.setBounds(-100,-100,1200,700);
            add(label1);
            add(lecInfo);
            add(background);
        }

       //setting the information for each chosen lecturer
       public void addnewtable(Lecturer lec)
       {
            textf = new JTextArea();
            textf.setEditable(false);
            textf.setText(textf.getText() + "First name: "  + lec.getFirstName() +"\n");
            textf.setText(textf.getText() + "Last name: " + lec.getLastName() +"\n");
            textf.setText(textf.getText() + "Age: " + lec.getAge() +"\n");
            textf.setText(textf.getText() + "City: " + lec.getAddress() +"\n");
            textf.setText(textf.getText()  +"Mail: " + lec.getEmail() + "\n");
            textf.setText(textf.getText() + "Phone number: " + lec.getPhone() +"\n");
            textf.setText(textf.getText() + "Our opinion: " + lec.getReview() +"\n");
            textf.setText(textf.getText() + "Score from 1 to 10: " + lec.getRate() +"\n");
            textf.setBounds(200,250,615,250);
            textf.setFont(new Font("Arial", Font.BOLD, 23));
            textf.setVisible(true);
            add(textf);
            add(background);
       }
    }






