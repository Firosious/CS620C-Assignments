class Student {
    private String name;
    private String course;
    private int studentID;
    private static int nextID = 1001;

    public Student() {
        this.name = "Unknown";
        this.course = "Unknown";
        this.studentID = nextID++;
    }

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
        this.studentID = nextID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getStudentID() {
        return studentID;
    }

    public void showStudent() {
        System.out.println("Name: " + this.name);
        System.out.println("Course: " + this.course);
        System.out.println("Student ID: " + this.studentID);
        System.out.println("---");
    }
}
