public class Accountant extends Staff{
    Accountant(long id,String task_info,String working_hours,int yofServ)
    {
        super(id,task_info,working_hours,yofServ);
    }
    public void CalculateLecturerSalary(Lecturer lec){
        if(lec.getTitle().equals("Dr.")){
            lec.addTosalary(2500);

            if(lec.getYearOfService()>=6&&lec.getYearOfService()<9)
                lec.addTosalary(200);
            if(lec.getYearOfService()>=9)
                lec.addTosalary(300);
        }
        if(lec.getTitle().equals("ASSOC")){ //abbreviation of associate professor
            lec.addTosalary(3000);

            if(lec.getYearOfService()>=12&&lec.getYearOfService()<15)
                lec.addTosalary(400);
            if(lec.getYearOfService()>=15&&lec.getYearOfService()<25)
                lec.addTosalary(500);
            if(lec.getYearOfService()>=25)
                lec.addTosalary(600);
        }
        if(lec.getTitle().equals("Prof.")){
            lec.addTosalary(5500);

            if(lec.getYearOfService()>=15)
                lec.addTosalary(2000);
            if(lec.getYearOfService()>=25)
                lec.addTosalary(3000);
        }

    }

    public void CalculateStaffSalary(Staff st){
        if(st instanceof CleaningStaff){
            st.addToSalary(st.getYearOfService()*200);
        }
        if(st instanceof TechnicalStaff){
            st.addToSalary(st.getYearOfService()*220);
        }
        if(st instanceof Secretary){
            st.addToSalary(st.getYearOfService()*250);
        }
    }

    //these numbers are imaginary

    public void DecreaseStaffDayOff(Staff st,int offdaycount){       //when a staff takes some days off, accountant subtracts the days from staff's annual day off count
        if(st.getAnnualDayOff()>0)
            st.decreaseDay(offdaycount);
        else
            System.out.println("There are no off days available");
    }

    public void DecreaseLecturerDayOff(Lecturer lec,int offdaycount){       //when a staff lecturer some days off, accountant subtracts the days from staff's annual day off count
        if(lec.getAnnualDayOff()>0)
            lec.decreaseDay(offdaycount);
        else
            System.out.println("There are no off days available");
    }


}
