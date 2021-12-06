import java.util.Scanner;

public class whileloops41 {

    public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Enter first number or -1 to end");
int temp = scan.nextInt();//5
double total = 0;
int number = 0;
while (temp != -1) {
total = total + temp;//5

temp = scan.nextInt();//5
   number++; //2

}
System.out.println("Average of all numbers: " + total / number);
    }    

}



}
