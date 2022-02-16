public class Rand {
    public static void main(String[] args) {
        double[] scores = {1.0, 2.0, 3.0, 4.0, 5.0};

        int index = 0;

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores[4]);

        System.out.println(scores[index]);
        index++;
        System.out.println(scores[index]);
        index++;
        System.out.println(scores[index]);
        index++;
        System.out.println(scores[index]);
        index++;
        System.out.println(scores[index]);

        for(int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}