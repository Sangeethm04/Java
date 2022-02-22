public class PersonMenacheryTester {
    /**
     * Main Method
     * @param args
     */
    public static void main(String[] args) {
        PersonMenachery PersonMenachery4 = new PersonMenachery("Walt Disney", "1180 Seven Seas", "Lake Tahoe", "FL", "32836");
        System.out.println(PersonMenachery4.printAddressString());
        System.out.println(PersonMenachery.getObjects());
        System.out.println(PersonMenachery4.getName());
        PersonMenachery4.setZip("32837");
        PersonMenachery4.setState("FL");
        PersonMenachery4.setCity("Washington DC");
        PersonMenachery4.setStreet("1234 Main Street");
        System.out.println(PersonMenachery4.printAddressString());
        //PersonMenachery PersonMenachery2 = new PersonMenachery("Sangeeth Menachery", "1600 Pennsylvania AVE NW", "Washington D.C.", "Washington D.C.", "000000");
        PersonMenachery PersonMenachery3 = new PersonMenachery("Walt Disney", "1180 Seven Seas Drive", "Bob's", "FL", "32836");
        System.out.println(PersonMenachery3.printAddressString());
        System.out.println(PersonMenachery.getObjects());
    }
}