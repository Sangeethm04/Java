import java.util.Scanner;

public class PigLatin {

    public String translate(String str) {
while (str != "end") {
    String pigLatin = str.substring(1) + str.substring(0,1) + "ay";
       System.out.println(str + " in Pig Latin is " + pigLatin);
       break;
}
return str;
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String pigLatin;
    PigLatin wordinput = new PigLatin();
    
    pigLatin = wordinput.translate(word);
    }
}
