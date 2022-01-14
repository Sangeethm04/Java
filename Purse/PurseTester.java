public class PurseTester {
    public static void main(String[] args) {
        Purse myPurse = new Purse();
        myPurse.addDimes(1);
        myPurse.addQuarters(2);
        myPurse.addNickels(7);
        double totalValue = myPurse.getTotal();
        System.out.println("The total is " + totalValue);
    }
}