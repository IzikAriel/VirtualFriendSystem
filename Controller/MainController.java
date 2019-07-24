package Controller;
import Model.*;
import View.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class MainController extends Observable implements Controller {

    @SuppressWarnings("unused")
	private MainModel model;
    private MainView view;

    public MainController(MainModel model, MainView view) {
        this.view = view;
        this.model = model;
        listener();

    }

    public void listener() {

    	//go to virtual score panel
        view.virtualBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              setChanged();
              notifyObservers("virtual");
                view.popup.hide();

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JLabel msg = new JLabel("Change your score to know your possibilities");
                view.popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), msg, e.getXOnScreen(), e.getYOnScreen());
                view.popup.show();

            }

            @Override
            public void mouseExited(MouseEvent e) {
                view.popup.hide();
            }
        });

        //go to grades panel
        view.gradeBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setChanged();
                notifyObservers("grade");
                view.popup.hide();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JLabel msg = new JLabel("What is our score state?");
                view.popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), msg, e.getXOnScreen(), e.getYOnScreen());
                view.popup.show();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                view.popup.hide();
            }
        });

        //go to courses panel
        view.courseBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               setChanged();
               notifyObservers("course");
                view.popup.hide();


            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JLabel msg = new JLabel("Let's choose some courses");
                view.popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), msg, e.getXOnScreen(), e.getYOnScreen());
                view.popup.show();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                view.popup.hide();
            }
        });

        //go to material panel
        view.urlBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ///////////////////////////////////
            setChanged();
            notifyObservers("url");

                view.popup.hide();
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                JLabel msg = new JLabel("Access to all the courses data you need");
                view.popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), msg, e.getXOnScreen(), e.getYOnScreen());
                view.popup.show();

            }

            @Override
            public void mouseExited(MouseEvent e) {
                view.popup.hide();
            }
        });

        //go to lecturer panel
        view.lecturerBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setChanged();
                notifyObservers("lecture");
                view.popup.hide();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JLabel msg = new JLabel("List of lecturers and their details");
                view.popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), msg, e.getXOnScreen(), e.getYOnScreen());
                view.popup.show();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                view.popup.hide();
            }
        });

        //go to users panel
        view.StuBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               setChanged();
               notifyObservers("stu");
                view.popup.hide();
            }

            @Override
            public void mouseEntered(MouseEvent e) {

                JLabel msg = new JLabel("find another users of this system");
                view.popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), msg, e.getXOnScreen(), e.getYOnScreen());
                view.popup.show();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                view.popup.hide();
            }
        });

        //go to open panel
        view.logOutBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

               setChanged();
               notifyObservers("logout");
                view.popup.hide();

            }

            @Override
            public void mouseEntered(MouseEvent e) {

                JLabel msg = new JLabel("return to the Intoduction Panel");
                view.popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), msg, e.getXOnScreen(), e.getYOnScreen());
                view.popup.show();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                view.popup.hide();

            }
        });

        //go to my details panel
        view.myDetailsBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
          setChanged();
         notifyObservers("myDetails");

                view.popup.hide();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JLabel msg = new JLabel("Only you can see your private details");
                view.popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), msg, e.getXOnScreen(), e.getYOnScreen());
                view.popup.show();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                view.popup.hide();
            }
        });

        //go to about panel
        view.aboutBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                setChanged();
                notifyObservers("aboutBtn");
                view.popup.hide();  
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JLabel msg = new JLabel("come to hear some about us");
                view.popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), msg, e.getXOnScreen(), e.getYOnScreen());
                view.popup.show();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                view.popup.hide();
            }
        });

        //go to failed courses panel
        view.CoursesFailedBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

           setChanged();
           notifyObservers("CoursesFailed");
                view.popup.hide();
                //move to what panel
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // super.mouseClicked(e);
                JLabel msg = new JLabel("It's not a failure it's a learn");
                view.popup = PopupFactory.getSharedInstance().getPopup(e.getComponent(), msg, e.getXOnScreen(), e.getYOnScreen());
                view.popup.show();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                view.popup.hide();
            }
        });
    }

}