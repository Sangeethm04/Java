// import Chapt9.Student;

// /** class Student
//  * with 4 instance variables,
//  * 3 constructors, a print method,
//  * and a main method to test them.
//  */
// public class Student {
//     // Write 4 instance variables
//     private String name;
//     private int age;
//     private double gpa;
//     private String major;


//     // Write 3 constructors to initialize the instance variables
//     //  1. no parameters using default values
//     //  2. 1 parameter and the rest default values
//     //  3. 4 parameters
//     public Student() {
//         name = "";
//         age = 0;
//         gpa = 0.0;
//         major = "";
//     }
//     public Student(String name) {
//         this.name = name;
//         age = 0;
//         gpa = 0.0;
//         major = "";
//     }
//     public Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//         gpa = 0.0;
//         major = "";
//     }
//     public Student(String name, int age, double gpa, String major) {
//         this.name = name;
//         this.age = age;
//         this.gpa = gpa;
//         this.major = major;
//     }


//     // Write a print method that prints all the instance variables
//     public void print() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("GPA: " + gpa);
//         System.out.println("Major: " + major);

//     }

//     // main method
//     public static void main(String[] args) {
//         // Construct 3 Student objects using the 3 different constructors
//         Student s1 = new Student();
//         Student s2 = new Student("John", 20);
//         Student s3 = new Student("John", 20, 3.5, "Computer Science");

//         // call their print() methods
//         s1.print();
//         s2.print();
//         s3.print();
//     }
// }