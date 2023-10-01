public class Employee {
    private String name;
    private String jobTitle;
    private float salary;
    private int employeeID;
    private static int idCounter = 1000;
    
    public Employee() {
        name = "unknown";
        jobTitle = "unknown";
        salary = 19000f;
        employeeID = ++idCounter;
    }
    
    public Employee(String name, String jobTitle, float salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        setSalary(salary);
        employeeID = ++idCounter;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getJobTitle() {
        return jobTitle;
    }
    
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
    public float getSalary() {
        return salary;
    }
    
    public void setSalary(float salary) {
        if (salary < 19000f) {
            System.out.println("Entered salary of " + salary + " is too low.\nSalary set at minimum wage of 19000.0");
            this.salary = 19000f;
        } else {
            this.salary = salary;
        }
    }
    
    public int getEmployeeID() {
        return employeeID;
    }
    
    public void showEmp() {
        System.out.println("EMPLOYEE RECORD");
        System.out.println("NAME: " + name);
        System.out.println("JOB TITLE: " + jobTitle);
        System.out.println("CURRENT SALARY: " + salary);
        System.out.println("EMPLOYEE ID: " + employeeID + "\n");
    }
    
    public String toString() {
        return "NAME: " + name + "\nJOB TITLE: " + jobTitle + "\nCURRENT SALARY: " + salary + "\nEMPLOYEE ID: " + employeeID + "\n";
    }
}