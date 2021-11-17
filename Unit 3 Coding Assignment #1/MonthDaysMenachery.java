/*
Sangeeth Menachery
Exercise 3.1
How many days in month
*/

import java.util.Scanner;

public class MonthDaysMenachery

{

public static void main(String[] args)

    {

    Scanner month = new Scanner(System.in);

    System.out.println("Enter a month as a the corresponding number:");

    String userinput = month.nextLine();

    if(userinput.equals("1")||userinput.equals("3") ||userinput.equals("5")|| userinput.equals("7")||userinput.equals("8") || userinput.equals("10")|| userinput.equals("12"))

    {
        System.out.print("There is 31 days in that month");
    }

    else if (userinput.equals("4")||userinput.equals("6")||userinput.equals("9")|| userinput.equals("11"))
    {
    System.out.print("There is 30 days in that month");
    }

        else if(userinput.equals("2"))

        {

            System.out.print("There is 28 or 29 days in that month");

    }

    else

    {

    System.out.print("Enter in a number 1-12");

    }

    }
}