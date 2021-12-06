import java.util.Scanner;
public class vowelcount
{
  public static void main(String[] args)
  {
try (Scanner scan = new Scanner(System.in)) {
  String userstr = scan.nextLine();
  
  int vowelcount = 0;
  
  for(int i = 0; i < userstr.length(); i++) {
    if(userstr.charAt(i) == 'a' || userstr.charAt(i) == 'e' || userstr.charAt(i) == 'i' || userstr.charAt(i) == 'o' || userstr.charAt(i) == 'u') {
      vowelcount++;
    }
  }
  System.out.println(vowelcount);
}
      }
}