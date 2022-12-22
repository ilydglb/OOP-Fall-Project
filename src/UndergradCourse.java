public class UndergradCourse extends Course {
    UndergradCourse(String name, long course_code, int credit,int hour) //When creating a course through the system, it will be created together with the course code, name, and credit information.
    {
        super(name,course_code,credit,hour);
    }

    public void setLecturer(Lecturer lecturer,Secretary sec)
    {
       if(sec.appointLecToUgCourse(lecturer,this))
        this.lecturer = lecturer;
    }

}
