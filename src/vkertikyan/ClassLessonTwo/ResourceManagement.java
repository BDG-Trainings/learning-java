package vkertikyan.ClassLessonTwo;

public class ResourceManagement {
    private Department[] departments;


    public Department findDepartmentByName(String departmentName, Department[] departments) {
        for (int i = 0; i < departments.length; i++) {
            if (departments[i].getDepartmentName().contentEquals(departmentName)) {
                return departments[i];
            }
        }
        return null;
    }


    public Department getDepartmentWithMaxSalary(Department[] departments) {
        int maxSalary = (int) departments[0].getDepartmentSalary();

        for (int i = 1; i < departments.length; i++) {
            if (departments[i].getDepartmentSalary() > maxSalary) {
                maxSalary = (int) departments[i].getDepartmentSalary();
            }
        }
        for (int i = 1; i < departments.length; i++) {
            if (departments[i].getDepartmentSalary() == maxSalary) {
                return departments[i];
            }
        }
        return null;
    }


/////if max salary not one

//    public Department getDepartmentWithMaxSalary(Department[] departments) {
//        int maxSalary = (int) departments[0].getDepartmentSalary();
//
//        List<Integer> maxSalaries = new ArrayList<Integer>();
//        List<Department> departmentsWithMaxSalary = new ArrayList<Department>();
//
//        for (int i = 1; i < departments.length; i++) {
//            if (departments[i].getDepartmentSalary() > maxSalary) {
//                maxSalary = (int) departments[i].getDepartmentSalary();
//                maxSalaries.add(maxSalary);
//            }
//        }
//        for (int i = 1; i < departments.length; i++) {
//            if (departments[i].getDepartmentSalary() == maxSalary) {
//                departmentsWithMaxSalary.add(departments[i]);
//               return departments[i];
//            }
//        }
//        return null;
//    }

}
