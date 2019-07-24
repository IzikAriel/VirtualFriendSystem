package Controller;
import Model.*;
import View.*;
import Entities.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings({ "deprecation", "unused" })
public class OpenController extends Observable implements  Controller {


    private OpenModel model;
    private OpenView view;


    public OpenController(OpenModel model, OpenView view) {
        this.view = view;
        this.model = model;
        listener();

    }

    //listener for tab and enter keys in the open panel
    public void listener()
    {
        view.nameTextPane.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e)
            {
                if (e.getKeyCode() == KeyEvent.VK_TAB) {
                    if (e.getModifiers() < 0) {
                        view.nameTextPane.transferFocus();
                    } else {
                        view.passTextPane.transferFocus();
                    }
                    e.consume();
                }
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    Student tempUser =  login();
                    if(tempUser!=null)
                    {
                        setChanged();
                        notifyObservers(tempUser);

                    }
                    if(view.flag==1)
                        view.popup.hide();
                }
            }
        });


        view.passTextPane.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    Student tempUser =  login();
                    if(tempUser!=null) {
                        setChanged();
                        notifyObservers(tempUser);

                    }
                    if(view.flag==1)
                        view.popup.hide();
                }
            }
        });

        view.okBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Student tempUser =  login();;
                if(tempUser!=null) {
                    setChanged();
                    notifyObservers(tempUser);

                }
                if(view.flag==1)
                    view.popup.hide();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JLabel msg = new JLabel("Aprove your details");
                view.popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), msg, e.getXOnScreen(), e.getYOnScreen());
                view.popup.show();
                view.flag=1;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                view.popup.hide();
            }
        });
        view.okBtn.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    Student tempUser =  login();
                    if(tempUser!=null) {
                        setChanged();
                        notifyObservers(tempUser);

                    }
                    if(view.flag==1)
                        view.popup.hide();
                }
            }
        });
    }

    //login verification
    public Student login() {
        String stuName = view.nameTextPane.getText();
        String pass = view.passTextPane.getText();
        view.error.setVisible(true);
        if (stuName.equals("") && pass.equals(""))
        {
            view.error.setText("There aren't any details!");
        }
        else if (stuName.equals(""))
        {
            view.error.setText("Please enter student name");
        }
        else if (pass.equals(""))
        {
            view.error.setText("Please enter password");
        }
        else
            {
            for (int i = 0; i < 4; i++) {

                if (model.stu.get(i).getFirstName().equals(stuName) && model.pass[i].equals(pass)) {

                    return (model.stu.get(i));
                }
            }
            view.error.setText("The name or the password isn't correct");
        }
        return null ;
    }
}
