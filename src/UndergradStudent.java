import java.util.*;
public class UndergradStudent extends Student {
    List <UndergradCourse> courses;
    UndergradStudent(String name,long id,int year)
    {
        super(name, id, year);
    }



    public List<UndergradCourse> coursesData()
    {
        return courses;
    }
    public void setCourses(List<UndergradCourse> s) {
        this.courses =s;

    }

    @Override
    public void getStudentCourses(){
        List <UndergradCourse> c = this.coursesData();
        System.out.println("Student:");
        System.out.println(this);     //System.out.println(this.toString());
        if(c!=null){
            System.out.println("Courses taken this semester:");
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
        int numofcourses = 0;
        for(UndergradCourse course : courses)
            numofcourses++;

        return numofcourses;
    }



}
