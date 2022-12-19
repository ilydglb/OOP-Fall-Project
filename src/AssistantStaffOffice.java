public class AssistantStaffOffice extends Area{
    Staff staff;
    AssistantStaffOffice(String name,String openbetween,String usage,Staff staff){
        super(name,openbetween,usage);
        this.staff=staff;
    }
}
