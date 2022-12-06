import java.util.*;
public class Lecturer {
    private String name_surname;
    private long id;
    private List <GradCourse> gcourses;
    private List <UndergradCourse> ugcourses;

    Lecturer(String ns,long id)
    {
        name_surname=ns;
        this.id=id;
    }

    public List<UndergradCourse> UndergradCoursesData()
    {
        return ugcourses;
    }
    public void setGradCourses(List<GradCourse> c)
    {
        this.gcourses =c;
    }

    public List<GradCourse> GradCoursesData()
    {
        return gcourses;
    }
    public void setUndergradCourses(List<UndergradCourse> c)
    {
        this.ugcourses =c;
    }

    public List<GradCourse> GradCourseData()
    {
        return gcourses;
    }

    public void setGradCourse(List<GradCourse> c) {
        if(countCourses()>9)
            System.out.println("This lecturer accessed to max course number.");

        this.gcourses =c;
    }

    public List<UndergradCourse> UndgradCourseData()
    {
        return ugcourses;
    }


    public void setUnderGradCourse(List<UndergradCourse> c) {
        if(countCourses()>9)
            System.out.println("This lecturer accessed to max course number.");

        this.ugcourses =c;
    }

    public int countCourses()
    {
        int numofcourses = 0;
        for(GradCourse course : gcourses)
            numofcourses++;

        for(UndergradCourse course : ugcourses)
            numofcourses++;

        return numofcourses;
    }
}
