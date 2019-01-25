package arsenkarapetyan.lesson_8;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private short age;

    public Person (String firstName, short age){
        this.firstName = firstName;
        this.age = age;
    }

    public Person (String firstName, String lastName, short age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person (String firstName, String lastName, String middleName, short age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public short getAge() {
        return age;
    }

    public String toString() {
        return "First Name: " + firstName + "/n Last Name: " + lastName + "/n Middle name: " + middleName + "/n Age: " + age;
    }
}
