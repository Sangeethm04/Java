public class HourlyWorkerMenachery extends WorkerMenachery {
    private static int overtimeCount = 0;
    private static double totalOvertimePay = 0;

    public HourlyWorkerMenachery(String firstName, String lastName, double salaryRate) {
        super(firstName, lastName, salaryRate);
    }

    public static int getOvertimeCount() {
        return overtimeCount;
    }

    public static double getOvertimePay() {
        return totalOvertimePay;
    }
    
    public double computePay(int hoursWorked) {
        if (hoursWorked <= 40) {
            return super.computePay(hoursWorked);
        } else {
            overtimeCount++;
            totalOvertimePay += (super.computePay(40) + (super.computePay(hoursWorked - 40) * 1.5));
            return (super.computePay(40) + (super.computePay(hoursWorked - 40) * 1.5));
        }
    }

    public String toString() {
        return super.toString() + "Overtime Count: " + overtimeCount + " Overtime Pay: " + totalOvertimePay;
    }


    public static void main(String[] args) {

    }
}