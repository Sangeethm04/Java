import java.util.Scanner;
public class mathpow {
    public static void main(String[] args) {
try (Scanner console = new Scanner(System.in)) {
  int base = console.nextInt();
  int power = console.nextInt();
  int result = 0;
  
  for (int i = 1; i < power; i++) {
      result += base * base;
   
  
        }
        System.out.println(result);
}
        }
    }