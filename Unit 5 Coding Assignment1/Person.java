// Create a Person class that will construct a Person object who receives mail.  The objects should have 5 instance variables: name, street, city, state, and zip.  Create one constructor for all five instance variables.  Keep track of how many objects are constructed.  Create two accessor methods to access the name of the Person object and how many objects have been created.  Create four mutator methods to change any of the four parts of a Person object’s address.  Replace the usual toString method with a method that will print the address as it would appear on an envelope.  See example below.

// 	Example Mailing Address
// 	Walt Disney
// 	1180 Seven Seas Drive
// Lake Buena Vista, FL  32836

// Create a PersonTester class to do the following in this order.
// Construct an object
// Print the mailing address
// Test your six other methods
// Print the mailing address again
// Construct a few more objects
// Print the number of objects constructed


public class Person {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private static int numObjects;

    public Person(String name, String street, String city, String state, String zip) {
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
        return "Objects created: " + Person.numObjects;
    }

    public String printAddressString() {
        return "Address is: \n" + name + "\n" + street + "\n" + city + ", " + state + " " + zip;
    }

    public static void main(String[] args) {
        Person person = new Person("Walt Disney", "1180 Seven Seas Drive", "Lake Buena Vista", "FL", "32836");
        System.out.println(person.printAddressString());
        System.out.println(person.getObjects());
        System.out.println(person.getName());
        person.setZip("32837");
        person.setState("FL");
        person.setCity("Washington DC");
        person.setStreet("1234 Main Street");
        System.out.println(person.printAddressString());
        Person person2 = new Person("Sangeeth Menachery", "1600 Pennsylvania AVE NW", "Washington D.C.", "Washington D.C.", "000000");
        Person person3 = new Person("Walt Disney", "1180 Seven Seas Drive", "Lake Buena Vista", "FL", "32836");
        System.out.println(person3.printAddressString());
        System.out.println(person3.getObjects());
    }
}