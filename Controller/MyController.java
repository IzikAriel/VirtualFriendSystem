package Controller;
import Model.*;
import View.*;
import Entities.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class MyController implements ObserverController
{
    MyModel model;
    MyView view;
    OpenController openCon ;
    MainController mainCon ;
    CourseController courseCon;
    GradeController gradeCon ;
    LectureController LectuerCon ;
    StudentController studentCon;
    UrlController urlCon;
    VirtualController virtualCon;
    CourseFailedController FailsCon ;
    MyDetailsController MyDetailsCon;
    Student user;


    public MyController(MyModel model ,MyView view )
     {
         this.view = view;
         this.model = model;
         startOpenPanel();
         moveOpenPanel();    
     }
    
    //check which observable did the notify operation
    @Override
    public void update(Observable O , Object U )
    {
        if(O instanceof OpenController )
        {
            user = (Student) U;
            startMainPanel(user);
            moveMainPanel();
        }
        else if(O instanceof  MainController)
        {
            String screen = (String)U ;
            removeMainPanel();
            switch (screen)
            {
                case "virtual" :
                    startVirtualPanel(user);
                    moveVirtualPanel();
                    break;
                case "grade" :
                    startGradePanel(user);
                    moveGradePanel();
                    break;
                case "course" :
                    startCoursePanel(user);
                    moveCoursePanel();
                    break;
                case "url" :
                    startUrlPanel(user);
                    moveURLPanel();
                    break;
                case "lecture":
                    startLecturerPanel(user);
                    moveLecturerPanel();
                    break;
                case "stu":
                    startStudentPanel(user);
                    moveStudentPanel();
                    break;
                case "logout" :

                    logOut();
                    view.prev.setVisible(false);
                    break;
                case "myDetails":
                 startMyDetailsPanel(user);
                 moveMyDetailsPanel();

                    break;
                case "aboutBtn":
                    startAboutPanel(user);
                    moveAboutPanel();
                    break;
                case "CoursesFailed":

                    startFailsPanel(user);
                    moveFailsPanel();
                    break;
            }
        }
    }

    //listener to which panel to return to
    public void listening()
    {
        view.prev.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
             
                if (model.pr.size() > 0)
                {
                    view.prev.setVisible(false);
                    PanelView temp = model.pr.pop();
                    temp.setVisible(false);
                    view.remove(temp);
                    moveMainPanelClickPrev();
                } 
                else {   return;  }
            }
        });
    }

    /*functions for changing panels*/
    public void removeOpenPanel()
    {
        view.openPanel.setVisible(false);
        view.remove(view.mainPanel);
    }

    public void moveOpenPanel()
    {
        view.add(view.openPanel);
        view.setVisible(true);
        openCon.addObserver(this);

    }
    
    public void moveMainPanel()
    {
         view.remove(view.openPanel);
         startMainPanel(user);
         view.add(view.mainPanel);
         view.setVisible(true);
        listening();
    }
    
    public void moveMainPanelClickPrev()
    {   
        view.add(view.mainPanel);
        view.setVisible(true);   
    }

    public void removeMainPanel()
    {

        view.remove(view.mainPanel);
        view.add(view.prev);
    }

    public void moveGradePanel()
    {
        savePanel(view.gradePanel);
        view.add(view.gradePanel);
        view.setVisible(true);
        view.prev.setVisible(true);
    }

    public void moveStudentPanel()
    {
        savePanel(view.stuPanel);
        view.add(view.stuPanel);
        view.setVisible(true);
        view.prev.setVisible(true);
    }

    public void moveVirtualPanel()
    {
        savePanel(view.virtualPanel);
        view.add(view.virtualPanel);
        view.setVisible(true);
        view.prev.setVisible(true);
    }

    public  void savePanel( PanelView P )
    {
        model.pr.push(P);
    }

    public void moveLecturerPanel()
    {
        savePanel(view.lecPanel);
        view.add(view.lecPanel);
        view.setVisible(true);
        view.prev.setVisible(true);
    }

    public void moveURLPanel()
    {
        savePanel(view.urlPanel);
        view.add(view.urlPanel);
        view.setVisible(true);
        view.prev.setVisible(true);
    }

    public void moveAboutPanel()
    {
        savePanel(view.aboutPanel);
        view.add(view.aboutPanel);
        view.setVisible(true);
        view.prev.setVisible(true);
    }

    public void moveCoursePanel()
    {
        savePanel(view.coursePanel);
        view.add(view.coursePanel);
        view.setVisible(true);
        view.prev.setVisible(true);
    }
    
    public void moveFailsPanel()
    {
    savePanel(view.FailsPanel);
    view.add(view.FailsPanel);
    view.setVisible(true);
    view.prev.setVisible(true);
    }
    
    public void moveMyDetailsPanel()
    {
     savePanel(view.myDetailsPanel);
     view.add(view.myDetailsPanel);
     view.setVisible(true);
     view.prev.setVisible(true);
    }


    /*functions for booting panels*/
    private void startMyDetailsPanel(Student user)
    {
        model.MyDetailsPanel =new MyDetailsModel();
        view.myDetailsPanel = new MyDetailsView(user);
        MyDetailsCon= new MyDetailsController( model.MyDetailsPanel, view.myDetailsPanel);
    }

    private void startFailsPanel(Student user)
    {
        model.FailsPanel = new CourseFailedModel();
        view.FailsPanel = new CourseFailedView(user);
        FailsCon = new CourseFailedController( model.FailsPanel, view.FailsPanel) ;
    }

    private void startOpenPanel()
    {
        model.openPanel= new OpenModel();
        view.openPanel = new OpenView();
        openCon = new OpenController(model.openPanel ,view.openPanel );
    }

    private void startAboutPanel(Student user)
    {
        view.aboutPanel = new AboutView(user);
    }

    private void startVirtualPanel(Student user)
    {
        model.virtualPanel= new VirtualModel();
        view.virtualPanel = new VirtualView(user);
        virtualCon = new VirtualController(model.virtualPanel ,view.virtualPanel );
    }

    private void startGradePanel( Student user)
    {
        view.gradePanel = new GradeView(user);
        model.gradePanel = new GradeModel();
        gradeCon = new GradeController(model.gradePanel , view.gradePanel);
    }

    private void startCoursePanel(Student user)
    {
        view.coursePanel = new CourseView(user);
        model.coursePanel = new CourseModel();
        courseCon = new CourseController(model.coursePanel , view.coursePanel);
    }

    private void startUrlPanel(Student user)
    {
        view.urlPanel = new UrlView(user);
        model.urlPanel = new UrlModel();
        urlCon = new UrlController(model.urlPanel, view.urlPanel);
    }

    private void startLecturerPanel(Student user)
    {
        view.lecPanel= new LecturerView(user);
        model.lecPanel =new LecturerModel();
        LectuerCon =new LectureController(model.lecPanel,view.lecPanel);
    }

    private void startStudentPanel(Student user)
    {
        view.stuPanel= new StudentView(user);
        model.stuPanel =new StudentModel();
        studentCon =new StudentController(model.stuPanel,view.stuPanel);
    }

    public void startMainPanel(Student user)
    {
        view.mainPanel =  new MainView(user);
        model.mainPanel =  new MainModel();
        mainCon = new MainController( model.mainPanel  ,  view.mainPanel);
        mainCon.addObserver(this);
    }

    private void logOut()
    {
        removeMainPanel();
        startOpenPanel();
        moveOpenPanel();
        user=null;
        view.remove(view.prev);
    }
}



