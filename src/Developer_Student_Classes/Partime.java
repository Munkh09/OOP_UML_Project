package Developer_Student_Classes;

import java.util.Date;

public class Partime extends Intern{
    private int hoursWorkedPerWeek;

    public Partime(String lastName, String firstName, String idNumber, Date birthDate, double hourlyRate, int hoursWorkedPerWeek) {
        super(lastName, firstName, idNumber, birthDate, hourlyRate);
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }
    public Partime(){
        this("Doe", "John", "010101", new Date(2000, 8,1), 18.50, 20);
    }

    public double monthlyEarning(){
        return getHourlyRate() * (hoursWorkedPerWeek * 4);
    }

    public String toString(){
        return super.toString() + "\n" + "Hours worked per month: "  + (getHoursWorkedPerWeek() * 4);
    }

    public int getHoursWorkedPerWeek() {
        return hoursWorkedPerWeek;
    }

    public void setHoursWorkedPerWeek(int hoursWorkedPerWeek) {
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }
}
