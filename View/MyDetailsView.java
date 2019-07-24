package View;
import Entities.Scoop;
import javax.swing.*;
import Entities.*;
import java.awt.*;

@SuppressWarnings("serial")
public class MyDetailsView extends PanelView
{
    public ImageIcon imageIcon1,bgImg;
    public JLabel background , battery , cre, title ;
    public JTextArea textf;
    
    public MyDetailsView(Student user)
    {
         super(user);
         initialization(user);
    }

    public void initialization(Student user)
    {
        initializationCredits(user);
        
        bgImg=new ImageIcon(Scoop.rec("student3.jpg"));
        background=new JLabel(bgImg);
        add(background);
        background.setBounds(-157,0,1300,700);
        label_avg.setForeground(Color.WHITE);
        label_stuName.setForeground(Color.WHITE);
        title.setVisible(true);  
        setVisible(true);
    }

    //creating the user information table and setting the credits bar by his credits
    private void initializationCredits(Student user) 
    {
    if (user.getCredits() < 100)
    {
        imageIcon1 = new ImageIcon(Scoop.rec("battery (11).png"));

    } 
    else if (user.getCredits() < 150)
    {
        imageIcon1 = new ImageIcon(Scoop.rec("battery (13).png"));

    }
    else if (user.getCredits() < 200)
    {
        imageIcon1 = new ImageIcon(Scoop.rec("battery (15).png"));
    }
    else 
    {
        imageIcon1 = new ImageIcon(Scoop.rec("battery (17).png"));
    }
    battery = new JLabel(imageIcon1);
    battery.setBounds(100, 350, 100, 150);
    cre= new JLabel("Credits meter");
    cre.setBounds(105, 480, 150, 50);
    cre.setFont(new Font("Tahoma", Font.PLAIN, 15));
    cre.setForeground(Color.WHITE);
    add(cre);
    add(battery);
    
    title = new JLabel("My Details");
    title.setBounds(400, 80, 250, 240);
    title.setFont(new Font("Tahoma", Font.PLAIN, 40));
    title.setForeground(Color.WHITE);
    add(title);

    textf = new JTextArea();
    textf.setText(textf.getText() + "Full name: " + user.getFirstName() +" "+ user.getLastName() + "\n");
    textf.setText(textf.getText() + "Age: " + user.getAge() + "\n");
    textf.setText(textf.getText() + "Mail: "  +   user.getEmail() + "\n");
    textf.setText(textf.getText() + "Phone number:  " + user.getPhone() + "\n");
    textf.setText(textf.getText() + "Address:  " + user.getAddress() + "\n");
    textf.setText(textf.getText() + "ID:  " + user.getID() + "\n");
    textf.setText(textf.getText() + "Starting year:  " + user.getStartYear() + "\n");
    textf.setText(textf.getText() + "Ending year:  " + user.getEndYear() + "\n");

    textf.setBounds(300, 250, 400, 240);
    textf.setFont(new Font("Arial", Font.BOLD, 20));
    textf.setVisible(true);
    textf.setEditable(false);
    add(textf);
    
    setVisible(true);


    setVisible(true);
}

}
