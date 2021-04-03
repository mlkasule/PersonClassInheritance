/**
 * this class represents the student object
 * 
 * @author Mark Kasule
 *
 */
public class Student extends Person {

	final String FRESH_MAN = "Freshman";
	final String SOPHOMORE = "Sophomore";
	final String JUNIOR = "Junior";
	final String SENIOR = "Senior";
	private String status;

	public Student() {
	}

	public Student(String status) {
		this.status = status;
	}

	public Student(Student newStudent) {
		status = newStudent.status;
	}

	public void setStatus(String studentStatus) {
		status = studentStatus;
	}

	public String getStatus() {
		if (status.equalsIgnoreCase("Freshman"))
			status = FRESH_MAN;
		else if (status.equalsIgnoreCase("Sophomore"))
			status = SOPHOMORE;
		else if (status.equalsIgnoreCase("Junior"))
			status = JUNIOR;
		else if (status.equalsIgnoreCase("Senior"))
			status = SENIOR;
		else
			status = "Status Not Known";

		return status;
	}

	public String toString() {
		String str = "Student: " + super.getName() + "\nStatus: " + status + "\nAddress: " + super.getAddress()
				+ "\nPhone number: " + super.getPhoneNumber() + "\nEmail Address: " + super.getEmail();
		return str;
	}

}
