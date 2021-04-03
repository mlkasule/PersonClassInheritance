/**
 * My day object class
 * 
 * @author Mark kasule
 *
 */
public class MyDate {

	// INSTANCES
	private String date;

	// CONSTRUCTORS

	public MyDate() {
	}

	public MyDate(String date) {
		this.date = date;
	}

	public MyDate(MyDate newDate) {
		date = newDate.date;
	}

	// METHODS
	public void setDate(String newDate) {
		date = newDate;
	}

	public String getDate() {
		return date;
	}

	public String toString() {
		String str = "Date Hired: " + date + "\n";
		return str;
	}

}
