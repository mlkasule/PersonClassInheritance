/**
 * this class represents the faculty class
 * 
 * @author Mark Kasule
 *
 */
public class Faculty extends Employee {

	// INSTANCES
	private String officeHours;
	private String rank;

	// CONSTRUCTORS
	public Faculty() {
	}

	public Faculty(String offHrs, String newRank) {
		officeHours = offHrs;
		rank = newRank;
	}

	public Faculty(Faculty newFacultyObj) {
		officeHours = newFacultyObj.officeHours;
		rank = newFacultyObj.rank;
	}

	// METHODS
	public void setOfficeHrs(String hrs) {
		officeHours = hrs;
	}

	public void setRank(String staffRank) {
		rank = staffRank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public String getRank() {
		return rank;
	}

	public String toString() {

		String str = "Rank: " + getRank() + "\nSalary: " + super.getSalary() + "\n" + "\nOffice Hours: "
				+ getOfficeHours() + "\nOffice: " + super.getOfficeNum();

		return str;
	}
}
