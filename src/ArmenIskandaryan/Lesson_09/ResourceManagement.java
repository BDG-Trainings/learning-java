package ArmenIskandaryan.Lesson_09;

public class ResourceManagement {
    private Department [] departments;

    public void addEmployeeToDepartment(final Employee employee,final String departmentName) {
        Department department = findDepartmentByName(departmentName);
        if (department != null) {
            department.addEmployeeToDepartment(employee);
        }
    }

    public void removeEmployeeFromDepartment(final Employee employee,final String departmentName) {
        Department department = findDepartmentByName(departmentName);
        if (department != null) {
            department.removeEmployeeFromDepartment(employee);
        }
    }

    public Department findDepartmentByName(final String  departmentName) {
        Department department = null;
        for (int i = 0; i < departments.length; i++) {
            if (departments[i].getDepartmentName().equals(departmentName)) {
                department = departments[i];
                break;
            }
        }
        return department;
    }

    public Department getDepartmentWithMaxSalary() {
        if (departments.length > 0) {
            Department maxDepartment = departments[0];
            for (int  i = 0; i < departments.length; i++) {
                if (departments[i].getDepartmentSalary() > maxDepartment.getDepartmentSalary()) {
                    maxDepartment = departments[i];
                }
            }
            return maxDepartment;
        } else {
            return null;
        }
    }
}
