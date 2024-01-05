import java.text.ParseException;

public class Visit {

    private Person person;
    private String reason;
    private String department;
    private String date;

//    public Visit(Person person, String reason, String department, String date){
    public Visit() throws ParseException {
        this.person = new Person();
        this.reason = GeneralData.getReason();
        this.department = GeneralData.getDepartment(this.reason);
        this.date = new RandomDate().generateRandomDate();
    }

    public String getFirstName(){
        return this.person.getFirstName();
    }

    public String getLastName(){
        return this.person.getLastName();
    }

    public String getReason(){
        return this.reason;
    }

    public String getDepartment(){
        return this.department;
    }

    public String getDate(){
        return this.date;
    }

    @Override
    public String toString(){
        return "\n" + this.person.getFirstName() +","+ this.person.getLastName() +","+
                this.reason +","+ this.department +","+ this.date;
    }

}


