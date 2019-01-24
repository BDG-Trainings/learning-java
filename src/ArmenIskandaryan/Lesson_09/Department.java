package ArmenIskandaryan.Lesson_09;

public class Department {
    private String departmentName;
    private Employee [] employees;
    private Employee departmentHeadEmployee;
    private double departmentSalary;

    public void setDepartmentName(final String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentHeadEmployee(final Employee departmentHeadEmployee) {
        this.departmentHeadEmployee = departmentHeadEmployee;
    }

    public Employee getDepartmentHeadEmployee() {
        return departmentHeadEmployee;
    }

    public double getDepartmentSalary() {
/*        double sum = 0;
        for (int i = 0; i < employees.length; i ++) {
            sum += employees[i].getSalary();
        }
        return sum; */
        return departmentSalary;
    }

    public Employee [] getEmployees() {
        return employees;
    }

    public Employee [] addEmployeeToDepartment(final Employee employee) {
        Employee [] newEmployees = new Employee[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            newEmployees[i] = employees[i];
        }
        newEmployees[employees.length] = employee;
        employees = newEmployees;
        departmentSalary += employee.getSalary();
        return employees;
    }

    public Employee [] removeEmployeeFromDepartment(final Employee employee) {
        Employee [] newEmployees = new Employee[employees.length - 1];
        int indexDelta = 0;
        for (int i = 0; i + indexDelta < employees.length; i++) {
            if (employee.equals(employees[i])) {
                indexDelta = 1;
            }
            newEmployees[i] = employees[i + indexDelta];
        }
        employees = newEmployees;
        departmentSalary -= employee.getSalary();
        return employees;
    }
}
