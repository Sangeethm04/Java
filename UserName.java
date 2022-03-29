
import java.util.ArrayList;

public class UserName {

    private ArrayList < String > possibleNames;

    public UserName(String firstname, String lastName) {
        possibleNames = new ArrayList < String > ();
        for (int i = 0; i < firstname.length(); i++) {
            possibleNames.add(lastName + firstname.substring(0, i + 1));
        }
    }

    public boolean isUsed(String name, String[] arr) {
        for (String ar: arr) {
            if (ar.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void setAvailableUserNames(String[] usedNames) {
        for (String ars: possibleNames) {
            if (isUsed(ars, usedNames)) {
                possibleNames.remove(ars);
            }
        }
    }


    public static void main(String[] args) {
        UserName person = new UserName("john", "smith");
        System.out.println(person.possibleNames);
        String[] arr = {"smithjo", "johnsmith1"};
        person.setAvailableUserNames(arr);
        System.out.println(person.possibleNames);

    }

}