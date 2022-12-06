public class UndergradCourse extends Course{
    UndergradCourse(String name,long course_code,int credit) //When creating a course through the system, it will be created together with the course code, name, and credit information.
    {
<<<<<<< HEAD
        this.name = name;
=======
        this.setName(name);
>>>>>>> e6c69d3 (Initial commit)
        this.course_code=course_code;
        this.credit=credit;
    }
}
