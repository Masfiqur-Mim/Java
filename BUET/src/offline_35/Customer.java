package offline_35;

/**
 * Created by ASUS on 19/09/2015.
 */
public class Customer {

    private String name;
    private String email;
    private char gender;



    public Customer() {
    }

    public Customer(String name, String email, char gender) {
        this.name = name;
        setEmail(email);
        setGender(gender);
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName()  {
        return name;
    }

    public String getEmail()  {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender()  {
        return gender;
    }

    public void print()  {
        System.out.println( name + " (" + gender + ") at " + email);
    }

}
