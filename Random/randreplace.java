public class randreplace {
    public static void main(String[] args) {
        String message = "I love cats! I have a cat named Coco. My cat's very smart!";

       // Write a loop here that replaces every occurrence of "cat"
       // in the message with "dog", using indexOf and substring.
       int counter = 0;
    while(message.indexOf("cat") != -1) {
        message = message.substring(0, message.indexOf("cat")) + "dog" + message.substring(message.indexOf("cat") + 3);
        counter++;
    }
    System.out.println(message);
    System.out.println("Number of replacements: " + counter);
}
}
