import java.util.*;
public class Society {
    public String societyName;
    public UndergradStudent leader;
    public Lecturer societySupervisor;
    private List<UndergradStudent> members = new ArrayList<>();

    Society(String sname, UndergradStudent lead, Lecturer supervisor){
        setSocietyName(sname);
        setLeader(lead);
        addMember(lead);    //we add leader to members too
        setSocietySupervisor(supervisor);
    }

    public void setSocietyName(String societyName) {this.societyName = societyName;}
    public String getSocietyName() {return societyName;}
    public void setSocietySupervisor(Lecturer societySupervisor) {this.societySupervisor = societySupervisor;}
    public Lecturer getSocietySupervisor() {return societySupervisor;}
    public void setLeader(UndergradStudent leader) {this.leader = leader;}
    public Student getLeader() {return leader;}

    public List<UndergradStudent> getMembers() {return members;}
    public void setMembers(List<UndergradStudent> members) {this.members = members;}


    public void addMember(UndergradStudent memberToBe){
        try{
            if(members.contains(memberToBe))       //if members does contain the member to be
                System.out.println("The student is already a member.");

            else {
                this.members.add(memberToBe);           //adding member to be to the society
                if (memberToBe == leader)               //if member to be added is the leader
                    memberToBe.getSocietyDuties().put(this, "leader");
                else
                    memberToBe.getSocietyDuties().put(this, "no duty");    //adding the society to the member with no duty as default
            }
        }catch (NullPointerException ex){System.out.println("Attempt to add a non-existent student.");}
    }
    public void removeMember(UndergradStudent memberToBeDeleted){
        try {
            if(members.contains(memberToBeDeleted))     //if the student is a member
                this.members.remove(this.members.indexOf(memberToBeDeleted));
            else            //if not
                System.out.println("This student is not a member.");
        }catch (NullPointerException ex){
            System.out.println("Attempt to delete a non-existent student.");
        }

    }

    public void AssignMemberDuty(Student std, String duty){
        if(members.contains(std)) {
            for (Object key : std.getSocietyDuties().keySet()) {
                if(key==this)
                    std.getSocietyDuties().replace(key, duty);
            }
        }
        else
            System.out.println("This student is not a member.");
    }


}
