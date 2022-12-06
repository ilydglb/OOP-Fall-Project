import java.util.*;
public abstract class Student {

    protected long id;
    protected String name_surname;
    protected int year;

    protected float GPA=0;



    public String getName_Surname(){
        return this.name_surname;
    }
<<<<<<< HEAD
    public int getYear(){
        return this.year;
    }
=======
    //public void setName_Surname(String ns){this.name_surname=ns;} //name_surname private yapılırsa
    public int getYear(){
        return this.year;
    }
    public void setYear(String ns){this.name_surname=ns;}
>>>>>>> e6c69d3 (Initial commit)
    public long getID(){
        return this.id;
    }
    //There are no set methods because students' information cannot be edited.

    HashMap<String, String> grademap = new HashMap<>();  //String for grade
    public void setGrade(String c,String grade){
        grademap.put(c,grade);
    }
    public HashMap getGrades(){
        return grademap;
    }

<<<<<<< HEAD
=======

   //Buranin altini sonradan abstract yapip undergrada ayri yazabilirim, simdilik kalsin

>>>>>>> e6c69d3 (Initial commit)
    public double CalculateWeight(int credit, String grade){
        double n=0.0;
       
           if(grade.equals("AA"))
               n=4.0*credit;
           if(grade.equals("BA"))
               n=3.5*credit;
            if(grade.equals("BB"))
                n=3.0*credit;
            if(grade.equals("CB"))
                n=2.5*credit;
            if(grade.equals("CC"))
                n=2.0*credit;
            if(grade.equals("DC"))
                n=1.5*credit;
            if(grade.equals("DD"))
                n=1.0*credit;
            if(grade.equals("FD"))
                n=0.5*credit;
            if(grade.equals("FF"))
                n=0.0*credit;
        
        return n;
    }

    void GradeAdjustment(List <UndergradCourse> stdcourses,Student std){
        int totalcredit=0;
        double weight=0.0;
        for(Course c : stdcourses){
<<<<<<< HEAD
            System.out.printf("Enter grade for %s: ",c.name);
            Scanner input = new Scanner(System.in);
            String grade = input.next();

            std.setGrade(c.name,grade);
=======
            System.out.printf("Enter grade for %s: ",c.getName());
            Scanner input = new Scanner(System.in);
            String grade = input.next();

            std.setGrade(c.getName(),grade);
>>>>>>> e6c69d3 (Initial commit)

            totalcredit+=c.credit;
            weight+=std.CalculateWeight(c.credit,grade);
        }
        double GPA=(weight/totalcredit);
        System.out.println(GPA);
    }

<<<<<<< HEAD











=======
>>>>>>> e6c69d3 (Initial commit)
}
