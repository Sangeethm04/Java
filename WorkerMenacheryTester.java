public class WorkerMenacheryTester {
    public static void main(String[] args) {
        WorkerMenachery worker1 = new WorkerMenachery("Bob", "Bobble", 5);
        WorkerMenachery worker2 = new WorkerMenachery("Bob", "Bobble", 5);
        WorkerMenachery worker3 = new WorkerMenachery("Bob", "Bobble", 5);
        System.out.println( worker1.getFirstName());
        System.out.println(worker1.getLastName());
        System.out.println(worker1.computePay(2));
        System.out.println(worker1);
        System.out.println(worker2.getFirstName());
        System.out.println(worker2.getLastName());
        System.out.println(worker2.computePay(2));
        System.out.println(worker2);
        System.out.println(worker3.getFirstName());
        System.out.println(worker3.getLastName());
        System.out.println(worker3.computePay(2));
        System.out.println(worker3);

    }
}