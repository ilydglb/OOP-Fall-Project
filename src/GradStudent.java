import java.util.*;

public abstract class GradStudent extends Student  {
    List<GradCourse> gcourses=new ArrayList<>();  //Creating a list of Grad Courses since graduate students can only take graduate courses
    GradStudent(String name,long id,int year)
    {
        super(name, id, year);
    }


    public void addGradCourse(GradCourse course){
        try{
            if( course.getI()==course.getidArr().length)
                System.out.println("This course is full so can not be added to student's course list.");

            if(gcourses.contains(course))
                System.out.println("Student already takes this course.");

            else
            this.gcourses.add(course);
        }catch(NullPointerException ex){System.out.println("Student takes a non-existent course.");}
    }


    public List<GradCourse>  getGradCourses()
    {
        return gcourses;
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