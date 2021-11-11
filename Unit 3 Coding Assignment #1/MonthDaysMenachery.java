import java.util.Scanner;

public class MonthDaysMenachery {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Days");

    int days = input.nextInt();

    int total = (days * 30);

    System.out.println(total);
    }

}
