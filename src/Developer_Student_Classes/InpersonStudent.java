package Developer_Student_Classes;

public class InpersonStudent extends Student{
    private double parkingFee;
    private int numOfClasses;
    private double semesterFee;

    public InpersonStudent(){
        this("John", "Doe", Year.Freshman, 2027, "Computer Science", 1200.00, 300.00, 5);
    }
    public InpersonStudent(String firstName, String lastName, Year year, int yearOfGraduation, String department, double courseFee, double parkingFee, int numOfClasses) {
        super(firstName, lastName, year, yearOfGraduation, department, courseFee);
        this.parkingFee = parkingFee;
        this.numOfClasses = numOfClasses;
        this.semesterFee = calculateSemesterFee();
    }

    public double calculateSemesterFee() {
        if (numOfClasses <= 3) {
            return (getCourseFee() * numOfClasses) + parkingFee;
        } else if (numOfClasses <= 5) {
            return (getCourseFee() * 3 + ((getCourseFee() * 0.80) * (numOfClasses - 3)) + parkingFee);
        } else {
            System.out.println("Student can not take more than 5 classes per semester.");
            return -1.0;
        }
    }

    @Override
    public String toString(){
        return getFirstName() + " " + getLastName() + "\n \t" + "Student ID: " + getStudentId() + "\n \t" + "Year: " + getYear() +
                "\n \t" + "Department: " + getDepartment() + "\n \t" + "Course Fee: " + getCourseFee() + "\n \t" + "Graduation Year: " + getYearOfGraduation() +
                "\n \t" + "Parking Fee: " + getParkingFee() + "\n \t" + "Number of Classes: " + getNumOfClasses() + "\n \t" + "Semester Fee: " + getSemesterFee();
    }

    public double getParkingFee() {
        return parkingFee;
    }

    public void setParkingFee(double parkingFee) {
        this.parkingFee = parkingFee;
    }

    public int getNumOfClasses() {
        return numOfClasses;
    }

    public void setNumOfClasses(int numOfClasses) {
        this.numOfClasses = numOfClasses;
    }

    public double getSemesterFee() {
        return semesterFee;
    }

    public void setSemesterFee(double semesterFee) {
        this.semesterFee = semesterFee;
    }
}
