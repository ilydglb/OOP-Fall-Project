import java.util.*;
public class Lecturer {
    private String name_surname;
    private long id;
    private List<GradCourse> gcourses = new ArrayList<>();      //assigning courses and creating empty course lists.
    private List<UndergradCourse> ugcourses = new ArrayList<>();
    private LecturerOffice office;
    private boolean isHeadOfDepartment = false;     //to determine the head of department
                                                    // (we use this variable in constructor overloading below)
                                                    //it is false by default (false for every other Lecturer)
    private String title;   //title of the lecturer (like Dr.)
                            //we don't have this attribute inside constructor because there might be no title
                            //so we can set it with set function
    private int yearOfService;  //we use this attribution when calculating salary
    private int monthly_salary=14000;   //base monthly salary

    private int annualDayOff=30;        //total off days that a lecturer can have in a year

    Lecturer(String ns, long id,int yearOfService){
        name_surname = ns;
        this.id = id;
        this.yearOfService=yearOfService;

    }
    Lecturer(String ns, long ID,int yearofserv, boolean isHead) //using constructor overloading for creating head of department object.
    {
        setName_surname(ns);
        setId(ID);
        setYearOfService(yearofserv);
        setAsHeadOfDepartment(isHead);
    }

    public void setAsHeadOfDepartment(boolean isHeadOfDepartment) {
        this.isHeadOfDepartment = isHeadOfDepartment;
    }

    public void setName_surname(String name_surname) {this.name_surname = name_surname;}
    public String getName_surname() {return name_surname;}
    public void setId(long id) {this.id = id;}
    public long getId() {return id;}
    public List<GradCourse> getGradCourses(){ return gcourses;}     //NOTE: There are no set methods for courses the lecturer is giving inside Lecturer class because only the secretary can appoint lecturer to courses
    public List<UndergradCourse> getUndgradCourses() {return ugcourses;}
    public void setLecturerOffice(LecturerOffice office) {this.office = office;}
    public LecturerOffice getLecturerOffice() {return office;}
    public void setTitle(String title) {this.title = title;}
    public String getTitle() {return title;}

    public void setYearOfService(int yearOfService) {this.yearOfService = yearOfService;}

    public int getYearOfService() {return yearOfService;}

    public int getMonthly_salary(){return monthly_salary;}

    public void addTosalary(int s){
        monthly_salary+=s;
    }

    public int getAnnualDayOff() {return annualDayOff;}
    public void decreaseDay(int offdaycount){
        annualDayOff-=offdaycount;
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
        } catch (NullPointerException ex)  //Works if the student or student's courses are null
        {
            System.out.println(ex.getMessage());}

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

    public void StudentAttendance(Student std,Course course, int attendance){
        if(this.getUndgradCourses().contains(course)||this.getGradCourses().contains(course))   //if this lecturer gives the course, he/she can add a grade
            std.getAttendance().put(course.getName(),attendance);

        else
            System.out.println("This lecturer does not give the course.");
    }
    public void StudentGrading(Student std,Course course,String grade){
        if(this.getUndgradCourses().contains(course)||this.getGradCourses().contains(course)) {  //if this lecturer gives the course, he/she can add a grade

            std.FailOfAttendance(course);        //first, checking if student fails because lack of attendance
            std.getGradeMap().put(course.getName(), grade);   //we put course and grade into the hashmap

            std.GradeAdjustment(course, std, grade); //then we send it to this method to calculate its effect on GPA
        }
        else
            System.out.println("This lecturer does not give the course.");
    }

    public void addCourseTopic(String topic, Course co){
        if(co.getLecturer()==this){
            co.getTopics().add(topic);  //adding a topic into the course's topic list
        }else{
            System.out.println("This action cannot be performed by any other than this course's lecturer.");
        }
    }
    public void removeCourseTopic(String topic, Course co){
        if(co.getLecturer()==this){
            co.getTopics().remove(topic);
        }else{
            System.out.println("This action cannot be performed by any other than this course's lecturer.");
        }
    }

}
