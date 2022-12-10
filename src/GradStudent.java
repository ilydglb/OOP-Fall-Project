import java.util.List;

public abstract class GradStudent extends Student  {
    List<GradCourse> courses;
    GradStudent(String name,long id,int year)
    {
        super(name, id, year);
    }

    public List<GradCourse> coursesData()
    {
        return courses;
    }
    public void setCourses(List<GradCourse> s) {
        this.courses =s;
    }
    @Override
    public void getStudentCourses()
    {
        List <GradCourse> c = this.coursesData();
        System.out.println("Student:");
        System.out.println(this);     //System.out.println(this.toString());
        if(c!=null){
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
        for(GradCourse course : courses)
            numofcourses++;

        return numofcourses;
    }


}