// Assume that the classes listed in the Java Quick Reference have been imported where appropriate.
// Unless otherwise noted in the question, assume that parameters in method calls are not null and that methods are called only when their preconditions are satisfied.
// In writing solutions for each question, you may use any of the accessible methods that are listed in classes defined in that question. Writing significant amounts of code that can be replaced by a call to one of these methods will not receive full credit.
 
// An array of String objects, words, has been properly declared and initialized. Each element of words contains a String consisting of at least 3 lowercase letters (a–z).

// Write a code segment that uses an enhanced for loop to print all elements of words that end with "ing". As an example, if words contains {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"}, then the following output should be produced by the code segment.
// fading
// trailing

public class random {
    public static void main(String[] args) {
       String[] words = {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};
       for (String word : words) {
          if (word.endsWith("ing")) {
             System.out.println(word);
          }
       }
    }
 }