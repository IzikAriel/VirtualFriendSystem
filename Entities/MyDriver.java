package Entities;
import java.io.*;
import Controller.*;
import Model.MyModel;
import View.MyView;


public class MyDriver
{
    public static void main(String[] args) throws IOException
    {
        MyModel model = new MyModel();
        MyView view = new MyView();
        @SuppressWarnings("unused")
		MyController co =  new MyController (model , view);
    }
}
