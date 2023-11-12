package Developer_Student_Classes;

public class OnlineStudent extends Student {
    private int numOfOnlineClasses;
    private int numOfInpersonClasses;

    public OnlineStudent(){
        this("John", "Doe", Year.Freshman, 2027, "Computer Science", 1200.00, 4, 1);
    }
    public OnlineStudent(String firstName, String lastName, Year year, int yearOfGraduation, String department, double courseFee, int numOfOnlineClasses, int numOfInpersonClasses) {
        super(firstName, lastName, year, yearOfGraduation, department, courseFee);
        this.numOfOnlineClasses = numOfOnlineClasses;
        this.numOfInpersonClasses = numOfInpersonClasses;
    }

    public double calculateSemesterFee() {
        if (numOfInpersonClasses + numOfOnlineClasses <= 5) {
            double inpersonFee = getCourseFee() * numOfInpersonClasses;
            double onlineFee = (getCourseFee() * 1.2) * numOfOnlineClasses;
            return inpersonFee + onlineFee;
        } else {
            System.out.println("Student can not take more than 5 classes per semester.");
            return -1.0;
        }
    }

    @Override
    public String toString(){
        return getFirstName() + " " + getLastName() + "\n \t" + "Student ID: " + getStudentId() + "\n \t" + "Year: " + getYear() +
                "\n \t" + "Department: " + getDepartment() + "\n \t" + "Course Fee: " + getCourseFee() + "\n \t" + "Graduation Year: " + getYearOfGraduation() +
                "\n \t" + "Number of Online Classes: " + getNumOfOnlineClasses() + "\n \t" + "Number of In-person Classes: " + getNumOfInpersonClasses() + "\n \t" + "Additional Info (Semester Fee): " + calculateSemesterFee() ;
    }

    public int getNumOfOnlineClasses() {
        return numOfOnlineClasses;
    }

    public void setNumOfOnlineClasses(int numOfOnlineClasses) {
        this.numOfOnlineClasses = numOfOnlineClasses;
    }

    public int getNumOfInpersonClasses() {
        return numOfInpersonClasses;
    }

    public void setNumOfInpersonClasses(int numOfInpersonClasses) {
        this.numOfInpersonClasses = numOfInpersonClasses;
    }
}