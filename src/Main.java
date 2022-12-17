import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        UndergradStudent std1 = new UndergradStudent("ilayda golbasi", 201180026, 2);
        UndergradStudent std2 = new UndergradStudent("mina unal", 22222222, 2);
        UndergradCourse co1=new UndergradCourse("Math",101,6);
        UndergradCourse co2=new UndergradCourse("Physics",105,6);

        List <UndergradCourse> std1courses=new ArrayList<>();
       // List <UndergradCourse> std2courses=new ArrayList<>();
        std1courses.add(co1);
        std1courses.add(co2);
      //  std2courses.add(co2);

        std1.setCourses(std1courses);
      //  std2.setCourses(std2courses);
        co1.setstdID(std1.id);
        co1.setstdID(std2.id);
        co1.getstdIDs();


        std1.GradeAdjustment(std1courses,std1);
        System.out.println(std1.getGrades());

        Secretary sec1=new Secretary(123,"secretary","9-17");
        Lecturer lec1=new Lecturer("Uraz Yavanoglu",1111);

        sec1.appointLecToCourse(lec1,co1);
        sec1.removeLecFromCourse(lec1,co1);



        Lecturer lec2=new Lecturer("dsfsd Ysdsf",1112);
        co1.addNotes(lec1,"sdklfmdskfmsdfsdf");
        co1.addNotes(lec2,"sdklfmdskfmsdfsdf");

        LecturerOffice lecOf2= new LecturerOffice(lec2,45); //office has a lecturer but lecturer doesn't have an office
        lec2.setLecturerOffice(lecOf2);     //this way lecturer has an office

        std2.getStudentCourses();
        std1.getStudentCourses();
       // System.out.println(lec1.UndgradCourseData());

        Lecturer lecc=null;     //exception denemesi
      //  sec1.removeLecFromCourse(lecc,co1);


        Lecturer headOfDep=new Lecturer("asdsad ksmdska",3333);
        headOfDep.headOfDepartment=headOfDep;
        headOfDep.giveGraduationCertificate(headOfDep,std1);

        DoctoralStudent std5 = new  DoctoralStudent("mina unal", 22222222, 2);
        //headOfDep.giveGraduationCertificate(headOfDep,std5);

        Social sportshall =new Social();


    }
}
