public class LecturerOffice extends Area{
    private Lecturer lecturer;
    private int officeNo;

    LecturerOffice(String name,String openbetween,String usage, Lecturer lec,int officeNo)
    {
        super(name,openbetween,usage);
        this.lecturer=lec;
        this.officeNo=officeNo;
        /*
         * Send the "this" property as it refers to the current object.
         */
        lec.setLecturerOffice(this);
    }
}
