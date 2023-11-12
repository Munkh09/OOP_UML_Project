package Developer_Student_Classes;

import java.util.Date;

public class SDE extends Developer implements DeveloperInfo{
    private Level level;
    enum Level {SDE1, SDE2, SDE3};
    public SDE(){
        super("Doe", "John", "303030", new Date(1990, 9,10));
        this.level = Level.SDE1;
    }
    public SDE(String lastName, String firstName, String idNumber, Date birthDate, Level level){
        super(lastName, firstName, idNumber, birthDate);
        this.level = level;
    }

    @Override
    public double monthlyEarning(){
        if (level == Level.SDE1){
            return STOCKS_PER_MONTH + DEV_MONTHLY_SALARY;
        } else if(level == Level.SDE2){
            return STOCKS_PER_MONTH + (1.5 * DEV_MONTHLY_SALARY);
        } else if(level == Level.SDE3){
            return STOCKS_PER_MONTH + (2.0 * DEV_MONTHLY_SALARY);
        } else{
            System.out.println("Invalid SDE level.");
            return -1.0;
        }
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "Monthly Salary: " + monthlyEarning();
    }




}
