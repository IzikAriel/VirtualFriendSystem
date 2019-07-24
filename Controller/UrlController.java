package Controller;
import Model.*;
import View.*;



import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UrlController implements Controller
{
    UrlModel model;
    UrlView view;
    public UrlController(UrlModel model, UrlView view)
    {
        this.model=model;
        this.view=view;
        listener();
    }
    //listener for every button in the URL panel
    public void listener()
    {
        view.btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    String myUrl="http://cs18.co.il/%D7%A9%D7%A0%D7%94-%D7%90/";
                    java.awt.Desktop.getDesktop().browse((java.net.URI.create(myUrl)));
                }
                catch (Exception e2) {}
            }
        });
        view.btn2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    String myUrl="http://cs18.co.il/%D7%A7%D7%95%D7%A8%D7%A1%D7%99-%D7%AA%D7%A9%D7%AA%D7%99%D7%AA/";
                    java.awt.Desktop.getDesktop().browse((java.net.URI.create(myUrl)));
                }
                catch (Exception e2) {}
            }
        });
        view.btn3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    String myUrl="http://cs18.co.il/%D7%A9%D7%A0%D7%94-%D7%91/";
                    java.awt.Desktop.getDesktop().browse((java.net.URI.create(myUrl)));
                }
                catch (Exception e2) {}

            }
        });
        view.btn4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                try{
                    String myUrl="http://cs18.co.il/%D7%A9%D7%A0%D7%94-%D7%92/";
                    java.awt.Desktop.getDesktop().browse((java.net.URI.create(myUrl)));
                }
                catch (Exception e2) {}
            }
        });
        view.btn5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                try{
                    String myUrl="http://cs18.co.il/";
                    java.awt.Desktop.getDesktop().browse((java.net.URI.create(myUrl)));
                }
                catch (Exception e2) {}

            }
        });
        view.btn6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {


                try{
                    String myUrl="http://cs18.co.il/%D7%A7%D7%95%D7%A8%D7%A1%D7%99-%D7%91%D7%97%D7%99%D7%A8%D7%94/";
                    java.awt.Desktop.getDesktop().browse((java.net.URI.create(myUrl)));
                }
                catch (Exception e2) {}

            }
        });
    }
}
