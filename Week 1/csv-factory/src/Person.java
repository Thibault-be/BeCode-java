public class Person {

    private final String firstName;
    private final String lastName;

    public Person(){
        this.firstName = GeneralData.giveFirstName();
        this.lastName = GeneralData.giveLastName();
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }



}
