package Developer_Student_Classes;
import java.util.Date;

public abstract class Developer {
    private String lastName;
    private String firstName;
    private String idNumber;
    private Date birthDate;
    public Developer(String lastName, String firstName, String idNumber, Date birthDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.idNumber = idNumber;
        this.birthDate = birthDate;
    }
    public Developer() {
        this("Doe", "John", String.valueOf(202020), new Date(1990, 8,18));
    }
    public abstract double monthlyEarning();

    @Override
    public String toString(){
        return "ID Employee Number: " + getIdNumber() + "\n " + "Employee Name: " + getFirstName() + " " + getLastName() +
                "\n" + "Birth Date: " + getBirthDate();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
