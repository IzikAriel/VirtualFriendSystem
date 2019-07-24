package View ;
import Entities.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class AboutView extends PanelView
{
    private JLabel background;
    
    public AboutView(Student user)
    {
        super(user);
        initialization();

    }
    
    //setting the About panel
    public void initialization()
    {
        setSize(1000, 600);
        setLayout(null);
        setVisible(true);
        background=new JLabel(new ImageIcon(Scoop.rec("aboutbackground.jpeg")));
        background.setBounds(-105,-65,1200,700);
        add(background);
    }

}