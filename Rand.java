public class Rand {

    private int score1;

    private int score2;

    public Rand(int num1, int num2)

    {

        score1 = num1;

        score2 = num2;

    }

    public void reset(int threshold)

    {

        if (score1 < threshold) // line 14

        {

            score1 = 0; // line 16

        } 
         if (score2 < threshold) // line 18

        {

            score2 = 0;

        }

    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        Rand rand = new Rand(num1, num2);
        System.out.println("The first score is " + num1);
        System.out.println("The second score is " + num2);
        rand.reset(12);
        System.out.println("The first score is " + rand.score1);
        System.out.println("The second score is " + rand.score2);
    }
}