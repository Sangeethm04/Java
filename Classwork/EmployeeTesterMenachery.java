// Sangeth Menachery
//Employee Menachery
//Create Employee class

public class EmployeeTesterMenachery {
    public static void main(String[] args) {
        EmployeeMenachery emp1 = new EmployeeMenachery();
        EmployeeMenachery emp2 = new EmployeeMenachery("James", 25, 200000);
        EmployeeMenachery emp3 = new EmployeeMenachery("Bob", 30, 300000);
        emp1.print();
        emp2.print();
        emp3.print();
    }
}