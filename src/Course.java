public abstract class Course {
    protected  String name;
    protected long course_code;
    protected int credit;
    protected Area location;
    protected Lecturer lecturer;
    protected String notes;

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





}
