import java.util.*;
public class Lecturer {
    private String name_surname;
    private long id;
    private List<GradCourse> gcourses = new ArrayList<>();
    private List<UndergradCourse> ugcourses = new ArrayList<>();  //assigning courses and creating empty course lists.
    private LecturerOffice office;
    private boolean isHeadOfDepartment = false;
    private String title;   //title of the lecturer (like Dr.)
                            //we don't have this attribute inside constructor because there might be no title
                            //so we can set it with set function
    private int yearOfService;  //we use this attribution when calculating salary
    private int monthlysalary=14000;   //base monthly salary


    Lecturer(String ns, long id,int yearOfService){
        name_surname = ns;
        this.id = id;
        this.yearOfService=yearOfService;

    }
    Lecturer(String ns, long id,int yearOfService, boolean isHead) //using constructor overloading for creating head of department object.
    {
        name_surname = ns;
        this.id = id;
        this.yearOfService=yearOfService;
        this.isHeadOfDepartment = isHead;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void giveGraduationCertificate(Student std) {
        try {
            if (isHeadOfDepartment) {
                if (std instanceof GradStudent) {       //if the student is a graduate student
                    if (std instanceof MasterStudent) {
                        if (std.countCourses() >= 7 && std.getGPA() >= 2.5) //courses that the student took must be equal or over 7 and the GPA must be over 2.00
                            System.out.println("Student can graduate.");
                    } else if (std instanceof DoctoralStudent) {
                        if (std.countCourses() >= 8 && std.getGPA() >= 3)
                            System.out.println("Student can graduate.");
                    }
                } else if (std instanceof UndergradStudent) {       //if the student is a undergraduate student
                    if (std.countCourses() > 20 && std.getGPA() >= 2.00)
                        System.out.println("Student can graduate.");

                }
                System.out.println("Student can not graduate.");
            } else
                System.out.println("This lecturer does not have the authority to give graduate certificate.");
        } catch (NullPointerException ex)  //Works if the student does not have any courses yet(so the courses are null
        {
            System.out.println(ex.getMessage());}

    }

    public void setAsHeadOfDepartment() {
        isHeadOfDepartment = true;
    }
    public void removeHeadOfDepartment() {
        isHeadOfDepartment = false;
    }

    public List<GradCourse> GradCourseData(){ return gcourses;}
    public List<UndergradCourse> UndgradCourseData()
    {
        return ugcourses;
    }

    public int countCourses()
    {
        int numofcourses = 0;
        for(GradCourse course  : gcourses)  //counting graduate courses the lecturer is giving
            numofcourses++;

        for(UndergradCourse course : ugcourses)    //counting undergraduate courses the lecturer is giving
            numofcourses++;

        return numofcourses;
    }

    public void setLecturerOffice(LecturerOffice lecof){
        this.office=lecof;
    }

    public void Calculatemonthlysalary(){
        if(this.title.equals("Dr.")){
            monthlysalary+=2500;

            if(yearOfService>=6&&yearOfService<9)
                monthlysalary+=200;
            if(yearOfService>=9)
                monthlysalary+=300;
        }
        if(this.title.equals("ASSOC")){ //abbreviation of associate professor
            monthlysalary+=3000;

            if(yearOfService>=12&&yearOfService<15)
                monthlysalary+=400;
            if(yearOfService>=15&&yearOfService<25)
                monthlysalary+=500;
            if(yearOfService>=25)
                monthlysalary+=600;
        }
        if(this.title.equals("Prof.")){
            monthlysalary+=5500;

            if(yearOfService>=15)
                monthlysalary+=2000;
            if(yearOfService>=25)
                monthlysalary+=3000;
        }
        
    } //these numbers are imaginary

}
