package vkertikyan.ClassLessonTwo;

public class MainResourceManagement {

    public static void main(String[] args) {
        Address[] addresses = new Address[1];
        addresses[0] = new Address("street1", "city1", "state1", "zipCode1");

        Person person = new Person("name", "firstName", "middleName", (short) 25, addresses);

        Department dep = new Department("dep", null, null,  1000);

        Employee newEmp = new Employee(1000, person);

        ResourceManagement resourceManagement = new ResourceManagement();

        Department[] departments = new Department[1];
        departments[0] = dep;


        resourceManagement.addEmployeeToDepartment(newEmp, "aaa");
    }
}
