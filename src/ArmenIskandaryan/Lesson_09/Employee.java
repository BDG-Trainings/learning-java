package ArmenIskandaryan.Lesson_09;

public class Employee {
    private double salary;
    private Person person;
    private Employee employee;

    public Employee(final double salary,final Person person,final Employee employee) {
        this.salary = salary;
        this.person = person;
        this.employee = employee;
    }

    public void setPerson(final Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployee(final Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }
}
