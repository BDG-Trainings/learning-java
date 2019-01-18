package Classner;

 class Employee {

        private int id;
        private String firstName;
        private String lastName;
        private int salary;

  Employee(int id, String firstName, String lastName, int salary){
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
 }
 public int getId(){
      return id;
 }
 public String getFirstName(){
      return firstName;
 }
 public String getLastName(){
      return lastName;
 }
 public String getName(){
      return "firstName lastName";
 }
 public int getSalary() {
         return salary;
 }
 public void setSalary(int salary){
      this.salary = salary;
 }

  public int getAnnualSalary(){
      return salary*12;
  }
  public int raiseSalary(int percent){
      salary = salary + salary*percent/100;
      return  salary;
  }
  public String toString(){
      return "Employee [id = " + id + ", name=" + firstName + lastName+ ",salary = "+ salary + "]";

  }
  public static void main(String[]args){
      Employee nor = new Employee(55, "Anun", "Azganun",30000);
      int Ashxatox = nor.getSalary();
      Ashxatox = nor.raiseSalary(20);
      Ashxatox = nor.getId();
      System.out.print(Ashxatox);
  }
 }
