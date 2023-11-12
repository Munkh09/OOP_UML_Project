package Developer_Student_Classes;

public class StudentTester {
    public static void main(String[] args) {
        //Testing the InpersonStudent with 6 classes
        Student Mike = new InpersonStudent("Mike", "Trout", Student.Year.Freshman, 2027,"Business", 1200.00, 100,6);
        System.out.println(Mike.toString());

        //Testing the OnlineStudent with 6 classes
        Student Anthony = new OnlineStudent("Anthony", "Thompson", Student.Year.Junior, 2024, "Engineering", 1400.00, 3, 3);
        System.out.println(Anthony.toString());

        //Testing the InpersonStudent with 3 classes
        Student Shohei = new InpersonStudent("Shohei", "Ohtani", Student.Year.Sophomore, 2025,"Social Science", 1000.00, 100,3);
        System.out.println(Shohei.toString());

        //Testing the OnlineStudent with 5 classes
        Student Michael = new OnlineStudent("Michael", "Jordan", Student.Year.Senior, 2023, "Science", 900.00, 4, 1);
        System.out.println(Michael.toString());

        //Testing the default constructor for the InpersonStudent
        Student John = new InpersonStudent();
        System.out.println(John.toString());

        //Testing the default constructor for the OnlineStudent
        Student Andrew = new OnlineStudent();
        System.out.println(Andrew.toString());

    }
}
