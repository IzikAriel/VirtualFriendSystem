package Controller;
import Entities.*;
import Model.*;
import View.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CourseController implements Controller
{
    CourseModel model;
    CourseView view;

    public CourseController(CourseModel model, CourseView view)
    {
        this.model=model;
        this.view=view;
        listener();
        courselisteners();
    }

    //listen to chosen course
    public void listener() {
    	//science courses
        view.stuInfo1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                String c = view.stuInfo1.getSelectedItem();
                Course co = model.getCourseByName(c);
                view.addNewtable(co);
                view.add(view.background);
            }
        });

      //computer courses
        view.stuInfo2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                String c = view.stuInfo2.getSelectedItem();
                Course co = model.getCourseByName(c);
                view.addNewtable(co);
                view.add(view.background);

            }
        });

      //general courses
        view.stuInfo3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                String c = view.stuInfo3.getSelectedItem();
                Course co = model.getCourseByName(c);
                view.addNewtable(co);
                view.add(view.background);
            }
        });
    }


    //listener to chosen course category
    public void courselisteners()
    {
        view.jrb1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ///////////////////////////////////
                view.stuInfo1.setEnabled(true);
                view.stuInfo2.setEnabled(false);
                view.stuInfo3.setEnabled(false);
            }
        });

        view.jrb2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ///////////////////////////////////
                view.stuInfo2.setEnabled(true);
                view.stuInfo1.setEnabled(false);
                view.stuInfo3.setEnabled(false);
            }
        });

        view.jrb3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ///////////////////////////////////
                view.stuInfo3.setEnabled(true);
                view.stuInfo2.setEnabled(false);
                view.stuInfo1.setEnabled(false);
            }
        });
    }
    }
