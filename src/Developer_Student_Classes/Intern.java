package Developer_Student_Classes;

import java.util.Date;

public class Intern extends Developer implements DeveloperInfo{
    private double hourlyRate;
    public Intern(String lastName, String firstName, String idNumber, Date birthDate, double hourlyRate){
        super(lastName, firstName, idNumber, birthDate);
        this.hourlyRate = hourlyRate;
    }
    public Intern(){
        this("Brown", "John", "101010", new Date(1995,8,15), 18.50);
    }
    @Override
    public double monthlyEarning(){
        return hourlyRate * INTERN_MONTHLY_HOURS_WORED;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "Monthly Salary: " + monthlyEarning();
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
