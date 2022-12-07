import java.util.List;

public abstract class Staff {
    private long id;
    private String task_info;
    private String working_hours;

    Staff(long id,String task_info,String working_hours){
        this.id=id;
        this.task_info=task_info;
        this.working_hours=working_hours;
    }

    public void appointLecturer(Lecturer lec)
    {

    }


}
