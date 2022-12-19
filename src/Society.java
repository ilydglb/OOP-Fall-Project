import java.util.*;

public class Society {
    public String societyName;
    public Student leader;
    public Lecturer societySupervisor;
    private List<UndergradStudent> members = new ArrayList<>();

    Society(String sname, Student lead, Lecturer supervisor){
        societyName = sname;
        leader = lead;
        societySupervisor = supervisor;
    }

    public List<UndergradStudent> getMembers() {
        return members;
    }

    public void setMembers(List<UndergradStudent> members) {
        this.members = members;
    }

    public void addMember(UndergradStudent member){
        this.members.add(member);
        member.getsocieties().add(this);
    }
    public void removeMember(UndergradStudent memberToBeDeleted){
        try {
            this.members.remove(this.members.indexOf(memberToBeDeleted));
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }

    }
}
