import java.util.*;
public class UndergradStudent extends Student {
    List <UndergradCourse> ugcourses=new ArrayList<>();   //Creating a list of Undergrad Courses since undergraduate students can only take undergraduate courses
    UndergradStudent(String name,long id,int year)
    {
        super(name, id, year);
    }


    public void addUndgradCourse(UndergradCourse course){
        try{
            if( course.getI()==course.getidArr().length)
                System.out.println("This course is full so can not be added to student's course list.");

            if(ugcourses.contains(course))
                System.out.println("Student already takes this course.");

            else
                this.ugcourses.add(course);
        }catch(NullPointerException ex){System.out.println("Student takes a non-existent course.");}
    }
    public List<UndergradCourse> getUndgradCourses() {return ugcourses;}

    /*
     * Override the getStudentCourses function as this is
     * different from the one from super class'
    */
    @Override
    public void getStudentCourses()
    {
        List <UndergradCourse> c = this. getUndgradCourses();
        System.out.println("Student:"); //printing student info
        System.out.println(this);     //System.out.println(this.toString());
        if(c!=null){        //print the courses if they exist.
            System.out.println("ugcourses taken this semester:");
            for(UndergradCourse stdcourse : c)
            {
                System.out.println( stdcourse.getName() );
            }
        }
        else
            System.out.println("This student does not have a course saved in the system.");
    }
    @Override
    public int countCourses()
    {
        int numofugcourses = 0;
        for(UndergradCourse course : ugcourses)
            numofugcourses++;

        return numofugcourses;
    }

}
