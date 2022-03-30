// Write a superclass Worker and subclass HourlyWorker.

// Every worker has a name (first and last) and salary rate (amount earned per hour). This class should have a constructor, computePay(int hours) method, two accessor methods, and a toString method. The computePay method will return how much the worker earned without overtime and will return zero if hours worked is less than or equal to zero.


public class WorkerMenachery {
    private String firstName;
    private String lastName;
    private double salaryRate;

    public WorkerMenachery(String firstName, String lastName, double salaryRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryRate = salaryRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double computePay(int hours) {
        if (hours <= 0) {
            return 0;
        } else {
            return hours * salaryRate;
        }
    }

    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" + "Salary Rate: " + salaryRate;
    }


    public static void main(String[] args) {

    }
}