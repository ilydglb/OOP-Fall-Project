import java.util.*;
public class Lecturer {
    private String name_surname;
    private long id;
    private List<GradCourse> gcourses;
    private List<UndergradCourse> ugcourses;


    private LecturerOffice office;

    public Lecturer headOfDepartment;

    public void giveGraduationCertificate(Lecturer lec, Student std){
try {
    if (lec == headOfDepartment) {
        if (std instanceof GradStudent) {
            if (std instanceof MasterStudent) {
                if (std.countCourses() >= 7 && std.getGPA() >= 2.5)
                    System.out.println("Student can graduate.");
            } else if (std instanceof DoctoralStudent) {
                if (std.countCourses() >= 8 && std.getGPA() >= 3)
                    System.out.println("Student can graduate.");
            }
        } else if (std instanceof UndergradStudent) {
            if (std.countCourses() > 20 && std.getGPA() >= 2.00)
                System.out.println("Student can graduate.");

        }
        System.out.println("Student can not graduate.");
    }
    System.out.println("This lecturer does not have the authority to give graduate certificate.");
}
catch(NullPointerException ex)  //Works if the student does not have any courses yet(so the courses are null and will be returned null and this will effect countCourses())
{
    System.out.println(ex.getMessage());
}
    }



    Lecturer(String ns,long id)
    {
        name_surname=ns;
        this.id=id;
        ugcourses=new ArrayList<>();
        gcourses=new ArrayList<>();
    }


    public List<GradCourse> GradCourseData(){ return gcourses;}



    public List<UndergradCourse> UndgradCourseData()
    {
        return ugcourses;
    }



    public int countCourses()
    {
        int numofcourses = 0;
        for(GradCourse course  : gcourses)
            numofcourses++;

        for(UndergradCourse course : ugcourses)
            numofcourses++;

        return numofcourses;
    }


    public void setLecturerOffice(LecturerOffice lecof){
        this.office=lecof;
    }

}
