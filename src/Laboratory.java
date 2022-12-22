import java.util.ArrayList;
import java.util.List;

public class Laboratory extends Area{

    private List<String> labtools = new ArrayList<>();
    private Course co;

    Laboratory(String name,String openbetween,String usage,Course c){
        super(name,openbetween,usage);
        setCo(c);
    }

    public Course getCourse() {
        return co;
    }

    public void setCo(Course co) {
        this.co = co;
    }
}
