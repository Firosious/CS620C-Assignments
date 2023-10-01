public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Tom Daly", "Teacher", 45000f);
        Employee emp2 = new Employee("Mary Murphy", "Developer", 30000f);
        Employee emp3 = new Employee();
        
        System.out.println("Employee 2 is called " + emp2.getName());
        System.out.println("They are a " + emp2.getJobTitle());
        System.out.println("Their salary is " + emp2.getSalary());
        System.out.println("Their Employee ID number is " + emp2.getEmployeeID());
        System.out.print("");
        emp3.setName("Michael Higgins");
        emp3.setJobTitle("President");
        emp3.setSalary(1000f);
        
        emp1.showEmp();
        emp2.showEmp();
        emp3.showEmp();
        
        System.out.println(emp1.toString());
    }
}