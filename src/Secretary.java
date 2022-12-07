import java.util.*;

public class Secretary extends Staff{
    Secretary(long id,String task_info,String working_hours)
    {
        super(id,task_info,working_hours);
    }

    public void appointLecToCourse(Lecturer lec, UndergradCourse ugcourse)
    {
        lec.UndergradCoursesData().add(ugcourse);
        ugcourse.setLecturer(lec);
    }

    public void removeLecFromCourse(){


    }
}
