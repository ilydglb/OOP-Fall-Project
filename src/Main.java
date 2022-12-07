import java.util.*;

public class Main {
    public static void main(String[] args)
    {
   /* int inp, inp2, inp3;
    Student[] arrStd=new Student[100];
    Lecturer[] arrLec=new Lecturer[20];
    UndergradCourse[] arrUgradCourse=new UndergradCourse[20];
    int i=0;
    int j=0;
    do {
        System.out.println("Choose the part of the department you would like to manage: ");
        System.out.println("1-Lecturers\n2-Students\n3-Courses\n4-Areas\n5-Staff\nPress 6 to exit console.");
        Scanner input = new Scanner(System.in);
         inp = input.nextInt();
        switch (inp) {
            case 1:
                System.out.println("1-Add lecturer\n2-Add course to a lecturer\nPress 6 to exit console.");
                inp2=input.nextInt();
                switch (inp2){
                    case 1:
                        System.out.println("Enter lecturer's name and surname:");
                        String ns=input.next();
                        System.out.println("Enter lecturer's id:");
                        long id=input.nextLong();
                        arrLec[i]=new Lecturer(ns,id);
                        i++;
                        break;
                    case 2:
                        System.out.println("1-Add undergraduate course\n2-Add graduate course\nPress 6 to exit console.");
                        inp3=input.nextInt();
                        switch (inp3){
                            case 1:
                                arrLeccourses[j]=new ArrayList<>();
                                System.out.println("Which course would you like to assign to lecturer?");
                                lec1courses.add(co1);
                                co1.setLecturer(lec1);
                        }
                }
        }
    }while(inp!=6);*/

        UndergradStudent std1 = new UndergradStudent("ilayda golbasi", 201180026, 2);
        UndergradStudent std2 = new UndergradStudent("mina unal", 201180042, 2);
        UndergradCourse co1=new UndergradCourse("Math",101,6);
        UndergradCourse co2=new UndergradCourse("Physics",105,6);

        List <UndergradCourse> std1courses=new ArrayList<>();
       // List <UndergradCourse> std2courses=new ArrayList<>();
        std1courses.add(co1);
        std1courses.add(co2);
      //  std2courses.add(co2);

        std1.setCourses(std1courses);
      //  std2.setCourses(std2courses);

        std1.GradeAdjustment(std1courses,std1);
        System.out.println(std1.getGrades());

        Secretary sec1=new Secretary(123,"secretary","9-17");
        Lecturer lec1=new Lecturer("Uraz Yavanoglu",1111);



        sec1.appointLecToCourse(lec1,co1);

        lec1.UndergradCoursesData().add(co2);
        co2.setLecturer(lec1);

        lec1.setUndergradCourses(lec1.UndergradCoursesData());

        Lecturer lec2=new Lecturer("dsfsd Ysdsf",1112);
        co1.addNotes(lec1,"sdklfmdskfmsdfsdf");
        co1.addNotes(lec2,"sdklfmdskfmsdfsdf");

        LecturerOffice lecOf2= new LecturerOffice(lec2,45); //office has a lecturer but lecturer doesn't have an office
        lec2.setLecturerOffice(lecOf2);

        std2.getStudentCourses();
        std1.getStudentCourses();





    }
}
