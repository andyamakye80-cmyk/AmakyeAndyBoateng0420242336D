import java.io.PrintStream;

public class MyInformation {
    public static void main(String[] args) {



    String name = "Amakye Andy Boateng";

    byte age = 20;
    char gender = 'M';
    float height = 1.75f;
    double weight = 68.5;
    boolean student = true;
    String CourseName = "Java";
    int level = 200;
    long studentID = 71386334L;
    short graduationYear = 2028;

        int ageInt = age;

        System.out.println("===== MyInformation =====");
        System.out.printf("Name: %s%n", name);
    System.out.printf("Age: %d%n", age);
    System.out.printf("Gender: %c%n", gender);
    System.out.printf("height: %.2f m%n", height);
    System.out.printf("weight: %.1f kg%n", weight);
    System.out.printf("Student: %b%n", student);
    System.out.printf("Level: %.0f%n", (double)
    level);
    System.out.printf("Graduation Year: %d%n", graduationYear);
    System.out.printf("Student ID: %d%n", studentID);

    }
}
