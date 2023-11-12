package Developer_Student_Classes;
import java.util.ArrayList;
public class DeveloperTester {
    public static void main(String[] args) {
        // Testing with default constructors for all 3 types of Developer
        Developer Mike = new Intern();
        Developer John = new SDE();
        Developer Tom = new Partime();

        //Adding them into the same array
        ArrayList<Developer> array = new ArrayList<>();
        array.add(Mike);
        array.add(John);
        array.add(Tom);

        //Testing the running time polymorphism and the classes
        for (Developer dev : array){
            System.out.println(dev.toString());
            System.out.println(dev.monthlyEarning());
            System.out.println(" ");
        }


    }
}