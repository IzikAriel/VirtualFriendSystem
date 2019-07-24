package View ;
import Entities.*;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class OpenView extends JPanel  {

    public JLabel label,text,enterName , error,picture,enterPass,img1,img2,background;
    public JTextField nameTextPane;
    public JPasswordField passTextPane;
    public JButton okBtn ;
    public ImageIcon imageIcon1,imageIcon2,bgImg;
    public Popup popup;
    public int flag=0;
    static int tabCounter=0;

    public OpenView() { initialization();}

    //creating the open panel buttons, Jtexts, error etc...
    public void  initialization()
    {
        bgImg=new ImageIcon(Scoop.rec("backgroundimg_1.jpg"));
        background=new JLabel(bgImg);
        background.setBounds(-157,0,1300,700);

        imageIcon1 = new ImageIcon(Scoop.rec("certified.png"));
        img1 = new JLabel(imageIcon1);
        img1.setBounds(15, 380, 200, 200);
        add(img1);

        imageIcon2 = new ImageIcon(Scoop.rec("support.png"));
        img2 = new JLabel(imageIcon2);
        img2.setBounds(400, 115, 200, 200);
        add(img2);

        label = new JLabel();
        text = new JLabel();
        nameTextPane = new JTextField();
        passTextPane = new JPasswordField();
        error = new JLabel("Error",SwingConstants.CENTER);
        picture=new JLabel();
        
        setSize(1000,600);
        setLayout(null);
        setBackground(Color.darkGray);
        
        label.setText("Welcom To Virtual Friend");
        label.setFont(new Font("Arial", Font.BOLD, 32));
        label.setBounds(297, 57, 406, 67);
        label.setForeground(Color.white);
        
        enterName = new JLabel("Please enter your name");
        enterName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        enterName.setBounds(170, 324, 247, 37);
        enterName.setForeground(Color.white);

        enterPass = new JLabel("Please enter password");
        enterPass.setFont(new Font("Tahoma", Font.PLAIN, 20));
        enterPass.setBounds(170, 400, 247, 37);
        enterPass.setForeground(Color.white);

        nameTextPane.setFont(new Font("Tahoma", Font.PLAIN, 18));
        nameTextPane.setBounds(397, 324, 205, 37);
        nameTextPane.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        passTextPane.setFont(new Font("Tahoma", Font.PLAIN, 18));
        passTextPane.setBounds(397, 400, 205, 37);
        passTextPane.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        error.setFont(new Font("Tahoma", Font.PLAIN, 18));
        error.setBounds(330, 480, 350, 37);
        error.setText("");
        error.setForeground(Color.red);

        okBtn = new JButton("Login");
        okBtn.setBackground(Color.darkGray);
        okBtn.setForeground(Color.white);
        okBtn.setBounds(630, 360, 112, 37);
        add(nameTextPane);
        add(passTextPane);
        add(okBtn);
        add(enterName);
        add(enterPass);
        add(label);
        add(error);
        add(background);
        setVisible(true);

    }
    
    //removing the open panel when login
    public void remove()  {remove(this);}

}
