package Developer_Student_Classes;
import java.util.Random;

public abstract class Student {
    private String firstName;
    private String lastName;
    private Year year;
    private String studentId;
    private int yearOfGraduation;
    private String department;
    private double courseFee;
    public static enum Year {Freshman, Sophomore, Junior, Senior}
    public Student(String firstName, String lastName, Year year, int yearOfGraduation, String department, double courseFee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.yearOfGraduation = yearOfGraduation;
        this.department = department;
        this.courseFee = courseFee;
        this.studentId = generateId();
    }

    public String generateId(){
        Random random = new Random();
        return String.valueOf(firstName.charAt(0)) + "" + String.valueOf(lastName.charAt(0)) + "-" + String.valueOf(random.nextInt(1000,9999));
    }

    @Override
    public abstract String toString();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(int yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }
}
