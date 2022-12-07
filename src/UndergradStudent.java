import java.util.*;
public class UndergradStudent extends Student {
    List <UndergradCourse> courses;
    UndergradStudent(String name,long id,int year)
    {
        this.name_surname=name;
        this.id=id;
        this.year=year;
    }

    public List<UndergradCourse> coursesData()
    {
        return courses;
    }
    public void setCourses(List<UndergradCourse> s) {
        this.courses =s;
    }

}
