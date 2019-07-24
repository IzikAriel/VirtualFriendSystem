package Controller;

import Entities.*;
import Model.*;
import View.*;

public class CourseFailedController implements Controller  {
    CourseFailedModel model;
    CourseFailedView view;

      CourseFailedController( CourseFailedModel model ,CourseFailedView view )
        {
            this.model=model;
            this.view=view;
            listener();
        }

      //listener to failed courses
    public void listener()
    {
        Course co[] = model.getCoursesOfCsArray();
        view.update(co);
    }



}
