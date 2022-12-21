public class LecturerOffice extends Area{
    private Lecturer lecturer;
    private int officeNo;

    LecturerOffice(String name,String openbetween,String usage, Lecturer lec,int officeno)
    {
        super(name,openbetween,usage);
        setLecturer(lec);
        setOfficeNo(officeno);
        /*
         * Send the "this" property as it refers to the current object.
         */
        lec.setLecturerOffice(this);
    }

    public void setLecturer(Lecturer lecturer) {this.lecturer = lecturer;}

    public Lecturer getLecturer() {return lecturer;}

    public void setOfficeNo(int officeNo) {this.officeNo = officeNo;}

    public int getOfficeNo() {return officeNo;}
}
