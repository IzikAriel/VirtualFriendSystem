package Controller;
import Model.*;
import View.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



public class LectureController implements Controller {

    private LecturerModel model;
    private LecturerView view;


    public LectureController(LecturerModel model, LecturerView view) {
        this.view = view;
        this.model = model;
        StartRoll();
        listener();
    }

    //listener to lecturer information
   public void listener()
    {
        view.lecInfo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(view.textf !=  null) view.remove(view.textf);
                int i = view.lecInfo.getSelectedIndex();
                view.addnewtable(model.getLec(i));
                view.setVisible(true);
            }
        });
    }


      private void StartRoll()
      {
          String lec[] = model.bulidLecName();
          for (int i = 0; i < 7; i++)
          {
              view.lecInfo.add(lec[i]);
          }
      }
    }


