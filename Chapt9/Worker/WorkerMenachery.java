package Chapt9.Worker;
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