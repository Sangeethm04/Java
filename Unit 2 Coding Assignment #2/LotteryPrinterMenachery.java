// Sangeeth Menachery
// Exercise 2.1
// Using Random for lottery

public class LotteryPrinterMenachery {
    public static void main(String[] args) {
        int first = (int)(Math.random() * 50 + 1);
        int second = (int)(Math.random() * 50 + 1);
        int third = (int)(Math.random() * 50 + 1);
        int fourth = (int)(Math.random() * 50 + 1);
        int fifth = (int)(Math.random() * 50 + 1);
        int sixth = (int)(Math.random() * 50 + 1);
        System.out.println("Let’s play the lottery game! " + first + " - " + second + " - " + third + " - " + fourth + " - " + fifth + " - " + sixth);
    }
}
