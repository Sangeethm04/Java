/* Write a block of code to initialize an array with 10 randomly generated integers between 1 and 20 and display them. */
public class random {
    public static void main(String[] args) {
        int[] random = new int[10];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 20) + 1;
        }
        for (int i = 0; i < random.length; i++) {
            System.out.println(random[i]);
        }
        System.out.println("helo");
    }
}