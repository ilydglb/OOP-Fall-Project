import java.util.List;
public class UndergradStudent extends Student {
    List <UndergradCourse> ugcourses;   //Creating a list of Undergrad Courses since undergraduate students can only take undergraduate courses
    UndergradStudent(String name,long id,int year)
    {
        super(name, id, year);
    }



    public List<UndergradCourse> getUndgradCourses()
    {
        return ugcourses;
    }
    public void setUndgradCourses(List<UndergradCourse> s)
    {
        for(UndergradCourse course :s){     //checking if the course has reached its max number of students
            if( course.getI()==course.getidArr().length)
                s.remove(course);   //if the course is full, we remove it from student's temporary course list.
        }
        this.ugcourses =s;
    }

    /*
     * Override the getStudentCourses function as this is
     * different than the one from super class'
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
