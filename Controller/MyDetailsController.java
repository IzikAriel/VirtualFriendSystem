package Controller;
import  View.*;
public class MyDetailsController implements  Controller{

    MyDetailsModel model ;
    MyDetailsView view;

    public MyDetailsController(MyDetailsModel model, MyDetailsView view)
    {
        this.model=model;
        this.view=view;

    }
    
     public void listener() {}
}
