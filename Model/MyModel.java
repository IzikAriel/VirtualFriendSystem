package Model ;
import Entities.*;
import View.PanelView;


import java.util.Stack;

import Controller.MyDetailsModel;

public class MyModel
{

    public Student user;
    public OpenModel openPanel ;
    public LecturerModel lecPanel;
    public UrlModel urlPanel;
    public StudentModel stuPanel;
    public MainModel mainPanel;
    public CourseModel coursePanel;
    public GradeModel gradePanel;
    public VirtualModel virtualPanel;
    public CourseFailedModel FailsPanel;
    public MyDetailsModel MyDetailsPanel;
    public Stack<PanelView> pr;

    //creating a stack to keep the last page we were in to
    public MyModel() {  pr = new Stack<PanelView>();}
}
