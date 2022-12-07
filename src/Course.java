public abstract class Course {
<<<<<<< HEAD
    protected  String name;
    protected long course_code;
    protected int credit;
    protected Area location;
    protected Lecturer lecturer;
    protected String notes;

=======
    private  String name;
    protected long course_code;
    protected int credit;
    protected Classroom  location;
    protected Lecturer lecturer;
    protected String notes;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
    return this.name;
    }
>>>>>>> e6c69d3 (Initial commit)
    public void setLecturer(Lecturer lecturer)
    {
        this.lecturer=lecturer;

    }

    public void addNotes(Lecturer lec, String note){
        if(lec==lecturer)
            this.notes=note;
         else
            System.out.println("This instructor is not the lecturer of this course.");
<<<<<<< HEAD
}
=======
    }

    public void setLocation(Classroom loc){
        this.location=loc;
    }


>>>>>>> e6c69d3 (Initial commit)





}
