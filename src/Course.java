import java.util.HashMap;
import java.util.Scanner;

public class Course {
    // Use Java HashMap to Store course details
    private static final HashMap<String, String[]> courseDetails = new HashMap<>();

    static {
        // Initialize course details with the data provided on the question paper
        courseDetails.put("BSE", new String[]{"Software Engineering", "900000"});
        courseDetails.put("BIT", new String[]{"Information Technology", "750000"});
        courseDetails.put("BCS", new String[]{"Computer Science", "800000"});
        courseDetails.put("BCE", new String[]{"Computer Engineering", "950000"});
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter Course ID (BSE, BIT, BCS, or BCE): ");
        String courseId = scanner.nextLine().toUpperCase();

        String[] details = courseDetails.get(courseId);
        if (details != null) {
            System.out.println();
            System.out.println("Course Name: " + details[0]);
            System.out.println("Tuition: " + details[1]);
        } else {
            System.out.println("Wrong CourseID details");
        }

        scanner.close();  // Close scanner to avoid resource leaks
    }
}
