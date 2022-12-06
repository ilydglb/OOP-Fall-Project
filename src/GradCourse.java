import java.util.HashMap;

public class GradCourse extends Course{

    GradCourse(String name,long course_code,int credit) //When creating a course through the system, it will be created together with the course code, name, and credit information.
    {
<<<<<<< HEAD
        this.name = name;
        this.course_code=course_code;
        this.credit=credit;
    }
   // HashMap<GradCourse, String> map = new HashMap<>();  //String for grade
=======
        this.setName(name);
        this.course_code=course_code;
        this.credit=credit;
    }
  
>>>>>>> e6c69d3 (Initial commit)
}
