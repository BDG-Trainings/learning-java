package arsenkarapetyan.lesson_7;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee (int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName (){
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary () {
        return salary * 12;
    }

    public int raiseSalary (int percent){
        return salary + salary * percent / 100;
    }

    public String toString (){
        return "Employee " + id + ", name = " + firstName + " " + lastName + ", salary = " + salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee (4321, "Arsen", "Karapetyan", 5000);
        System.out.println(emp.getName());
        System.out.println(emp.getAnnualSalary());
        System.out.println(emp.raiseSalary(50));
        System.out.println(emp.toString());
    }
}
