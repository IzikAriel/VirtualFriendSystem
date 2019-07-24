package Controller;
import Model.*;
import View.*;
import Entities.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VirtualController implements Controller
{
    VirtualModel model;
    VirtualView view;
    ComputerScience cs;
    public VirtualController(VirtualModel model, VirtualView view)
    {
        this.model=model;
        this.view=view;
        listener();
    }

    //function for computing the temporary GPA according to the student scores and input
    public void compute(Student user)
    {
        int virtual[];
        int tempGrade =-1;
        virtual = user.getGrades();
        String s = view.intPane.getText();
        try {
            tempGrade = Integer.parseInt(s);
        } catch (Exception ee){
            view.text1.setText("Invaled score");
        }
        int tempcourse = view.courses.getSelectedIndex();

        if(tempGrade < 0 || tempGrade > 100  || s.equals(null)) {
            view.text2.setVisible(false);
            view.text1.setVisible(true);
            view.text1.setText("Invalid score");
        }
        else {

            virtual[tempcourse] = tempGrade;
            view.text1.setVisible(false);
            view.text2.setVisible(true);
            view.text2.setText(" You're virtual GPA is: " +  view.df2.format(model.getAvg(virtual)));
        }
    }

    //listener for the confirm button
    public void listener()
    {
        view.okBtn.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e) {
                compute(view.user);

            }
        });
        view.intPane.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e)
            {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    compute(view.user);
                }
            }
        });

    }
}
