public class AssistantStaff extends Staff {
    AssistantStaffOffice office;    //assistant staffs has offices
    AssistantStaff(long id,String task_info,String working_hours,int yofServ)
    {
        super(id,task_info,working_hours,yofServ);
    }

    public AssistantStaffOffice getOffice() {return office;}

    public void setOffice(AssistantStaffOffice office) {this.office = office;}
}
