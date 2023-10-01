import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the name for student " + (i + 1) + ": ");
            String name = sc.nextLine();
            System.out.print("Enter the course for student " + (i + 1) + ": ");
            String course = sc.nextLine();
            students[i] = new Student(name, course);
        }

        for (Student student : students) {
            student.showStudent();
        }

        for (Student student : students) {
            if (student.getName().equals("Jacob Gallagher")) {
                student.setCourse("CSSE");
                student.showStudent();
            }
        }

        for (Student student : students) {
            if (student.getName().equals("Louise Johnsen")) {
                student.setName("Louise Johnson");
                System.out.println(student.getName());
            }
        }
        sc.close();
    }
}
