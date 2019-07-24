package Controller;
import Entities.*;
import Model.*;
import View.*;


public class GradeController implements  Controller {

    GradeModel model;
    GradeView view;
    public GradeController(GradeModel model,GradeView view)
    {
        this.model=model;
        this.view=view;
        listener(); 
    }

  //listener to course grade
	public void listener()
    {
		  Course[] co= model.getCoursesOfCsArray();
		  view.update(co);
	}
}
