import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        UndergradStudent std1 = new UndergradStudent("ilayda golbasi", 201180026, 2);   //creating student object for an undergrad student as an example

        UndergradCourse co1=new UndergradCourse("Math",101,6,4);
        UndergradCourse co2=new UndergradCourse("Physics",103,6,4);

        List <UndergradCourse> std1courses=new ArrayList<>();   //creating an ArrayList for courses of std1 (and below, adding the courses to this list)
        std1courses.add(co1);

        std1.setUndgradCourses(std1courses);    //sending this course list to std1's setCourses method to set student's course list

        co1.setstdID(std1.getID());  //adding std1's id to co1
        co1.getstdIDs();    //printing ids of students who is taking co1

        std1.setGrade(co1,"AA");
        System.out.println(std1.getGPA());
        System.out.println(std1.getGrades());       //printing grades of the student (as a hashmap)

        std1.setAttendance(co1,20);     //setting a low attandence for co1
        System.out.println(std1.getGPA());       //as can be seen here, this also updates grades and GPA
        System.out.println(std1.getGrades());   //student fails the class even if he/she got high grades on exams


        std1courses.add(co2);
        co2.setstdID(std1.getID());  //adding std1's id to co2
        co2.getstdIDs();    //printing ids of students who is taking co2
        std1.setGrade(co2,"BA");


        System.out.println(std1.getGPA());  //printing GPA again to see the change
        System.out.println(std1.getGrades());



        Lecturer lec1=new Lecturer("Aybike Dilbaz",1111,5);
        Secretary sec1=new Secretary(123,"secretary","9.00-17.00",10);

        //Lecturers can be added, removed and replaced from a course by secretary.
        sec1.appointLecToCourse(lec1,co1);

        Lecturer lec2=new Lecturer("Dsfsd Ysdsf",1112,10);

        /*
         * Lecturers can add notes to a course but only if they are
         * the lecturer of that given course.
         */
        co1.addNotes(lec1,"sdklfmdskfmsdfsdf");     //lec1 can add notes to co1
        co1.addNotes(lec2,"sdklfmdskfmsdfsdf");     //but lec2 can't because the object doesn't have the course


        //Creating a new office and assigning that office to a lecturer.
        //This data is hold in both objects.
        LecturerOffice lecOf2= new LecturerOffice("Lecturer Office 1","9.00-17.00","lecturer office",lec2,45);

        /*
         * Creating a lecturer and setting that lecturer as the
         * head of department as only the head of department
         * can give a graduation certificate to a student.
         */
        Lecturer headOfDep=new Lecturer("asdsad ksmdska",3333,20,true);
        headOfDep.giveGraduationCertificate(std1);

        DoctoralStudent std2 = new  DoctoralStudent("Msjksdgfds Ksjbfsd", 22222222, 2);
        headOfDep.giveGraduationCertificate(std2);  //gives a null pointer exception as std2 doesn't even have courses

        Classroom c1 =new Classroom("Fey","9.00-17.00","Math and Physics",400);   //creating a classroom
        co1.setLocation(c1);        //and setting location of a course this classroom


        CleaningStaff cs1=new CleaningStaff(123,"cleaning dining halls and library","9.00-17.00",10);  //creating a CleaningStaff object

        Area library=new Area("(birinin ismi) Library","7/24","main library"); //creating an Area object as an example
        library.setCS(cs1);     //setting the object who is responsible from cleaning the library

        CleaningStaff cs2=new CleaningStaff(124,"cleaning classrooms","9.00-17.00",5);    //creating another CleaningStaff object

        c1.setCS(cs2);  //setting the object who is responsible from cleaning the c1 classroom


        UndergradStudent std3 = new UndergradStudent("Ahmet Ergül",118080045,2);
        Lecturer testLect = new Lecturer("Şadi Evren Şeker", 654654654,5);
        Society newSociety = new Society("AI Society", std3,testLect);
        newSociety.addMember(std1);
        System.out.println(newSociety.getMembers());
        newSociety.removeMember(std1);

        lec2.setTitle("Dr.");   //we set a title for lec2

    }
}
