public class AssistantStaffOffice extends Area{
    Staff staff;
    AssistantStaffOffice(String name,String openbetween,String usage,Staff stff){
        super(name,openbetween,usage);
       setStaff(stff);
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Staff getStaff() {
        return staff;
    }
}
