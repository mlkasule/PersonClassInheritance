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
		super(); //call the employee constructor
		officeHours = offHrs;
		rank = newRank;
	}
	public Faculty(String offHrs, String newRank, String wasHired) 
	{
		officeHours = offHrs;
		rank = newRank;
		setDate(wasHired);
	}

	public Faculty(Faculty newFacultyObj) {
		super(newFacultyObj);
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

		String str = "Rank: " + getRank() + "\nSalary: " + super.getSalary() + "\nDate Hired: " + getDate() + "\n" + "\nOffice Hours: "
				+ getOfficeHours() + "\nOffice: " + super.getOfficeNum();

		return str;
	}
}
