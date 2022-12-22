public class Secretary extends Staff{
    Secretary(long id,String task_info,String working_hours,int yofServ)
    {
        super(id,task_info,working_hours,yofServ);
    }


    /*
     * Lecturers can give up to 9 courses, so we check for
     * those conditions and if met, setting the lecturer as the
     * course's lecturer.
     */
    public boolean appointLecToUgCourse(Lecturer lec, UndergradCourse ugcourse)
    {
        try{
            if(lec.countCourses()>9){
                System.out.println("This lecturer accessed to max course number.");
                return false;
            }

            if(lec.getUndgradCourses().contains(ugcourse)) {
                System.out.println("Lecturer already gives this course.");
                return false;
            }
            else{
                lec.getUndgradCourses().add(ugcourse);
                return true;
            }
        }
        catch(NullPointerException ex)   //lec or ugcourse might be null
        {
            if(lec==null)System.out.println("Attempt to appoint a non-existent lecturer.");
            if(ugcourse==null)System.out.println("Attempt to appoint a non-existent course");
        }
        return false;
    }

    public boolean appointLecToGCourse(Lecturer lec, GradCourse gcourse)
    {
        try{
            if(lec.countCourses()>9){
                System.out.println("This lecturer accessed to max course number.");
                return false;
            }

            if(lec.getGradCourses().contains(gcourse)) {
                System.out.println("Lecturer already gives this course.");
                return false;
            }
            else{
                lec.getGradCourses().add(gcourse);
                return true;
            }

        }
        catch(NullPointerException ex)   //lec or gcourse might be null
        {
            if(lec==null)System.out.println("Attempt to appoint a non-existent lecturer.");
            if(gcourse==null)System.out.println("Attempt to appoint a non-existent course");
        }
        return false;
    }


    public void removeLecFromUgCourse(Lecturer lec, UndergradCourse ugcourse)
    {
        try{lec.getUndgradCourses().remove(ugcourse);}
        catch(NullPointerException ex) {System.out.println(ex.getMessage());}         //same exception as above
    }

    public void removeLecFromGCourse(Lecturer lec, GradCourse ugcourse)
    {
        try{lec.getGradCourses().remove(ugcourse);}
        catch(NullPointerException ex) {System.out.println(ex.getMessage());}         //same exception as above
    }



    //When a student wants to drop a course, secretary checks if it is possible
    public void DropUndgradCourse(UndergradStudent std,UndergradCourse course) {
        try {
            if (std.getTotalcredit() > 30) {
                std.getUndgradCourses().remove(course);
            } else
                System.out.println("This student do not have enough credit to drop a course.");

        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());        //student or course might be non-existent
        }
    }
    public void DropGradCourse(GradStudent std,GradCourse course) {
        try {
            if (std.getTotalcredit() > 20) {
                std.getGradCourses().remove(course);
            } else
                System.out.println("This student do not have enough credit to drop a course.");

        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());    //student or course might be non-existent
        }
    }


}


