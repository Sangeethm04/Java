import java.util.List;
import java.util.ArrayList;

public class CollegeTesterSolution {
	public static void main(String[] args) {
		ArrayList < CollegeSolution > myColleges = new ArrayList < CollegeSolution > ();
		myColleges.add(new CollegeSolution("Colgate University", "NORTHEAST", 27025));
		myColleges.add(new CollegeSolution("Duke University", "SOUTHEAST", 26000));
		myColleges.add(new CollegeSolution("Kalamazoo CollegeSolution", "MIDWEST", 19764));
		myColleges.add(new CollegeSolution("Stanford University", "WEST", 25917));
		myColleges.add(new CollegeSolution("Florida International University", "SOUTHEAST", 10800));
		myColleges.add(new CollegeSolution("Dartmouth CollegeSolution", "NORTHEAST", 27764));
		myColleges.add(new CollegeSolution("Spelman CollegeSolution", "SOUTHEAST", 11455));
		myColleges.add(new CollegeSolution("Rensselaer Polytechnic Institute", "NORTHEAST", 28955));
		myColleges.add(new CollegeSolution("Virginia Tech", "SOUTHEAST", 30000));

		CollegeGroupSolution colleges = new CollegeGroupSolution(myColleges);

		colleges.updateTuition("Rensselaer Polytechnic Institute", 40000);

		System.out.println("*** List of All CollegeSolutions ***");
		colleges.printColleges();

		System.out.println("\n***List of CollegeSolutions in Range #1***");
		ArrayList < CollegeSolution > range1 = colleges.getCollegeList("SOUTHEAST", 11000, 27000);
		for (CollegeSolution c: range1)
			System.out.println(c.getName() + " - " + c.getRegion() + " - " + c.getTuition());

		System.out.println("\n***List of CollegeSolutions in Range #2***");
		ArrayList < CollegeSolution > range2 = colleges.getCollegeList("NORTHEAST", 30000, 50000);
		for (CollegeSolution c: range2)
			System.out.println(c.getName() + " - " + c.getRegion() + " - " + c.getTuition());

		System.out.println("\nIf you did this right, Rensselaer should have tuition of 40000,");
		System.out.println("the original list should print out 9 colleges (formatted correctly),");
		System.out.println("the list of colleges in range #1 should have 2 colleges (Duke and Spelman),");
		System.out.println("the list of colleges in range #2 should have 1 college (Rensselaer),");
	}
}