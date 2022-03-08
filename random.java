import java.util.*;

 public class random
 {
     private ArrayList<WordPair> allPairs;

     public random(String[] words)
     {
         // WRITE YOUR CODE HERE
         // initialize allPairs to an empty ArrayList of WordPair objects
        ArrayList<WordPair> allPairs = new ArrayList<WordPair>();
         // nested loops through the words array to add each pair to allPairs
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }


     }

     public int numMatches()
     {
         //Write the code for the second part described below
         return 0;
     }

     public String toString() {
         return allPairs.toString();
     }


     public static void main(String[] args)
     {
         String[] words = {"Hi", "there", "Tyler", "Sam"};
         random list = new random(words);
         System.out.println(list);
         // For second part below, uncomment this test:
         //System.out.println("The number of matched pairs is: " + list.numMatches());
     }
 }

 class WordPair {
     private String word1;
     private String word2;

     public WordPair(String w1, String w2) {
         word1 = w1;
         word2 = w2;
     }
     public String getFirst() {
         return word1;
     }
     public String getSecond() {
         return word2;
     }
     public String toString() {
         return "(" + word1 + ", " + word2 + ")";
     }
 }
 