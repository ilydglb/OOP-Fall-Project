public abstract class Course {




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

    public void setLecturer(Lecturer lecturer)
    {
        this.lecturer=lecturer;

    }

    public void addNotes(Lecturer lec, String note){
        if(lec==lecturer)
            this.notes=note;
         else
            System.out.println("This instructor is not the lecturer of this course.");

}



    public void setLocation(Classroom loc){
        this.location=loc;
    }






}
