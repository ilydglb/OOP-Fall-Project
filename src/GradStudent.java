import java.util.List;

public abstract class GradStudent extends Student  {
    List<GradCourse> gcourses;  //Creating a list of Grad Courses since graduate students can only take graduate courses
    GradStudent(String name,long id,int year)
    {
        super(name, id, year);
    }

    public List<GradCourse>  getGradCourses()
    {
        return gcourses;
    }
    public void setGradCourses(List<GradCourse> s) {

        for(GradCourse course :s){     //checking if the course has reached its max number of students
            if( course.getI()==course.getidArr().length)
                s.remove(course);      //if the course is full, we remove it from student's temporary course list.
        }
        this.gcourses =s;
    }
    @Override
    public void getStudentCourses()
    {
        List <GradCourse> c = this. getGradCourses();
        System.out.println("Student:"); //printing student info
        System.out.println(this);     //System.out.println(this.toString());
        if(c!=null){        //if the student takes any course
            System.out.println("Courses taken this semester:");
            for(GradCourse stdcourse : c)
            {
                System.out.println( stdcourse.getName() );
            }}
        else
            System.out.println("This student does not have a course saved in the system.");
    }

    @Override
    public int countCourses()
    {
        int numofcourses = 0;
        for(GradCourse gcourse : gcourses)
            numofcourses++;

        return numofcourses;
    }


}