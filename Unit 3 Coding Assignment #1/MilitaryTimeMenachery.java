/*
Sangeeth Menachery
Exercise 3.2
Calculate thing with military time
*/

import java.util.Scanner;

public class MilitaryTimeMenachery {
public static void main(String[] args) {
    final int hour = 60; 
    final int day = 24 * 60;
    int firstTime;
    int timeOne; 
    int secondTime;
    int timeTwo;
    int minutes; 
    int hours;

    Scanner in = new Scanner(System.in);

    System.out.print("First time: "); 
    firstTime = in.nextInt();
    timeOne = firstTime / 100 * hour + firstTime % 100;

    System.out.print("Second time: ");
    secondTime = in.nextInt();
    in.close();

    timeTwo = secondTime / 100 * hour + secondTime % 100;
    minutes = timeTwo - timeOne;
    minutes = (day+minutes) % day;
    hours = minutes / 60;
    minutes %= 60;
    System.out.printf("%d hours %d minutes", hours, minutes);
    }
}
