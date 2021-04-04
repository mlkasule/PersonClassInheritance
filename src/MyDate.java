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


}
