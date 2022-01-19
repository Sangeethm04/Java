/*Create a program Employee that has 3 instance variables (the employees name, their age, and their salary), a default constructor, and a second constructor with 3 parameters.  The class should contain a print method.
Create a second program EmployeeTester (or Main if using repl.it) that creates 3 Employee objects and calls on the print method for each.  (The print method was introduced in section 5.1).  One object should call on the default constructor.  The other 2 objects should call on the second constructor.
Turn this assignment in on Google Classroom.
If using repl.it, you need to submit the repl files in repl.it and click “turn in” in Google Classroom so I know you are finished.  If you are using another IDE, you are attaching BOTH .java files and add your last name to both file names.
 */
public class EmployeeMenachery {
  private String name;
  private int age;
  private double salary;
  
  public EmployeeMenachery() {
    this.name = "";
    this.age = 0;
    this.salary = 0;
  }
  
  public EmployeeMenachery(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }
  
  public void print() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}