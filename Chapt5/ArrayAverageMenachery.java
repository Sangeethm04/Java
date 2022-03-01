package Chapt5;

//Sangeeth Menachery
//6.2 - ArrayAverage
//Create the array avg system

import java.util.Scanner;
public class ArrayAverageMenachery {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the number of test scores: ");
            int numScores = scan.nextInt();
            double[] scores = new double[numScores];
            double sum = 0;
            for (int i = 0; i < scores.length; i++) {
                System.out.println("Enter test score: ");
                scores[i] = scan.nextDouble();
                sum += scores[i];
            }

            double avgtotal = (sum / numScores);
            System.out.println("avg = " + avgtotal);
        }

    }

    public char[] findMax() {
        return null;
    }

    public char[] findNumber(int i) {
        return null;
    }

    public char[] findAvergage() {
        return null;
    }

    public void swap(int i, int j) {
    }

    public char[] reverse() {
        return null;
    }

    public void numericOrder() {
    }
}