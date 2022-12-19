import java.util.*;
public class Secretary extends Staff{
    Secretary(long id,String task_info,String working_hours,int yofServ)
    {
        super(id,task_info,working_hours,yofServ);
    }


    /*
     * Lecturers can give up to 9 courses so we check for
     * those conditions and if met, setting the lecturer as the
     * course's lecturer.
     */
    public void appointLecToCourse(Lecturer lec, UndergradCourse ugcourse)
    {
        try{
            if(lec.countCourses()>9)
                System.out.println("This lecturer accessed to max course number.");

            lec.UndgradCourseData().add(ugcourse);
            setLecturerforUgCourse(lec,ugcourse);
        }
        catch(NullPointerException ex)   //lec might be null (or ugcourse could be, if we did not initialize it when creating Lecturer object)
        {
            System.out.println(ex.getMessage());
        }
    }


    public void removeLecFromCourse(Lecturer lec, UndergradCourse ugcourse)
    {
    try{lec.UndgradCourseData().remove(ugcourse);}
    catch(NullPointerException ex) {System.out.println(ex.getMessage());}   //same reason as above
    }

    public void setLecturerforUgCourse(Lecturer lec,UndergradCourse ugc)
    {
        try{ugc.setLecturer(lec);}
        catch(NullPointerException ex) {System.out.println(ex.getMessage());}
    }

    public void DropUndgradCourse(UndergradStudent std,UndergradCourse course) {
        try {
            if (std.getTotalcredit() > 30) {
                std.getUndgradCourses().remove(course);
            } else
                System.out.println("This student do not have enough credit to drop a course.");

        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void DropGradCourse(GradStudent std,GradCourse course) {
        try {
            if (std.getTotalcredit() > 20) {
                std.getGradCourses().remove(course);
            } else
                System.out.println("This student do not have enough credit to drop a course.");

        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


