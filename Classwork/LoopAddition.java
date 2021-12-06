import java.util.Scanner;

public class LoopAddition {
   public static void main(String[] args) {
      try (Scanner scan = new Scanner(System.in)) {
            int number = scan.nextInt();
int total = 0;
            while(number != 0) {
              if (number % 2 == 0) {
                  total = total + number;
                  
              }
              number = scan.nextInt(); 
             
            }

            System.out.println("Your total is: " + total);
      }
}
}
