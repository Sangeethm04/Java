import Chapt9.Worker.WorkerMenachery;

public class WorkerMenacheryTester {
    public static void main(String[] args) {
        WorkerMenachery worker1 = new WorkerMenachery("Bob", "Smith", 5);
        WorkerMenachery worker2 = new WorkerMenachery("Smith", "Lee", 5);
        WorkerMenachery worker3 = new WorkerMenachery("Logan", "Fleming", 2);
        System.out.println("First name of worker 1: " + worker1.getFirstName());
        System.out.println("Last name of worker 1: " + worker1.getLastName());
        System.out.println("Total Pay for worker 1: " + worker1.computePay(2));
        System.out.println(worker1);
        System.out.println();
        System.out.println("First name of worker 2: " + worker2.getFirstName());
        System.out.println("Last name of worker 2: " + worker2.getLastName());
        System.out.println("Total Pay for worker 2: " + worker2.computePay(6));
        System.out.println(worker2);
        System.out.println();
        System.out.println("First name of worker 3: " + worker3.getFirstName());
        System.out.println("Last name of worker 3: " + worker3.getLastName());
        System.out.println("Total Pay for worker 2: " + worker3.computePay(0));
        System.out.println(worker3);

        System.out.println();

        HourlyWorkerMenachery worker4 = new HourlyWorkerMenachery("Bob", "Smith", 5);
        HourlyWorkerMenachery worker5 = new HourlyWorkerMenachery("Smith", "Lee", 5);
        HourlyWorkerMenachery worker6 = new HourlyWorkerMenachery("Logan", "Fleming", 2);
        System.out.println("How many employees are receiving overtime pay: " + HourlyWorkerMenachery.getOvertimeCount());
        System.out.println("Overtime pay is being given total: " + HourlyWorkerMenachery.getTotalOvertimePay());
        System.out.println("Total Pay for worker 4: " + worker4.computePay(2));
        System.out.println(worker4);
        System.out.println();
        System.out.println("Total People getting overtimePay: " + HourlyWorkerMenachery.getOvertimeCount());
        System.out.println("Total Overtime Pay given: " + HourlyWorkerMenachery.getTotalOvertimePay());
        System.out.println("Total Pay for worker 5: " + worker5.computePay(70));
        System.out.println(worker5);
        System.out.println();
        System.out.println("Total People getting overtimePay: " + HourlyWorkerMenachery.getOvertimeCount());
        System.out.println("Total Overtime Pay given: " + HourlyWorkerMenachery.getTotalOvertimePay());
        System.out.println("Total Pay for worker 6: " + worker6.computePay(50));
        System.out.println(worker6);
    }
}