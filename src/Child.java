import java.time.LocalDate;

class Child{

    //personal info
    protected String name;
    protected LocalDate dateOfBirth;

    //home-address info
    protected String street, country;


    protected Child(){};

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", street='" + street + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}







