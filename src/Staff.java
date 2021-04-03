/**
 * this class represents the staff object
 * 
 * @author casul
 *
 */
public class Staff extends Employee {

	// INSTANCES
	private String title;

	// CONSTRUCTORS
	public Staff() {
	}

	public Staff(String myTitle) {
		title = myTitle;
	}

	public Staff(Staff newStaff) {
		title = newStaff.title;
	}

	// METHODS
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public String toString() {
		String str = "Title: " + title;
		return str;
	}

}
