// Create a PersonMenachery class that will construct a PersonMenachery object who receives mail.  The objects should have 5 instance variables: name, street, city, state, and zip.  Create one constructor for all five instance variables.  Keep track of how many objects are constructed.  Create two accessor methods to access the name of the PersonMenachery object and how many objects have been created.  Create four mutator methods to change any of the four parts of a PersonMenachery object’s address.  Replace the usual toString method with a method that will print the address as it would appear on an envelope.  See example below.

// 	Example Mailing Address
// 	Walt Disney
// 	1180 Seven Seas Drive
// Lake Buena Vista, FL  32836

// Create a PersonMenacheryTester class to do the following in this order.
// Construct an object
// Print the mailing address
// Test your six other methods
// Print the mailing address again
// Construct a few more objects
// Print the number of objects constructed

/**
 * @author Sangeeth Menachery
 * @Since 2/8/2022
 * Precondition: Name is a String, Street is a String, City is a String, State is a String, Zip is a String
 * Postcondition: PersonMenachery object is created and methods are printed
 */
public class PersonMenachery {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private static int numObjects;

    public PersonMenachery(String name, String street, String city, String state, String zip) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        numObjects++;
    }

    public void setState(String name) {
        this.name = name;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getName() {
        return name;
    }

    public String getObjects() {
        return "Objects created: " + PersonMenachery.numObjects;
    }

    public String printAddressString() {
        return "Address is: \n" + name + "\n" + street + "\n" + city + ", " + state + " " + zip;
    }

    public static void main(String[] args) {
        PersonMenachery PersonMenachery = new PersonMenachery("Walt Disney", "1180 Seven Seas Drive", "Lake Buena Vista", "FL", "32836");
        System.out.println(PersonMenachery.printAddressString());
        System.out.println(PersonMenachery.getObjects());
        System.out.println(PersonMenachery.getName());
        PersonMenachery.setZip("32837");
        PersonMenachery.setState("FL");
        PersonMenachery.setCity("Washington DC");
        PersonMenachery.setStreet("1234 Main Street");
        System.out.println(PersonMenachery.printAddressString());
        PersonMenachery PersonMenachery2 = new PersonMenachery("Sangeeth Menachery", "1600 Pennsylvania AVE NW", "Washington D.C.", "Washington D.C.", "000000");
        PersonMenachery PersonMenachery3 = new PersonMenachery("Walt Disney", "1180 Seven Seas Drive", "Lake Buena Vista", "FL", "32836");
        System.out.println(PersonMenachery3.printAddressString());
        System.out.println(PersonMenachery3.getObjects());
    }
}