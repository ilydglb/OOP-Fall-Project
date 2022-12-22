import java.util.*;
public class TechnicalStaff extends Staff{

    TechnicalStaff(long id,String task_info,String working_hours,int yofServ)
    {
        super(id,task_info,working_hours,yofServ);
    }

    public void initiateOvertime(Date timeUntilEnd, Area area ){    //we can initiate overtime of an area from TEchnicalStaff class too
        if(!area.isInOvertime()){
            area.initiateTemporaryOvertime(timeUntilEnd, this);
        }else{
            System.out.println("This area is already in overtime. If that's a problem, reinitiate the overtime.");
        }
    }

    public void discardOvertime(Area area){
        if(area.isInOvertime()){
            System.out.println("There is no overtime to be discarded.");
        }else{
            area.discardTemporaryOvertime(this);
        }
    }
}
