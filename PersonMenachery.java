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

    /**
     * Constructor for the PersonMenachery class
     * @param name
     * @param street
     * @param city
     * @param state
     * @param zip
     */
    public PersonMenachery(String name, String street, String city, String state, String zip) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        numObjects++;
    }

    /**
     * sets the state to the value of state
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * sets the street to the value of street
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * sets the city to the value of city
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * sets the zip to the value of zip
     * @param zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * return the name value
     * @return name value returned
     */
    public String getName() {
        return name;
    }

    /**
     * return the num of objects created
     * @return numObjects value returned
     */
    public static String getObjects() {
        return "Objects created: " + PersonMenachery.numObjects;
    }

    /**
     * return the street value
     * @return street value returned
     */
    public String printAddressString() {
        return "Address is: \n" + name + "\n" + street + "\n" + city + ", " + state + " " + zip;
    }
}