public class SentenceMenachery {
    String text;
    public SentenceMenachery(String text) {
        this.text = text;
    }

    public void reverse() {
        if (text.length() == 1) {

        } else {
            System.out.print(text.charAt(text.length() - 1));
            text = text.substring(0, text.length() - 1);
            reverse();
        }

    }
    public String getText() {
        return text;
    }
    public static void main(String[] args) {
        SentenceMenachery greeting = new SentenceMenachery("Hello!");
        greeting.reverse();
        System.out.println(greeting.getText());
        SentenceMenachery greeting1 = new SentenceMenachery("Sangeeth Menachery");
        greeting1.reverse();
        System.out.println(greeting1.getText());
        SentenceMenachery greeting2 = new SentenceMenachery("s");
        greeting2.reverse();
        System.out.println(greeting2.getText());
    }
}