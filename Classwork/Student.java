public class Student {
	private String lastName; // last name of the student
	private int grade; // current grade: 9,10,11,12
	private double gpa; // current GPA;

	// Write your constructor below with JavaDoc comments
	/**
	 * Constructor for Student class
	 * @param lastName last name of the student
	 * @param grade current grade of the student
	 * @param gpa current GPA of the student
	 */
	public Student(String lastName, int grade, double gpa) {
		this.lastName = lastName;
		this.grade = grade;
		this.gpa = gpa;
	}


	// Write your accessor methods below with JavaDoc comments
	/**
	 * accessor method for lastName
	 * @return last name of the student
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * accessor method for grade
	 * @return current grade of the student
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * accessor method for gpa
	 * @return current GPA of the student
	 */

	public double getGpa() {
		return gpa;
	}

	// Write your mutator methods below with JavaDoc comments
	/**
	 * mutator method for lastName
	 * @param lastName last name of the student
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * mutator method for grade
	 * @param grade current GPA of the student
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * mutator method for gpa
	 * @param gpa current GPA of the student
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
}