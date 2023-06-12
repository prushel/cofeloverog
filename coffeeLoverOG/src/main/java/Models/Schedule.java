package Models;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;

public class Schedule implements Serializable
{
   private int schedule_id;
   private boolean published;
   private LocalDate From;
   private LocalDate To;

   private ArrayList<Shift> shifts; //on selection in main menu, add shifts and modify calender

   public Schedule(int id, Date stDt, Date edDt)
   {
      this.schedule_id = id;
      this.From = stDt.toLocalDate();
      this.To =  edDt.toLocalDate();


   }

   public int ID()
   {
      return this.schedule_id;
   }

   public LocalDate getFrom()
   {
      return this.From;
   }
   public LocalDate getTo(){
      return this.To;
   }


}
