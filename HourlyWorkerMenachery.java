public class HourlyWorkerMenachery extends WorkerMenachery {
    private static int overtimeCount = 0; //how many employees are receiving overtime pay
    private static double totalOvertimePay = 0; //how much overtime pay is being given total from all employees

    public HourlyWorkerMenachery(String firstName, String lastName, double salaryRate) {
        super(firstName, lastName, salaryRate);
    }

    public static int getOvertimeCount() {
        return overtimeCount;
    }

    public static double getTotalOvertimePay() {
        return totalOvertimePay;
    }
    
    public double computePay(int hoursWorked) {
        if (hoursWorked <= 40) {
            return super.computePay(hoursWorked);
        } else {
            overtimeCount++;
            totalOvertimePay += (super.computePay(hoursWorked - 40) * 1.5);
            return (super.computePay(40) + (super.computePay(hoursWorked - 40) * 1.5));
        }
    }

    public String toString() {
        return super.toString() + "\nHow many employees are receiving overtime pay: " + overtimeCount + "\nOvertime pay is being given total: " + totalOvertimePay;
    }


    public static void main(String[] args) {

    }
}