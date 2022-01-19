public class Riddle {
    // write 2 instance variables for Riddle's question and answer: private type variableName;
    private String question;
    private String answer;

    // constructor
    public Riddle(String initQuestion, String initAnswer) {
        // set the instance variables to the init parameter variables
        question = initQuestion;
        answer = initAnswer;
    }

    // Print riddle question
    public void printQuestion() {
        // print out the riddle question with System.out.println
        System.out.println(question);
    }

    // Print riddle answer
    public void printAnswer() {
        // print out the riddle answer with System.out.println
        System.out.println(answer);
    }

    // main method for testing
    public static void main(String[] args) {
        // call the constructor to create 2 new Riddle objects
        Riddle riddle1 = new Riddle("Why did the chicken cross the road?", "To get to the other sidewalk.");
        // call their printQuestion() and printAnswer methods
        Riddle riddle2 = new Riddle("Why did the chicken cross the road?", "To get to the other sidewalks.");
        riddle1.printQuestion();
        riddle1.printAnswer();
        riddle2.printQuestion();
        riddle2.printAnswer();

    }
}
