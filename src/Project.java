import java.util.ArrayList;
import java.util.List;

public class Project {

    private String name;
    private String subject;
    private String about;
    private Laboratory lab;
    private Course co;
    private List <Student> students=new ArrayList<>();
    private Lecturer headlec;


    Project(String nme,String sbj,Laboratory lb,Course cou){
            setName(nme);
            setSubject(sbj);
            setLab(lb);
            setCo(cou);
    }

    public void setName(String name) {this.name = name;}

    public String getName() {return name;}

    public void setSubject(String subject) {this.subject = subject;}

    public String getSubject() {return subject;}

    public void setLab(Laboratory lab) {this.lab = lab;}

    public Laboratory getLab() {return lab;}

    public void setCo(Course co) {
        if( co.CourseforProject(this,lab))this.co = co;}

    public Course getCo() {return co;}

    public void setAbout(String about) {this.about = about;}

    public String getAbout() {return about;}
    public void setHead(Lecturer head) {

            this.headlec = head;
    }

    public Lecturer getHead() {return headlec;}

    public List<Student> getStudents() {return students;}
    public void addUgStudent(UndergradStudent std){
       try{
            if(students.contains(std))       //if student list of the project contains the member to be
                System.out.println("The student is already a member.");

            else {
                if(this.co.AssignUgStdToProj(std,this))
                    this.students.add(std);           //adding member student to be to the project
            }
        }catch (NullPointerException ex){System.out.println("Attempt to add a non-existent student.");}
    }
    public void addGradStudent(GradStudent std){
        try{
            if(students.contains(std))       //if student list of the project contains the member to be
                System.out.println("The student is already a member.");

            else {
                if(this.co.AssignGradStdToProj(std,this))
                    this.students.add(std);           //adding member student to be to the project
            }
        }catch (NullPointerException ex){System.out.println("Attempt to add a non-existent student.");}
    }
}
