package Models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Schedule implements Serializable
{
   private int schedule_id;

   private ArrayList<Shift> shifts; //on selection in main menu, add shifts and modify calender

   public Schedule(int id)
   {

      this.schedule_id = id;

   }

   public int ID()
   {
      return this.schedule_id;
   }


}
