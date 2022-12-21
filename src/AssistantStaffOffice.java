public class AssistantStaffOffice extends Area{
    AssistantStaff staff;
    AssistantStaffOffice(String name,String openbetween,String usage,AssistantStaff stff){
        super(name,openbetween,usage);
       setStaff(stff);
    }

    public void setStaff(AssistantStaff staff) {
        this.staff = staff;
    }

    public Staff getStaff() {
        return staff;
    }
}
