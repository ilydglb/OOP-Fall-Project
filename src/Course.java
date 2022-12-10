import java.util.HashMap;

public abstract class Course {
    private  String name;
    protected long course_code;
    protected int credit;
    protected Classroom  location;
    protected Lecturer lecturer;
    protected String notes;

    private long[] idArr=new long[100];



    Course(String name,long course_code,int credit)  //When creating a course through the system, it will be created together with the course code, name, and credit information.
    {
        this.setName(name);
        this.course_code=course_code;
        this.credit=credit;
    }


    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }



    public void addNotes(Lecturer lec, String note){
        if(lec==lecturer)
            this.notes=note;
        else
            System.out.println("This instructor is not the lecturer of this course.");

    }

    int i=0;
public void setstdID(long id){
        idArr[i]=id;
        i++;
}
public void getstdIDs(){
    for (long element: idArr) {
        if(element!=0)
        System.out.println(element);
    }
}

    public void setLocation(Classroom loc){
        this.location=loc;
    }

   /* private HashMap<String, String> studentIDmap = new HashMap<>();
    public void setStudentIDmap(String course,Student std){
        studentIDmap .put(course,std.getID());
    }
    public HashMap getStudentID(){
        return studentIDmap ;
    }*/



}
