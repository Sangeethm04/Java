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

    }
}