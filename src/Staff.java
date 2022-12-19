public abstract class Staff {
    private long id;
    private String task_info;
    private String working_hours;

    private int monthlysalary=6000;     //monthly salary base
    private int yearOfService;          //we use how many years a staff has worked when calculating salary
    private int annualDayOff=30;        //total off days that a staff can have in a year

    Staff(long id,String task_info,String working_hours,int yearOfService){
        this.id=id;
        this.task_info=task_info;
        this.working_hours=working_hours;
        this.yearOfService=yearOfService;
    }

    public void setYearOfService(int yearOfService) {
        this.yearOfService = yearOfService;
    }

    public int getYearOfService() {
        return yearOfService;
    }

    public void CalculateSalary(){
        if(this instanceof CleaningStaff){
            this.monthlysalary+=yearOfService*200;
        }
        if(this instanceof TechnicalStaff){
            this.monthlysalary+=yearOfService*220;
        }
        if(this instanceof Secretary){
            this.monthlysalary+=yearOfService*250;
        }
    }

    public int getSalary() {
        return monthlysalary;
    }

    public void DecreaseDayOff(){       //when a staff takes a day off we subtract a day if there are any
        if(annualDayOff>0)
            this.annualDayOff--;
        else
            System.out.println("There are no off days available");
    }

}
