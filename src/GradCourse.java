
public class GradCourse extends Course{
    GradCourse(String name,long course_code,int credit,int hour)
    {
      super(name,course_code,credit,hour);
    }

    public void setLecturer(Lecturer lecturer,Secretary sec)
    {
        if(sec.appointLecToGCourse(lecturer,this))
            this.lecturer = lecturer;
    }

}
