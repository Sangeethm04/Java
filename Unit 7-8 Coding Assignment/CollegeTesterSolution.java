import java.util.List;
import java.util.ArrayList;

public class CollegeTesterSolution {
	public static void main(String[] args) {
		ArrayList < College > myColleges = new ArrayList < College > ();
		myColleges.add(new College("Colgate University", "NORTHEAST", 27025));
		myColleges.add(new College("Duke University", "SOUTHEAST", 26000));
		myColleges.add(new College("Kalamazoo CollegeSolution", "MIDWEST", 19764));
		myColleges.add(new College("Stanford University", "WEST", 25917));
		myColleges.add(new College("Florida International University", "SOUTHEAST", 10800));
		myColleges.add(new College("Dartmouth CollegeSolution", "NORTHEAST", 27764));
		myColleges.add(new College("Spelman CollegeSolution", "SOUTHEAST", 11455));
		myColleges.add(new College("Rensselaer Polytechnic Institute", "NORTHEAST", 28955));
		myColleges.add(new College("Virginia Tech", "SOUTHEAST", 30000));

		CollegeGroup colleges = new CollegeGroup(myColleges);

		colleges.updateTuition("Rensselaer Polytechnic Institute", 40000);

		System.out.println("*** List of All CollegeSolutions ***");
		colleges.printColleges();

		System.out.println("\n***List of CollegeSolutions in Range #1***");
		ArrayList < College > range1 = colleges.getCollegeList("SOUTHEAST", 11000, 27000);
		for (College c: range1)
			System.out.println(c.getName() + " - " + c.getRegion() + " - " + c.getTuition());

		System.out.println("\n***List of CollegeSolutions in Range #2***");
		ArrayList < College > range2 = colleges.getCollegeList("NORTHEAST", 30000, 50000);
		for (College c: range2)
			System.out.println(c.getName() + " - " + c.getRegion() + " - " + c.getTuition());

		System.out.println("\nIf you did this right, Rensselaer should have tuition of 40000,");
		System.out.println("the original list should print out 9 colleges (formatted correctly),");
		System.out.println("the list of colleges in range #1 should have 2 colleges (Duke and Spelman),");
		System.out.println("the list of colleges in range #2 should have 1 college (Rensselaer),");
	}
}