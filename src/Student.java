import java.util.*;
public abstract class Student {

    private String name_surname;
    private long id;
    private int year;
    private double GPA = 0.0;

    private List <Society> societies = new ArrayList<>();

    public List getsocieties(){
        return this.societies;
    }


    Student(String name,long id,int year)
    {
        this.name_surname=name;
        this.id=id;
        this.year=year;
    } //When each student registers through the system, it is obligatory to enter name_surname, id number and year information.

    public String getName_Surname(){
        return this.name_surname;
    }
    public long getID(){
        return this.id;
    }
    public int getYear(){
        return this.year;
    }

    //There are no set methods because students' information cannot be edited.
    public String toString()    //overriding toString method of class Object to get name_surname etc. instead of getting the hash code
    {
        return "name surname: "+ name_surname + " id: " + id;
    }


    //Creating a hashmap to store courses and its grades together as key/value pairs
    private HashMap<String, String> grademap = new HashMap<>();
    public void setGrade(Course course,String grade){
        grademap.put(course.getName(),grade);

        GradeAdjustment(course,this,grade);
    }
    public HashMap getGrades(){
        return grademap;
    }

    public double CalculateWeight(int credit, String grade){    //to calculate how much a letter grade effects GPA
        double n=0.0;

        if(grade.equals("AA"))
            n=4.0*credit;
        if(grade.equals("BA"))
            n=3.5*credit;
        if(grade.equals("BB"))
            n=3.0*credit;
        if(grade.equals("CB"))
            n=2.5*credit;
        if(grade.equals("CC"))
            n=2.0*credit;
        if(grade.equals("DC"))
            n=1.5*credit;
        if(grade.equals("DD"))
            n=1.0*credit;
        if(grade.equals("FD"))
            n=0.5*credit;
        if(grade.equals("FF"))
            n=0.0*credit;

        return n;
    }

   private int totalcredit=0;

    public int getTotalcredit() {
        return totalcredit;
    }

    private double weight=0.0;
    void GradeAdjustment(Course c,Student std,String grade)
    {
        totalcredit+=c.getCredit();
        weight+=std.CalculateWeight(c.getCredit(),grade);

        GPA=(weight/totalcredit);
        System.out.println(GPA);
    }

    public double getGPA(){
        return this.GPA;
    }

    private HashMap<String, Integer> course_attendance = new HashMap<>();

    public void setAttendance(Course course,Integer attendance){
        course_attendance.put(course.getName(),attendance);
        FailOfAttendance(course,attendance);
    }
    public HashMap getAttendence(){
        return course_attendance;
    }

    public void FailOfAttendance(Course course,Integer attendance){
        if(attendance < course.getCourseHour()*14*70/100)
            grademap.replace(course.getName(), "FF");
        GradeAdjustment(course,this,"FF");
    }

    //abstract methods which is implemented in child classes of Student (which are GradStudent and UndergradStudent)
    public abstract void getStudentCourses();
    public abstract int countCourses();

}
