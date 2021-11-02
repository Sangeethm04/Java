public class ProgCheck {
    public static void main(String[] args) {
        boolean rsvp = false;
        int selection = 2;
        String option1;
        String option2 = "Thanks for attending. You will be served beef";

        if (rsvp == true) {
            System.out.println("attending");
        } else {
            System.out.println("not attending");
        }

        if (selection == 1) {
            System.out.println("beef");;
        } else if (selection == 2) {
            System.out.println("chicken");
        } else if (selection == 3) {
            System.out.println("pasta");
        } else {
            System.out.println("fish");
        }

        if (rsvp == true && selection == 1) {
            option1 = "Thanks for attending. You will be served beef"; 
        } else if (rsvp == true && selection == 2) {
            option1 = "Thanks for attending. You will be served chicken"; 
        } else if (rsvp == true && selection == 3) {
            option1 = "Thanks for attending. You will be served pasta"; 
        } else if (rsvp == false) {
            option1 = "Sorry you can't make it.";
        } else if (rsvp == true && selection != 1 && selection != 2 && selection != 3) {
            option1 = "Thanks for attending. You will be served fish"; 

        if (option1.equals(option2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    
}
}
}