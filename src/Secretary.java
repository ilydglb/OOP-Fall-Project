import java.util.*;

public class Secretary extends Staff{
    Secretary(long id,String task_info,String working_hours)
    {
        super(id,task_info,working_hours);
    }


    public void appointLecToCourse(Lecturer lec, UndergradCourse ugcourse)
    {

        try{                                //lec might be null (or ugcourse if we didn't initialize it when creating Lecturer object)
            if(lec.countCourses()>9)
                System.out.println("This lecturer accessed to max course number.");

            lec.UndgradCourseData().add(ugcourse);
            setLecturerforUgCourse(lec,ugcourse);
        }
        catch(NullPointerException ex)
        {
            System.out.println(ex.getMessage());
        }


    }


    public void removeLecFromCourse(Lecturer lec, UndergradCourse ugcourse)
    {
    try{lec.UndgradCourseData().remove(ugcourse);}
    catch(NullPointerException ex) {System.out.println(ex.getMessage());}
    }


    public void setLecturerforUgCourse(Lecturer lec,UndergradCourse ugc)
    {
        try{ugc.lecturer=lec;}
        catch(NullPointerException ex) {System.out.println(ex.getMessage());}
    }
}


