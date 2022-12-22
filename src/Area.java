import java.util.*;
public class Area {
    private String name;
    private String openbetween;
    private String usage;
    CleaningStaff cs;   //cleaning staff who is responsible from cleaning the area
    private Date temporaryOvertime = null;  //we use this variable when an area is in overtime, which means it is open outside it's working hours 7/24.
                                            //for an example library is open 7/24 when it's exam week.

    Area(String nme,String open,String use){
        setName(nme);
        setOpenbetween(open);
        setUsage(use);
    }

    public void setName(String name) {this.name = name;}

    public String getName() {return name;}

    public void setOpenbetween(String openbetween) {this.openbetween = openbetween;}

    public String getOpenbetween() {return openbetween;}

    public void setUsage(String usage) {this.usage = usage;}

    public String getUsage() {return usage;}

    public void setCS(CleaningStaff cs){this.cs=cs;}

    public CleaningStaff getCs() {return cs;}

    public Date getTemporaryOvertime() {return temporaryOvertime;}

    public boolean isInOvertime() {         //returns if the area is in overtime
        return temporaryOvertime != null;
    }

    public void initiateTemporaryOvertime(Date timeUntilRemoval, TechnicalStaff ts){
        if(ts.getClass().getName().equals("TechnicalStaff")){           //if one of TechinalStaff
            temporaryOvertime = timeUntilRemoval;
        }else{
            System.out.println("Only Technical Staff can initiate overtime.");
        }
    }

    //method overloading
    public void discardTemporaryOvertime(TechnicalStaff ts){    //only the TechnicalStaff can discard overtime if it is not time yet.
        if(ts.getClass().getName().equals("TechnicalStaff")){
            temporaryOvertime = null;
        }else{
            System.out.println("Only Technical Staff can discard active overtime before due time.");
        }
    }

    public void discardTemporaryOvertime(){   //anyone can discard overtime if time is up.
        if(new Date().compareTo(temporaryOvertime) > 0){
            temporaryOvertime = null;
        }else{
            System.out.println("Overtime has not exceeded accepted time period yet.");
        }
    }
}