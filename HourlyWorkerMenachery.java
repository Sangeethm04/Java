// Your subclass should contain two static fields that keep track of how many employees are receiving overtime pay and how much overtime pay is being given total from all employees.

// Your subclass should contain a computePay method, two static accessor methods, and a toString method.  In the computePay method, if the amount of hours worked is less than or equal to 40, call on the superclass computePay method.  If the amount of hours worked is over 40, time-and-a-half overtime should be calculated.

// Add to your tester file by creating 3 HourlyWorkers.  Test all methods with each object.


public class HourlyWorkerMenachery extends WorkerMenachery {
    private static int numemployees = 0;
    private static int overtimePayTotal = 0;

    public HourlyWorkerMenachery(String firstName, String lastName, double salaryRate) {
        super(firstName, lastName, salaryRate);
        //TODO Auto-generated constructor stub
    }

    public void computePay(int hours) {
        if (hours <= 40) {
            super.computePay(hours);
        } else {
            double overtime = hours - 40;
            double overtimePay = overtime * (super.SalaryRate * 1.5);
            setPay(getSalaryRate() * 40 + overtimePay);
            overtimePayTotal += overtimePay;
            numemployees++;
        }
    }

    public static int getNumemployees() {
        return numemployees;
    }

    public static int getOvertimePayTotal() {
        return overtimePayTotal;
    }

    public String toString() {
        return "Hourly Worker: " + getFirstName() + " " + getLastName() + " " + computePay();
    }

    public static void main(String[] args) {

    }
}
