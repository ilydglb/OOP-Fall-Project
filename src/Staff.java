public abstract class Staff {
    private long id;
    private String task_info;
    private String working_hours;

    private int monthly_salary=6000;     //monthly salary base
    private int yearOfService;          //we use how many years a staff has worked when calculating salary
    private int annualDayOff=30;        //total off days that a staff can have in a year

    Staff(long ID,String taskinfo,String workinghours,int yearofservice){
        setId(ID);
        setTask_info(taskinfo);
        setWorking_hours(workinghours);
        setYearOfService(yearofservice);
    }

    public void setId(long id) {this.id = id;}
    public long getId() {return id;}

    public String getTask_info() {return task_info;}
    public void setTask_info(String task_info) {this.task_info = task_info;}

    public void setWorking_hours(String working_hours) {this.working_hours = working_hours;}
    public String getWorking_hours() {return working_hours;}

    public void setYearOfService(int yearOfService) {this.yearOfService = yearOfService;}
    public int getYearOfService() {return yearOfService;}
    public int getSalary() {
        return monthly_salary;
    }

    public void addToSalary(int s){
        monthly_salary+=s;
    }
    public int getAnnualDayOff() {return annualDayOff;}

    public void decreaseDay(int offdaycount){
        annualDayOff-=offdaycount;
    }
}
