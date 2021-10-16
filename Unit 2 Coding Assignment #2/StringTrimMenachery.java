// Sangeeth Menachery
// Exercise 2.2
// Remove letters from beg and end to form new string after trim

public class StringTrimMenachery {
    public static void main(String[] args) {
    String test = "  ONETWOTHREEFOURFIVESSAASD  ";
    String smalls = test.trim();
    String half = smalls.substring((smalls.length()/4) , (smalls.length() - smalls.length()/4));
    System.out.println(half);
}
}


