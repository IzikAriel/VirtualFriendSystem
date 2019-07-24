package Controller;
import Model.*;
import View.*;


import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class StudentController implements Controller {


    private StudentModel model;
    private StudentView view;


    public StudentController(StudentModel model, StudentView view) {
        this.view = view;
        this.model = model;
        StartRoll();
        listener();
    }

    //getting all the students information from model to the view
    private void StartRoll() {
        String[][] stuNames = model.getStuNames();
        String temp = new String();
        for (int i = 0; i < 4; i++) {
            temp = stuNames[i][0] + " " + stuNames[i][1];
            view.getStuInfo().add(temp);
        }
    }

    //listener for chosen student to be viewed
    public void listener()
    {
        view.stuInfo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged (ItemEvent e){
                if (view.textf != null) view.remove(view.textf);
                int i = view.stuInfo.getSelectedIndex();

                view.addnewtable(model.getStudent(i));
                view.setVisible(true);
            }
        });

    }

}
